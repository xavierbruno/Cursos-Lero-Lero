package cursolerolero.dao;

import java.sql.*;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;

import cursolerolero.modelos.Admin;
import cursolerolero.modelos.Aluno;
import cursolerolero.modelos.CanBeCreateFromResultSet;
import cursolerolero.modelos.Instrutor;
import cursolerolero.modelos.Usuario;

public class UsuarioDAO extends DAO {

	public static Optional<Usuario> login(String login, String senha, String tipo)
	{
		String tableName;
		String className;
		System.out.println(tipo);
		if(tipo.equals("aluno"))
		{
			tableName = "alunos";
			className = "Aluno";
		}
		else if (tipo.equals("instrutor"))
		{
			tableName = "instrutores";
			className = "Instrutor";
		}
		else
		{
			tableName = "administrador";
			className = "Admin";
		}
		
		try 
		{

			Connection conexao = getConexao();
			Statement stmt = conexao.createStatement();    
			String sql = "SELECT * FROM " + tableName + " WHERE login='" + login+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			System.out.println(sql);
			//System.out.println(rs.next());
	        
	        if (rs.next()) 
	        {
	        		
        		Usuario usuario = new Usuario();
        		usuario.setTipo(tipo);
        		usuario.setId(rs.getInt("id") ); 
        		usuario.setLogin(rs.getString("login") ); 
		        usuario.setNome(rs.getString("nome") );
		        usuario.setSenha(rs.getString("senha") );

		        System.out.println(usuario.getId());
		        System.out.println(usuario.getSenha());
        		System.out.println(usuario.getNome());
        		System.out.println(usuario.getTipo());

        		if(BCrypt.checkpw(rs.getString("senha"), usuario.getSenha()))
        		{
        			return Optional.of(usuario);
        		}
        		else
        		{	
        			return Optional.empty();
        		}
        		/*
        		if(tipo.equals("aluno"))
				{
					Aluno user = (Aluno) usuario;
					user.createFromResultSet(rs);
				}
				else if (tipo.equals("instrutor"))
				{
					Instrutor user = (Instrutor) usuario;
					user.createFromResultSet(rs);
				}
				else
				{
					Admin user = (Admin) usuario ;
					user.createFromResultSet(rs);
				}
				*/	
			}
	        
		} catch( SQLException e ) {
			 System.out.println("Erro de SQL 99: " + e.getMessage());	 
        }

		return Optional.empty();
	}
}
