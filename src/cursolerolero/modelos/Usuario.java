package cursolerolero.modelos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import cursolerolero.dao.UsuarioDAO;

public class Usuario{

	private int id = 0;
	private String login;
	private String nome;
	private String senha;
	private String tipo;

	public static Optional<Usuario> login(String login, String senha, String tipo)
	{
		return UsuarioDAO.login(login, senha, tipo); 
	}


    public int getId() {
        return this.id;
    }

    public int setId(int id) {
    	this.id = id;
        return this.id;
    }
    
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = BCrypt.hashpw(senha, BCrypt.gensalt());
	}

	public String getTipo()
	{
		return this.tipo;
	}

	public void setTipo(String tipo)
	{
		if(tipo != "administrador" || tipo != "aluno" || tipo != "instrutor")
			this.tipo = "aluno";

		this.tipo = tipo;
	}

	/*
	public Usuario createFromResultSet(ResultSet rs) throws SQLException
    {
        Usuario usuario = new Usuario(); 
        usuario.setLogin(rs.getString("login") ); 
        usuario.setNome(rs.getString("nome") );
        usuario.setSenha(rs.getString("senha") );
        return usuario;
    }
    */




	
}