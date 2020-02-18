package cursolerolero.servlets;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/entrada")
public class LoginFilter implements Filter {


	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        
        String paramAcao = req.getParameter("acao");
        HttpSession sessao = req.getSession();
        
        
		boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado") == null);
		boolean ehUmaAcaoProtegida = !(	paramAcao.equals("Home") 	|| 
										paramAcao.equals("Login") 	|| 
										paramAcao.equals("RegistraAluno") 	|| 
										paramAcao.equals("RegistraInstrutor") 	|| 
										paramAcao.equals("RegistraAdmin") 	|| 
										(paramAcao.equals("StaticPage") && req.getParameter("pageName").equals("listaComentarios")) 	||
										(paramAcao.equals("StaticPage") && req.getParameter("pageName").equals("formAdmin")) 	||
										(paramAcao.equals("StaticPage") && req.getParameter("pageName").equals("formInstrutor")) ||
										(paramAcao.equals("StaticPage") && req.getParameter("pageName").equals("formAluno")) 	||
										(paramAcao.equals("StaticPage") && req.getParameter("pageName").equals("sobre")) 	|| 
										(paramAcao.equals("StaticPage") && req.getParameter("pageName").equals("login")) ||
										(paramAcao.equals("StaticPage") && req.getParameter("pageName").equals("registro"))
										);

		System.out.println(sessao.getAttribute("usuarioLogado"));
		if(ehUmaAcaoProtegida && usuarioNaoEstaLogado) {
			resp.sendRedirect("entrada?acao=StaticPage&pageName=login");
			return;
		}
		// pass the request along the filter chain
		chain.doFilter(req, resp);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
