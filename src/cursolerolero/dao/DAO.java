package cursolerolero.dao;
import java.lang.reflect.Field;
import java.sql.*;
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
           
            String sql = "INSERT INTO ";
            String sqlFinal = " VALUES (";
            String[] attributes = m.getAttributes();
            System.out.println("attributes: " + m.getAttributes());
            System.out.println("getTableName: " + m.getTableName());
            if ( m.getId() == 0 )
            {
                sql = sql + m.getTableName() + "(";
                for (int i = 0; i < attributes.length; i++) 
                {
                    String attribute = attributes[i];
                    System.out.println(attribute);
                    sql = sql + attribute;
                    sqlFinal = sqlFinal + "?";
                    if(i + 1 < attributes.length)
                    {
                        sql = sql + ",";
                        sqlFinal = sqlFinal + ",";
                    }
                    else
                    {
                        sql = sql + ")";
                        sqlFinal = sqlFinal + ")";
                    }

                }
                sql = sql + sqlFinal;
                //INSERT INTO alunos (cpf, email, celular, cep, cidade, bairro, endereco, nome, login, senha) VALUES (?,?,?,?,?,?,?,?,?,?)";
            } else {
                sql = "UPDATE alunos SET cpf=?, email=?, celular=?, cep=?, cidade=?, bairro=?, endereco=?, nome=?, login=?, senha=? WHERE id=?"; 
            }


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

            ps.execute();
            
        } catch( Exception e ) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
    }
    /*
    public List<Optional> getAll(String tableName, String modelName)
    {   
        ArrayList<Optional> resultado = new ArrayList<>();
        try
        {
            Connection conexao = getConexao();
            Statement stmt = conexao.createStatement();       
            ResultSet rs = stmt.executeQuery("select * from "+tableName);
            while( rs.next() ) {
                Class classe = Class.forName(modelName);
                Optional model = (Optional) classe.newInstance();
                
                for (String pa : model.getParams) {
                    model[pa] = 
                }

                //Pega o conteúdo da coluna "codigo" do ResultSet (rs)
                contato.setId(rs.getInt("id") );
                //Pega o conteúdo da coluna "nome" do ResultSet (rs)
                contato.setNome( rs.getString("nome") );
                //Pega o conteúdo da coluna "setor" do ResultSet (rs)
                contato.setIdade(rs.getInt("idade") );
                //Adiciona o objeto criado na ArrayList resultado
                resultado.add(contato);
            }
        } catch( SQLException e ) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
    }
    */


}
