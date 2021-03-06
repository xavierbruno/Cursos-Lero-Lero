package cursolerolero.modelos;

import java.sql.ResultSet;
import java.sql.SQLException;

import cursolerolero.dao.AlunoDAO;
import cursolerolero.dao.DAO;

import java.util.List;

public class Aluno extends Usuario{
	public String cpf;
	public String email;
	public String celular;
	public String cep;
	public String cidade;
	public String bairro;
	public String endereco;
	public String comentario;
	public String tableName = "alunos";
    public String[] attributes = { 	"cpf",
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

    public String getTableName()
    {
        return this.tableName;
    }
    
    public String[] getAttributes()
    {
        return this.attributes;
    }
    
    public void salvarOuAtualizarNoBanco() throws SQLException 
    {
    	DAO.salvarOuAtualizarNoBanco(this);
    }
    
    public static List<Modelo> getAll()
    {   
    	return DAO.getAll(new Aluno());
    }


    public static Modelo getById(int id)
    {
        Aluno a = new Aluno();
        return DAO.getById(id, a);
    }
    
    public static void delete(int id)
    {
    	DAO.delete(id, new Aluno());
    }

/*

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


