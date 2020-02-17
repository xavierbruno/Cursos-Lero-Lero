package cursolerolero.acoes;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cursolerolero.modelos.Aluno;


public class ListaAlunos implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Aluno> lista = Aluno.getAll();
		request.setAttribute("alunos", lista);
		
		System.out.println(lista.toString());
		
		return "forward:listaAlunos.jsp";
	}

}
