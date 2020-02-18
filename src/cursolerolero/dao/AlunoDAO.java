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
    */
}
