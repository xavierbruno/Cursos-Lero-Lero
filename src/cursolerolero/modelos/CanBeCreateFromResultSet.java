package cursolerolero.modelos;

import java.sql.ResultSet;
import java.sql.SQLException;

import cursolerolero.modelos.Usuario;

public interface CanBeCreateFromResultSet {
	
	public Usuario createFromResultSet(ResultSet rs) throws SQLException;
}
