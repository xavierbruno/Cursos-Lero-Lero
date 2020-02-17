package cursolerolero.modelos;
import cursolerolero.acoes.Acao;
import cursolerolero.dao.AdminDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin extends Usuario implements CanBeCreateFromResultSet{
	private String tableName = "administrador";
	
	public String getTableName()
    {
    	return this.tableName;
    }
	
	public void salvarOuAtualizarNoBanco() throws SQLException 
    {
    	AdminDAO.salvarOuAtualizarNoBanco(this);
    }

    public Admin createFromResultSet(ResultSet rs) throws SQLException
    {
        Admin admin = new Admin(); 
        admin.setId(rs.getInt("id") ); 
        admin.setLogin(rs.getString("login") );
        admin.setNome(rs.getString("nome") );
        return admin;
    }
}
