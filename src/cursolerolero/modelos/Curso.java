package cursolerolero.modelos;

import java.sql.SQLException;
import java.util.List;

import cursolerolero.dao.DAO;

public class Curso implements Modelo {
	private int id;
	private String nome;
	private String requisito;
	private String ementa;
	private int carga_horaria;
	private Double preco;	
	
	public 	String tableName = "cursos";
	public  String[] attributes = {
		"nome",
		"requisito",
		"ementa",
		"carga_horaria",
		"preco"
	};

	@Override
	public String[] getAttributes()
    {
        return this.attributes;
    }

	@Override	
	public String getTableName() {
		return this.tableName;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int getId() {
		return this.id;
	}

	public String getNome()
	{
		return this.nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getRequisito()
	{
		return this.requisito;
	}

	public void setRequisito(String requisito)
	{
		 this.requisito = requisito;
	}

	public String getEmenta()
	{
		return this.ementa;
	}


	public void setEmenta(String ementa)
	{
		this.ementa = ementa;
	}

	public int getCarga_horaria()
	{
		return this.carga_horaria;
	}

	public void setCarga_horaria(int carga_horaria)
	{
		this.carga_horaria = carga_horaria;
	}

	public Double getPreco()
	{
		return this.preco;
	}

	public void setPreco(Double preco)
	{
		this.preco = preco;
	}	

	public void salvarOuAtualizarNoBanco() throws SQLException 
    {
    	DAO.salvarOuAtualizarNoBanco(this);
    }
    
    public static List<Modelo> getAll()
    {   
    	return DAO.getAll(new Curso());
    }


    public static Modelo getById(int id)
    {
        Curso a = new Curso();
        return DAO.getById(id, a);
    }
    
    public static void delete(int id)
    {
    	DAO.delete(id, new Curso());
    }

}
