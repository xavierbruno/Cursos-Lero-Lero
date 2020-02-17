package cursolerolero.acoes;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cursolerolero.modelos.Instrutor;
import cursolerolero.modelos.Usuario;

public class RegistraInstrutor implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Instrutor novoInstrutor = null;
		int id = 0;
		Usuario user = (Usuario) request.getSession().getAttribute("usuarioLogado");
		if(user != null)
			id = user.getId();

		String nome	 	= request.getParameter("nome");	
		String login	= request.getParameter("login");
		String senha	= request.getParameter("senha");
		String email	= request.getParameter("email");	
		int valor_hora =  Integer.parseInt(request.getParameter("valor_hora"));
		String experiencia	= request.getParameter("experiencia");
		
		if(id == 0)
			novoInstrutor = new Instrutor();
		else
			novoInstrutor = Instrutor.getById(id);
	
		novoInstrutor.setNome(nome);
		novoInstrutor.setLogin(login);
		novoInstrutor.setSenha(senha);
		novoInstrutor.setEmail(email);
		novoInstrutor.setValor_hora(valor_hora);
		novoInstrutor.setExperiencia(experiencia);
	
		
		try {
			novoInstrutor.salvarOuAtualizarNoBanco();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "redirect:entrada?acao=Home";
	}

}
