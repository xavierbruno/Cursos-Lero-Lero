package cursolerolero.modelos;

import cursolerolero.modelos.*;
import cursolerolero.dao.*;

public interface Modelo {

	public String modelName = "";
	public String tableName = "";
	public String[] attributes = {};
	
	public String[] getAttributes();
	public String getTableName();
	public void setId(int id);
	public int getId();

	/*
	public Class getDao() throws ClassNotFoundException
	{
		String className = this.getClass().getSimpleName();
		String daoClassName = className + "DAO";
		this.dao = Class.forName(className);
	}

	public void salvarOuAtualizarNoBanco() throws SQLException 
    {
    	AlunoDAO.salvarOuAtualizarNoBanco(this);
    }
    
    public static List<Aluno> getAll()
    {
    	return AlunoDAO.getAll();
    }
    */

}
