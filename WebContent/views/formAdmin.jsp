<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
  <html>
	<jsp:include page="includes/head.jsp" />

	<body>
	<jsp:include page="includes/navbar.jsp" />
	<div class="cont" style="height: 1000px;">
	  <div class="form">
		<form method="POST" action="entrada?acao=RegistraAdmin">
			<h1>Admnistrador</h1>
			<input class="user" type="text" name="nome" placeholder="Nome*" required="" minlength="3"  maxlength="50">
			<input class="user" type="text" name="login" placeholder="Login*" required="" minlength="3"  maxlength="50">
			<input class="user" type="password" name="senha" placeholder="Senha*" required="" minlength="3"  maxlength="255">
			<input class="login" type="submit">
		</form>
	  </div>
	</div>
</body>
<jsp:include page="includes/footer.jsp" />
</html>