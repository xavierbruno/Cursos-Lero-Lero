package cursolerolero.acoes;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cursolerolero.modelos.Curso;
import cursolerolero.modelos.Instrutor;
import cursolerolero.modelos.Modelo;

public class StaticPage implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("STATIC page");
		String pageName = request.getParameter("pageName");
		List<Modelo> instrutores = null;
		List<Modelo> cursos = null;
		if(pageName.equals("formTurma"))
		{
			System.out.println("IF formTurma");
			instrutores = Instrutor.getAll();
			cursos = Curso.getAll();
			request.setAttribute("instrutores", instrutores);
			request.setAttribute("cursos", cursos);
			
		}
		System.out.println("forward:" + pageName +".jsp");
		return "forward:"+pageName+".jsp";

	}

}
