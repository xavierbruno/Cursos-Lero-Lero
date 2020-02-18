<%@ page contentType="text/html;charset=UTF-8" %>
<%@page import="cursolerolero.modelos.Curso"%>

<% 
Curso a = null;
if(request.getParameter ("id") != null)
	a = (Curso) Curso.getById(Integer.parseInt(request.getParameter ("id"))); 
%>
<!DOCTYPE html>
  <html>
	<jsp:include page="includes/head.jsp" />

	<body>
	<jsp:include page="includes/navbar.jsp" />
	<div class="cont" style="height: 1000px;">
	  <div class="form">
		<form method="POST" action="entrada?acao=RegistraCurso">
			<h1>Adicionar curso</h1>
			<input value="<%if (a != null) {%><%=a.getNome()%><%}%>"
					class="user" type="text" name="nome" placeholder="Nome*" required="" minlength="3" maxlength="50">
			<input value="<%if (a != null) {%><%=a.getRequisito()%><%}%>"
					class="user" type="text" name="requisito" placeholder="Requisito" minlength="3" maxlength="255">
			<input value="<%if (a != null) {%><%=a.getEmenta()%><%}%>"
					class="user" type="text" name="ementa" placeholder="Ementa" minlength="3" maxlength="255">
			<input value="<%if (a != null) {%><%=a.getCarga_horaria()%><%}%>"
					class="user" type="number" name="carga_horaria" max="5" placeholder="Carga horária" minlength="1" maxlength="5">
			<input value="<%if (a != null) {%><%=String.valueOf(a.getPreco())%><%}%>"
					class="user" type="number" name="preco" placeholder="Preço" >
			<input class="login" type="submit">
		</form>
	  </div>
	</div>
</body>
<jsp:include page="includes/footer.jsp" />
</html>