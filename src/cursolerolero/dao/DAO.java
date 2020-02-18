package cursolerolero.dao;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import cursolerolero.modelos.Modelo;

public class DAO {

	public static Connection getConexao() throws SQLException 
	{
		Connection conexao = null;
        if ( conexao == null ) {
            try {
                Class.forName("com.mysql.jdbc.Driver");                    
                conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cursolerolero", "root", "");
                System.out.println("Conexão realizada com sucesso!");
            }
            catch( ClassNotFoundException e ) {
                System.out.println(e.getMessage());
            }
        }
        return conexao;
    }

    public static void salvarOuAtualizarNoBanco(Modelo m) throws SQLException  
    {   
        try {
            Connection conexao = getConexao();
           
            String sql = "";
            String sqlFinal = "";
            String separador = "";
            String finalizador = "";
            String[] attributes = m.getAttributes();
            
            if ( m.getId() == 0 )
            {
                sql = "INSERT INTO " + m.getTableName() + "(";
                sqlFinal = " VALUES (";
                separador = ",";
                finalizador = ")";
            }
            else
            {
                sql = "UPDATE " + m.getTableName() + " SET ";
                separador = "=?,";
                finalizador = "=? WHERE id=?";
            }

            

            for (int i = 0; i < attributes.length; i++) 
            {
                sql = sql + attributes[i];
                sqlFinal = sqlFinal + "?";
                if(i + 1 < attributes.length)
                {
                    sql = sql + separador;
                    sqlFinal = sqlFinal + ",";
                }
                else
                {
                    sql = sql + finalizador;
                    sqlFinal = sqlFinal + finalizador;
                    if (m.getId() == 0)
                        sql = sql + sqlFinal;
                }

            }
            
            //System.out.println(sql);
            //INSERT INTO alunos (cpf, email, celular, cep, cidade, bairro, endereco, nome, login, senha) VALUES (?,?,?,?,?,?,?,?,?,?)";
            // "UPDATE alunos SET cpf=?, email=?, celular=?, cep=?, cidade=?, bairro=?, endereco=?, nome=?, login=?, senha=? WHERE id=?"; 
           
            PreparedStatement ps = conexao.prepareStatement(sql);
            for (int i = 1; i <= attributes.length; i++) 
            {
            	Class<?> c = m.getClass();
            	Field f = null;
            	try
            	{
            		f = c.getDeclaredField(attributes[i-1]);
            	}catch(Exception e)
            	{
            		c = c.getSuperclass();
            		f = c.getDeclaredField(attributes[i-1]);
            	}
            	
            	f.setAccessible(true);
            	if( f.get(m).getClass() == Integer.class)
            		ps.setInt(i, (int) f.get(m));
            	else
            		ps.setString(i, (String) f.get(m));
            }

            if(m.getId() != 0 )
                ps.setInt(attributes.length + 1, m.getId());


            ps.execute();
            
        } catch( Exception e ) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
    }
    

    public static List<Modelo> getAll(Modelo m)
    {   
    	System.out.println("getAll");
    	List<Modelo> resultado = new ArrayList<>();
        String[] attributes = m.getAttributes();
        try
        {
            Connection conexao = getConexao();
            Statement stmt = conexao.createStatement();       
            ResultSet rs = stmt.executeQuery("select * from "+m.getTableName());
            while( rs.next() ) {

                Class classe = m.getClass();
                Modelo model = (Modelo) classe.newInstance();
                
                for (int i = 0; i < attributes.length; i++) 
                {
                    Class<?> c = model.getClass();
                    Field f = null;
                    try
                    {
                        f = c.getDeclaredField(attributes[i]);
                    }
                    catch(Exception e)
                    {
                        c = c.getSuperclass();
                        f = c.getDeclaredField(attributes[i]);
                    }
                    
                    f.setAccessible(true);
                    f.set(model, rs.getString(attributes[i]));
                }
                
                resultado.add(model);
            }
        } catch( Exception e ) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        
        return resultado;
    }
    
    public static Modelo getById(int id, String tableName, Class className, String[] attributes)
    {
        Modelo modelo = null;
        try 
        {        
            Connection conexao = getConexao();
            Statement stmt = conexao.createStatement();    
            ResultSet rs = stmt.executeQuery("select * from " + tableName + " where id='" + id +"'");

            if(rs.next())
            {
                Class classe = className;
                modelo = (Modelo) classe.newInstance();
                
                for (int i = 0; i < attributes.length; i++) 
                {
                    Class<?> c = modelo.getClass();
                    Field f = null;
                    try
                    {
                        f = c.getDeclaredField(attributes[i]);
                    }
                    catch(Exception e)
                    {
                        c = c.getSuperclass();
                        f = c.getDeclaredField(attributes[i]);
                    }
                    
                    f.setAccessible(true);
                    f.set(modelo, rs.getString(attributes[i]));
                }

                //modelo.setId(rs.getInt("id") ); 
                //modelo.setCpf(rs.getString("cpf") ); 
                //modelo.setEmail( rs.getString("email") );
                //modelo.setCelular(rs.getString("celular") );
                //modelo.setEndereco(rs.getString("endereco") ); 
                //modelo.setCidade( rs.getString("cidade") );
                //modelo.setBairro(rs.getString("bairro") );
                //modelo.setCep(rs.getString("cep") ); 
                //modelo.setLogin(rs.getString("login") );
                //modelo.setNome(rs.getString("nome") );
                //modelo.setSenha(rs.getString("senha") );
            }
            
        }
        catch( Exception e ) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        //System.out.println("modelo");
        //System.out.println(modelo);
        return modelo;
    }


}
