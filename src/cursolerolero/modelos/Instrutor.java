package cursolerolero.modelos;

import java.sql.ResultSet;
import java.sql.SQLException;

import cursolerolero.dao.InstrutorDAO;

public class Instrutor extends Usuario implements CanBeCreateFromResultSet{

	private String email;
	private int valor_hora;
	private String experiencia;

	public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(int valor_hora) {
        this.valor_hora = valor_hora;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public void salvarOuAtualizarNoBanco() throws SQLException 
    {
    	InstrutorDAO.salvarOuAtualizarNoBanco(this);
    }

    public static Instrutor getById(int id)
    {
        return InstrutorDAO.getById(id);
    }

    public Instrutor createFromResultSet(ResultSet rs) throws SQLException
    {
    	Instrutor instrutor = new Instrutor(); 
        instrutor.setId(rs.getInt("id") ); 
        instrutor.setEmail( rs.getString("email") );
        instrutor.setExperiencia(rs.getString("experiencia") );
        instrutor.setValor_hora(rs.getInt("valor_hora") ); 
        instrutor.setLogin(rs.getString("login") );
        instrutor.setNome(rs.getString("nome") );
        return instrutor;
    }
}
