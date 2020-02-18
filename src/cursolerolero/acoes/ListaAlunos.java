package cursolerolero.acoes;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cursolerolero.modelos.Aluno;
import cursolerolero.modelos.Modelo;


public class ListaAlunos implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Modelo> lista = Aluno.getAll();
		request.setAttribute("alunos", lista);
		
		System.out.println(lista.toString());
		
		return "forward:listaAlunos.jsp";
	}

}
