package cursolerolero.modelos;

import cursolerolero.modelos.*;
import cursolerolero.dao.*;

public class Modelo {

	private Class dao;
	private String modelName;

	public Class getDao()
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

}
