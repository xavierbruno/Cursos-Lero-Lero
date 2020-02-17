package cursolerolero.acoes;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cursolerolero.modelos.Admin;

public class RegistraAdmin implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	
		String nome	 	= request.getParameter("nome");	
		String login	= request.getParameter("login");
		String senha	= request.getParameter("senha");
		

		Admin novoAdmin = new Admin();
	
		novoAdmin.setNome(nome);
		novoAdmin.setLogin(login);
		novoAdmin.setSenha(senha);
	
		
		try {
			novoAdmin.salvarOuAtualizarNoBanco();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "redirect:entrada?acao=Home";
	}

}
