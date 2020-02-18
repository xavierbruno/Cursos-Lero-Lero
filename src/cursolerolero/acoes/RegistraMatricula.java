package cursolerolero.acoes;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cursolerolero.modelos.Matricula;

public class RegistraMatricula implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		int turmas_id 		= Integer.parseInt( request.getParameter("turmas_id"));
		int alunos_id 		= Integer.parseInt(request.getParameter("alunos_id"));
	

		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date data_matricula = null;
		try {
			data_matricula = format.parse(request.getParameter("data_matricula"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Matricula novoMatricula = new Matricula();
	
		novoMatricula.setTurmas_id(turmas_id);
		novoMatricula.setAlunos_id(alunos_id);
		novoMatricula.setData_matricula(data_matricula);
		novoMatricula.setNota(0.0);
		
	
		
		try {
			novoMatricula.salvarOuAtualizarNoBanco();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "redirect:entrada?acao=StaticPage&pageName=areaAluno";
	}

}
