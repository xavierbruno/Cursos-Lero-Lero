package cursolerolero.modelos;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import cursolerolero.dao.DAO;

public class Matricula implements Modelo {

	private int id;
	private int turmas_id;
	private int alunos_id;
	private Date data_matricula;
	private Double nota;
	public 	String tableName = "matriculas";
	public  String[] attributes = {
		"turmas_id",
		"alunos_id",
		"data_matricula",
		"nota",
	};

	public void setTurmas_id(int turmas_id)
	{
		this.turmas_id = turmas_id;
	}
	public void setAlunos_id(int alunos_id)
	{
		this.alunos_id = alunos_id;
	}
	public void setData_matricula(Date data_matricula)
	{
		this.data_matricula = data_matricula;
	}
	public void setNota(Double nota)
	{
		this.nota = nota;
	}
	public int getTurmas_id()
	{
		return this.turmas_id;

	}
	public int getAlunos_id()
	{
		return this.alunos_id;
	}
	public Date getData_matricula()
	{
		return this.data_matricula;
	}
	public Double getNota()
	{
		return this.nota;
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
