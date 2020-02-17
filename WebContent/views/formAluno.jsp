<%@ page contentType="text/html;charset=UTF-8" %>
<%@page import="cursolerolero.modelos.Aluno"%>

<% 
Aluno a = null;
if(request.getParameter ("id") != null)
	a = Aluno.getById(Integer.parseInt(request.getParameter ("id"))); 
%>
<!DOCTYPE html>
  <html>
	<jsp:include page="includes/head.jsp" />

	<body>
	<jsp:include page="includes/navbar.jsp" />
	<div class="cont" style="height: 1000px;">
	  <div class="form">
		<form method="POST" action="entrada?acao=RegistraAluno">
			<h1>Aluno</h1>
			<input class="user" value="<%if (a != null) {%><%=a.getCpf()%><%}%>" type="text" 	name="cpf" placeholder="Cpf*" required minlength="11" maxlength="11">
			<input class="user" value="<%if (a != null) {%><%=a.getNome()%><%}%>" type="text" 	name="nome" placeholder="Nome*" required minlength="3" maxlength="50">
			<input class="user" value="<%if (a != null) {%><%=a.getEmail()%><%}%>" type="text" 	name="email" placeholder="Email*" required minlength="3" maxlength="50">
			<input class="user" value="<%if (a != null) {%><%=a.getCelular()%><%}%>" type="text" 	name="celular" placeholder="Celular*" required minlength="8" maxlength="14">
			<input class="user" value="<%if (a != null) {%><%=a.getEndereco()%><%}%>" type="text" 	name="endereco" placeholder="Endereço" minlength="3" maxlength="50">
			<input class="user" value="<%if (a != null) {%><%=a.getCep()%><%}%>" type="text" 	name="cep" placeholder="CEP" minlength="9"  maxlength="9">
			<input class="user" value="<%if (a != null) {%><%=a.getCidade()%><%}%>" type="text" 	name="cidade" placeholder="Cidade" minlength="3" maxlength="30">
			<input class="user" value="<%if (a != null) {%><%=a.getBairro()%><%}%>" type="text" 	name="bairro" placeholder="Bairro" minlength="3" maxlength="30">
			<input class="user" value="<%if (a != null) {%><%=a.getLogin()%><%}%>" type="text" 	name="login" placeholder="Login*" required="" minlength="3" maxlength="14">
			<input class="user" type="password" name="senha" placeholder="Senha*" required="" minlength="3"  maxlength="255">

			<input class="login" type="submit">
		</form>
	  </div>
	</div>
</body>
<jsp:include page="includes/footer.jsp" />
</html>