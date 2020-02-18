package cursolerolero.acoes;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cursolerolero.modelos.Curso;

public class RegistraCurso implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String nome	 		= request.getParameter("nome");	
		String requisito	= request.getParameter("requisito");
		String ementa		= request.getParameter("ementa");
		int carga_horaria	= Integer.parseInt(request.getParameter("carga_horaria"));
		Double preco		= Double.parseDouble(request.getParameter("preco"));



		Curso novoCurso = new Curso();
	
		novoCurso.setNome(nome);
		novoCurso.setRequisito(requisito);
		novoCurso.setEmenta(ementa);
		novoCurso.setCarga_horaria(carga_horaria);
		novoCurso.setPreco(preco);
	
		
		try {
			novoCurso.salvarOuAtualizarNoBanco();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "redirect:entrada?acao=ListaModelo&modelo=Curso";
	}

}
