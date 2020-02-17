package cursolerolero.dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import cursolerolero.modelos.Admin;

public class AdminDAO extends DAO {

	public static void salvarOuAtualizarNoBanco(Admin a) throws SQLException 
	{	
		try {
			Connection conexao = getConexao();
			
            String sql;
            if ( a.getId() == 0 ) {
                sql = "INSERT INTO administrador (nome, login, senha) VALUES (?,?,?)";
            } else {
                sql = "UPDATE administrador SET nome=?, login=?, senha=? WHERE id=?"; 
            }
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setString(2, a.getLogin());
            ps.setString(3, a.getSenha());
           
          	
            ps.execute();
            
        } catch( Exception e ) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }
    }
}
