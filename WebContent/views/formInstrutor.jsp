<%@ page contentType="text/html;charset=UTF-8" %>
<%@page import="cursolerolero.modelos.Instrutor"%>
<% 
Instrutor a = null;
if(request.getParameter("id") != null)
	a = (Instrutor) Instrutor.getById(Integer.parseInt(request.getParameter("id"))); 
%>
<!DOCTYPE html>
  <html>
	<jsp:include page="includes/head.jsp" />

	<body>
	<jsp:include page="includes/navbar.jsp" />
	<div class="cont" style="height: 1000px;">
	  <div class="form">
		<form method="POST" action="entrada?acao=RegistraInstrutor">
			<h1>Instrutor</h1>
			<input class="user"  value="<%if (a != null) {%><%=a.getNome()%><%}%>" type="text" 	name="nome" placeholder="Nome*" required="" minlength="3" maxlength="50">
			<input class="user"  value="<%if (a != null) {%><%=a.getEmail()%><%}%>" type="text" 	name="email" placeholder="Email*" required="" minlength="3" maxlength="50">
			<input class="user"  value="<%if (a != null) {%><%=a.getValor_hora()%><%}%>" type="text" 	name="valor_hora" placeholder="Valor hora" minlength="3">
			<input class="user"  value="<%if (a != null) {%><%=a.getExperiencia()%><%}%>" type="text" 	name="experiencia" placeholder="Experiência" minlength="3">
			<input class="user"  value="<%if (a != null) {%><%=a.getLogin()%><%}%>" type="text" 	name="login" placeholder="Login*" required="" minlength="3" maxlength="20">
			<input class="user"  type="password" name="senha" placeholder="Senha*" required="" minlength="3" maxlength="255">
			<input class="login" type="submit">
		</form>
	  </div>
	</div>
</body>
<jsp:include page="includes/footer.jsp" />
</html>