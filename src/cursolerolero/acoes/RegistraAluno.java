package cursolerolero.acoes;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;

import cursolerolero.modelos.Aluno;
import cursolerolero.modelos.Usuario;

public class RegistraAluno implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Aluno novoAluno = null;
		int id = 0;
		Usuario user = (Usuario) request.getSession().getAttribute("usuarioLogado");
		if(user != null)
			id = user.getId();
		
		
		String cpf	 	= request.getParameter("cpf");
		String nome	 	= request.getParameter("nome");
		String email	= request.getParameter("email");
		String celular	= request.getParameter("celular");
		String login	= request.getParameter("login");
		String senha	= request.getParameter("senha");
		String endereco	= request.getParameter("endereco");
		String cep	 	= request.getParameter("cep");
		String cidade	= request.getParameter("cidade");
		String bairro	= request.getParameter("bairro");
		
		if(id == 0)
			novoAluno = new Aluno();
		else
			novoAluno = (Aluno) Aluno.getById(id);
			
		novoAluno.setCpf(cpf);
		novoAluno.setNome(nome);
		novoAluno.setEmail(email);
		novoAluno.setCelular(celular);
		novoAluno.setLogin(login);
		novoAluno.setSenha(senha);
		novoAluno.setEndereco(endereco);
		novoAluno.setCep(cep);
		novoAluno.setCidade(cidade);
		novoAluno.setBairro(bairro);
		
		try {
			novoAluno.salvarOuAtualizarNoBanco();
			//HttpSession sessao = request.getSession();
            //sessao.setAttribute("usuarioLogado", (Usuario) novoAluno);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "redirect:entrada?acao=Home";
	}

}
