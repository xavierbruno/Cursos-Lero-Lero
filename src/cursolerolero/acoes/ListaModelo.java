package cursolerolero.acoes;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cursolerolero.modelos.*;


public class ListaModelo implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String modelo = request.getParameter("modelo");
		List<Modelo> lista = null;
		
		if(modelo.equals("Aluno"))
		{
			lista = Aluno.getAll();
		}
		else if (modelo.equals("Instrutor"))
		{
			lista = Instrutor.getAll();
		}
		else if (modelo.equals("Admin"))
		{
			//lista = Admin.getAll();
		}
		
		
		request.setAttribute("modelos", lista);
		System.out.println(lista.toString());
		
		return "forward:lista" + modelo + ".jsp";
	}

}
