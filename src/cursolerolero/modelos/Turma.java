package cursolerolero.modelos;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import cursolerolero.dao.DAO;

public class Turma implements Modelo {

	private int id;
	private int instrutores_id;
	private int cursos_id;
	private Date data_inicio;
	private Date data_final;
	private int carga_horaria;	
	
	public 	String tableName = "turmas";
	public  String[] attributes = {
		"instrutores_id",
		"cursos_id",
		"data_inicio",
		"data_final",
		"carga_horaria"
	};


	
	
	
	public int getInstrutores_id()
	{
		return this.instrutores_id;
	}
	public int getCursos_id()
	{
		return this.cursos_id;
	}
	public Date getData_inicio()
	{
		return this.data_inicio;
	}
	public Date getData_final()
	{
		return this.data_final;
	}
	public int getCarga_horaria()
	{
		return this.carga_horaria;
	}
	public void setInstrutores_id(int instrutores_id)
	{
		this.instrutores_id = instrutores_id;
	}
	public void setCursos_id(int cursos_id)
	{
		this.cursos_id = cursos_id;
	}
	public void setData_inicio(Date data_inicio)
	{
		this.data_inicio = data_inicio;
	}
	public void setData_final(Date data_final)
	{
		this.data_final = data_final;
	}
	public void setCarga_horaria(int carga_horaria)
	{
		this.carga_horaria = carga_horaria;
	}

	@Override
	public String[] getAttributes() {
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

	public void salvarOuAtualizarNoBanco() throws SQLException 
    {
    	DAO.salvarOuAtualizarNoBanco(this);
    }
    
    public static List<Modelo> getAll()
    {   
    	return DAO.getAll(new Turma());
    }


    public static Modelo getById(int id)
    {
        Turma a = new Turma();
        return DAO.getById(id, a);
    }
    
    public static void delete(int id)
    {
    	DAO.delete(id, new Turma());
    }

}
