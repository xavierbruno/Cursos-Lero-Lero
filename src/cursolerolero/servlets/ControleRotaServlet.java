package cursolerolero.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cursolerolero.acoes.Acao;

@WebServlet("/entrada")
public class ControleRotaServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String paramAcao = request.getParameter("acao");
		String nomeDaClasse = "cursolerolero.acoes." + paramAcao;
		String retorno;
		try {
			Class classe = Class.forName(nomeDaClasse);
			Acao acao = (Acao) classe.newInstance();
			retorno = acao.executa(request,response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}
		
		String[] retornoData = retorno.split(":");
		if(retornoData[0].equals("forward")) 
		{
			RequestDispatcher rd = request.getRequestDispatcher("views/" + retornoData[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(retornoData[1]);
		}
	}
}
