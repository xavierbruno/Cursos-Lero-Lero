<%@ page contentType="text/html;charset=UTF-8" %>
<%@page import="cursolerolero.modelos.Aluno"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
 	<html>
  		<jsp:include page="includes/head.jsp" />

<body>
<jsp:include page="includes/navbar.jsp" />
<div class="title-link-forms">
    <h1 class="title-text ">Links de Formulários</h1>
</div>
<a href="entrada?acao=StaticPage&pageName=formCurso">Incluir</a>
<table class="table table-dark">
    <tbody>
        <tr>
        	<th scope="row">Email</th>
        	<th scope="row">Celular</th>
        	<th scope="row">Endereco</th>
        	<th scope="row">Cidade</th>
        	<th scope="row">Bairro</th>
        	<th scope="row">Cep</th>
        	<th scope="row">Login</th>
        	<th scope="row">Nome</th>
        	<th scope="row">Altera</th>	
        	<th scope="row">Exclui</th>	
        </tr>
         <% List<Aluno> alunos = (List<Aluno>) request.getAttribute("modelos");
            for (Aluno aluno : alunos) { %>
	        <tr>
	        	<td> 	<%=aluno.getEmail()%>		</td>
	        	<td> 	<%=aluno.getCelular() %>		</td>
	        	<td>	<%=aluno.getEndereco() %>	</td>
	        	<td>	<%=aluno.getCidade() %>	</td>
	        	<td>	<%=aluno.getBairro() %>	</td>
	        	<td>	<%=aluno.getCep() %>	</td>
	        	<td>	<%=aluno.getLogin() %>	</td>
	        	<td>	<%=aluno.getNome() %>	</td>
	        	
	        	<td><a href="<%="entrada?acao=StaticPage&pageName=formAluno&id="+aluno.getId() %>"> Alterar</a>	</td>
	        	<td><a href="<%="entrada?acao=ExcluiModelo&modelo=Aluno&id="+aluno.getId() %>"> Excluir</a>	</td>
	        </tr>
       <%}%>
    </tbody>
</table>
</body>
<jsp:include page="includes/footer.jsp" />
</html>ludes/footer.jsp" />
</html>