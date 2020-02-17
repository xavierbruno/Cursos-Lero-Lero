<%@ page contentType="text/html;charset=UTF-8" %>
<%@page import="cursolerolero.modelos.Curso"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
 	<html>
  		<jsp:include page="includes/head.jsp" />

<body>
<jsp:include page="includes/navbar.jsp" />
<div class="title-link-forms">
    <h1 class="title-text ">Cursos</h1>
</div>
<table class="table table-dark">
    <tbody>
        <tr>
        	<th scope="row">Nome</th>
        	<th scope="row">Requisito</th>
        	<th scope="row">Ementa</th>
        	<th scope="row">Carga Horaria</th>
        	<th scope="row">Preço</th>
        </tr>
         <% List<Curso> cursos = (List<Curso>) request.getAttribute("curso");
            for (Aluno curso : cursos) { %>
	        <tr>
	        	<td> 	<%=curso.getNome()%>		 		</td>
	        	<td> 	<%=curso.getRequisito() %>	 		</td>
	        	<td>	<%=curso.getEmenta() %>    			</td>
	        	<td>	<%=curso.getCarga_horaria() %>	    </td>
	        	<td>	<%=curso.getPreco() %>	     		</td>
	        </tr>
       <%}%>
    </tbody>
</table>
</body>
<jsp:include page="includes/footer.jsp" />
</html>