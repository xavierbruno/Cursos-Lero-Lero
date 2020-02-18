package cursolerolero.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cursolerolero.modelos.*;

public class ExcluiModelo implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String modelo = request.getParameter("modelo");
		int id = Integer.parseInt( request.getParameter("id"));
		
		
		if(modelo.equals("Aluno"))
		{
			Aluno.delete(id);
		}
		else if (modelo.equals("Instrutor"))
		{
			Instrutor.delete(id);
		}
		else if (modelo.equals("Curso"))
		{
			Curso.delete(id);
		}
		else if (modelo.equals("Turma"))
		{
			Turma.delete(id);
		}
		
		return "redirect:entrada?acao=ListaModelo&modelo=" + modelo;
	}

}
