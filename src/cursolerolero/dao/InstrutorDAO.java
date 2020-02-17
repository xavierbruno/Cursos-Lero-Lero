package cursolerolero.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import cursolerolero.modelos.Instrutor;


public class InstrutorDAO extends DAO {
	
	/*
	public static void salvarOuAtualizarNoBanco(Instrutor a) throws SQLException 
	{	
		try {
			Connection conexao = getConexao();
			
            String sql;
            if ( a.getId() == 0 ) {
                sql = "INSERT INTO instrutores (nome, email, valor_hora, experiencia, login, senha) VALUES (?,?,?,?,?,?)";
            } else {
                sql = "UPDATE instrutores SET nome=?, email=?, valor_hora=?, experiencia=?, login=?, senha=? WHERE id=?"; 
            }
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setString(2, a.getEmail());
            ps.setInt(3, a.getValor_hora());
            ps.setString(4, a.getExperiencia());
            ps.setString(5, a.getLogin());
            ps.setString(6, a.getSenha());
          	
            if(a.getId() != 0)
                ps.setInt(7, a.getId());

            ps.execute();
            
        } catch( Exception e ) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
    }
    */

    public static Instrutor getById(int id)
    {
        Instrutor instrutor = null;
        try 
        {        
            Connection conexao = getConexao();
            Statement stmt = conexao.createStatement();    
            ResultSet rs = stmt.executeQuery("select * from instrutores where id='" + id +"'");

            if(rs.next())
            {
                instrutor = new Instrutor();
                
                instrutor.setId(rs.getInt("id") ); 
                instrutor.setNome(rs.getString("nome") ); 
                instrutor.setEmail( rs.getString("email") );
                instrutor.setValor_hora(rs.getInt("valor_hora") );
                instrutor.setExperiencia(rs.getString("experiencia") ); 
                instrutor.setLogin(rs.getString("login") );
                instrutor.setSenha(rs.getString("senha") );
            }
            
        }
        catch( SQLException e ) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        return instrutor;
    }
}
