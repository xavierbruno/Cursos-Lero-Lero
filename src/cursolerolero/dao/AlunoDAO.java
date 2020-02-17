package cursolerolero.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.Statement; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 

import cursolerolero.modelos.Aluno;

public class AlunoDAO extends DAO{ 
	
    /*
	public static void salvarOuAtualizarNoBanco(Aluno a) throws SQLException 
	{	
		try {
			Connection conexao = getConexao();
			
            String sql;
            if ( a.getId() == 0 ) {
                sql = "INSERT INTO alunos (cpf, email, celular, cep, cidade, bairro, endereco, nome, login, senha) VALUES (?,?,?,?,?,?,?,?,?,?)";
            } else {
                sql = "UPDATE alunos SET cpf=?, email=?, celular=?, cep=?, cidade=?, bairro=?, endereco=?, nome=?, login=?, senha=? WHERE id=?"; 
            }
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, a.getCpf());
            ps.setString(2, a.getEmail());
            ps.setString(3, a.getCelular());
            ps.setString(4, a.getCep());
            ps.setString(5, a.getCidade());
            ps.setString(6, a.getBairro());
            ps.setString(7, a.getEndereco());
            ps.setString(8, a.getNome());
            ps.setString(9, a.getLogin());
            ps.setString(10, a.getSenha());
            
            if(a.getId() != 0)
            	ps.setInt(11, a.getId());
            
          	
            ps.execute();
            
        } catch( Exception e ) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
    }
    */

    public static List<Aluno> getAll() {
        List<Aluno> resultado = new ArrayList<>();
        try {        
        	Connection conexao = getConexao();
            Statement stmt = conexao.createStatement();    
            ResultSet rs = stmt.executeQuery("select * from alunos");
           
            while( rs.next() ) {
        
                Aluno aluno = new Aluno();
                 
                aluno.setId(rs.getInt("id") ); 
                aluno.setCpf(rs.getString("cpf") ); 
                aluno.setEmail( rs.getString("email") );
                aluno.setCelular(rs.getString("celular") );
                aluno.setEndereco(rs.getString("endereco") ); 
                aluno.setCidade( rs.getString("cidade") );
                aluno.setBairro(rs.getString("bairro") );
                aluno.setCep(rs.getString("cep") ); 
                aluno.setLogin(rs.getString("login") );
                aluno.setNome(rs.getString("nome") );
                aluno.setSenha(rs.getString("senha") );
                resultado.add(aluno);
            }
        } catch( SQLException e ) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
       
        return resultado;
    }

    public static Aluno getById(int id)
    {
        Aluno aluno = null;
        try 
        {        
            Connection conexao = getConexao();
            Statement stmt = conexao.createStatement();    
            ResultSet rs = stmt.executeQuery("select * from alunos where id='" + id +"'");

            if(rs.next())
            {
                aluno = new Aluno();
            
                aluno.setId(rs.getInt("id") ); 
                aluno.setCpf(rs.getString("cpf") ); 
                aluno.setEmail( rs.getString("email") );
                aluno.setCelular(rs.getString("celular") );
                aluno.setEndereco(rs.getString("endereco") ); 
                aluno.setCidade( rs.getString("cidade") );
                aluno.setBairro(rs.getString("bairro") );
                aluno.setCep(rs.getString("cep") ); 
                aluno.setLogin(rs.getString("login") );
                aluno.setNome(rs.getString("nome") );
                aluno.setSenha(rs.getString("senha") );
            }
            
        }
        catch( SQLException e ) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
        System.out.println("aluno2");
        System.out.println(aluno);
        return aluno;
    }
}
