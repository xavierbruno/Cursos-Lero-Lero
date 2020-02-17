package cursolerolero.acoes;
import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import cursolerolero.modelos.*;


public class Login implements Acao {
	
	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String tipo = request.getParameter("tipo");
		
		Optional<Usuario> user = Usuario.login(login, senha, tipo);
		System.out.println(user);
		if(user.isPresent()) {
			System.out.println("Usuario existe");
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuarioLogado", user.get());
			return "redirect:entrada?acao=Home";
		} else {
			return "redirect:entrada?acao=StaticPage&pageName=login";
		}
		
		
	}
}
