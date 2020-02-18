package cursolerolero.acoes;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cursolerolero.modelos.Turma;

public class RegistraTurma implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		int instrutores_id	 	= Integer.parseInt(request.getParameter("instrutores_id"));	
		int cursos_id			= Integer.parseInt(request.getParameter("cursos_id"));
		int carga_horaria		= Integer.parseInt(request.getParameter("carga_horaria"));
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date data_inicio = null;
		Date data_final = null;
		
		try {
			data_inicio = format.parse(request.getParameter("data_inicio"));
			data_final	= format.parse(request.getParameter("data_final"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		



		Turma novoTurma = new Turma();
	
		novoTurma.setInstrutores_id(instrutores_id);
		novoTurma.setCursos_id(cursos_id);
		novoTurma.setData_inicio(data_inicio);
		novoTurma.setData_final(data_final);
		novoTurma.setCarga_horaria(carga_horaria);
	
		
		try {
			novoTurma.salvarOuAtualizarNoBanco();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "redirect:entrada?acao=ListaModelo&modelo=Turma";
	}

}
