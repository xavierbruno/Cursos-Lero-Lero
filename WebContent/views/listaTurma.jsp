<%@ page contentType="text/html;charset=UTF-8" %>
<%@page import="cursolerolero.modelos.Turma"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
 	<html>
  		<jsp:include page="includes/head.jsp" />

<body>
<jsp:include page="includes/navbar.jsp" />
<div class="title-link-forms">
    <h1 class="title-text ">Turmas</h1>
</div>
<a href="entrada?acao=StaticPage&pageName=formTurma">Incluir</a>
<table class="table table-dark">
    <tbody>
        <tr>
        	<th scope="row">Nome</th>
        	<th scope="row">Requisito</th>
        	<th scope="row">Ementa</th>
        	<th scope="row">Carga Horaria</th>
        	<th scope="row">Preço</th>
          <th scope="row">Altera</th> 
          <th scope="row">Exclui</th> 
        </tr>
         <% List<Turma> turmas = (List<Turma>) request.getAttribute("modelos");
            for (Turma turma : turmas) { %>
	        <tr>
	        	<td> 	<%=String.valueOf(turma.getInstrutorNome())%>		 		</td>
	        	<td> 	<%=String.valueOf(turma.getCursoNome()) %>	 		</td>
	        	<td>	<%=String.valueOf(turma.getData_inicio()) %>    			</td>
	        	<td>	<%=String.valueOf(turma.getData_final()) %>	    </td>
	        	<td>	<%=String.valueOf(turma.getCarga_horaria()) %>	     		</td>
            <td><a href="<%="entrada?acao=StaticPage&pageName=formTurma&id="+turma.getId() %>"> Alterar</a> </td>
            <td><a href="<%="entrada?acao=ExcluiModelo&modelo=Turma&id="+turma.getId() %>"> Excluir</a> </td>
	        </tr>
       <%}%>
    </tbody>
</table>
</body>
<jsp:include page="includes/footer.jsp" />
</html>