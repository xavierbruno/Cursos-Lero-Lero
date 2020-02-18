package cursolerolero.modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cursolerolero.dao.AlunoDAO;
import cursolerolero.dao.InstrutorDAO;
import cursolerolero.dao.DAO;

public class Instrutor extends Usuario {

	private String email;
	private int valor_hora;
	private String experiencia;
	private String tableName = "instrutores";
    private  String[] attributes = { "nome",
                                    "email",
                                    "valor_hora",
                                    "login",
                                    "senha",
                                    "experiencia"
                                  	};
    
    public String getTableName()
    {
    	return this.tableName;
    }
    
    public String[] getAttributes()
    {
        return this.attributes;
    }

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

    public static Modelo getById(int id)
    {
        Instrutor i = new Instrutor();
        return DAO.getById(id, i);
    }
    
    public static List<Modelo> getAll()
    {   
    	return DAO.getAll(new Instrutor());
    }
    
    public static void delete(int id)
    {
    	DAO.delete(id, new Instrutor());
    }

}
