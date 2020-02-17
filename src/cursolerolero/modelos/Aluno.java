package cursolerolero.modelos;

import java.sql.ResultSet;
import java.sql.SQLException;

import cursolerolero.dao.AlunoDAO;

import java.util.List;

public class Aluno extends Usuario implements CanBeCreateFromResultSet{
	private String cpf;
	private String email;
	private String celular;
	private String cep;
	private String cidade;
	private String bairro;
    private String endereco;
    private String comentario;
    public  String[] atributes = { "cpf",
                                    "email",
                                    "celular",
                                    "cep",
                                    "cidade",
                                    "bairro",
                                    "endereco",
                                    "nome",
                                    "login",
                                    "senha"};

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public void salvarOuAtualizarNoBanco() throws SQLException 
    {
    	AlunoDAO.salvarOuAtualizarNoBanco(this);
    }
    
    public static List<Aluno> getAll()
    {
    	return AlunoDAO.getAll();
    }

    public Aluno createFromResultSet(ResultSet rs) throws SQLException
    {
        Aluno aluno = new Aluno(); 
        aluno.setId(rs.getInt("id") ); 
        aluno.setEmail( rs.getString("email") );
        aluno.setCelular(rs.getString("celular") );
        aluno.setEndereco(rs.getString("endereco") ); 
        aluno.setCidade( rs.getString("cidade") );
        aluno.setBairro(rs.getString("bairro") );
        aluno.setCep(rs.getString("cep") ); 
        aluno.setLogin(rs.getString("login") );
        aluno.setNome(rs.getString("nome") );
        return aluno;
    }

    public static Aluno getById(int id)
    {
        return AlunoDAO.getById(id);
    }

/*
    public List<String> getParams()
    {
        return List<String> parametros = [
        "cpf",
        "email",
        "celular",
        "cep",
        "cidade",
        "bairro",
        "endereco",
        "comentario",
        "login",
        "nome",
        "senha"];    
    }
*/
}


