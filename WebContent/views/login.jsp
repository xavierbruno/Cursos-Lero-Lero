<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
  <html>
	<jsp:include page="includes/head.jsp" />

	<body>
	<jsp:include page="includes/navbar.jsp" />
	<div class="cont" style="height: 1000px;">
	  <div class="form">
		<form method="POST" action="entrada?acao=Login">
		  <h1>Login</h1>
		  <input 
		  		name="login"
		  		type="text"
				 class="user"
				 placeholder="Username*"/
				 required="">
		  <input 
		  		name="senha"
		  		type="password" 
				 class="pass"
				 placeholder="Password*"/
				 required="">

			<select id="appearance-select" name="tipo" required>
				<option value="admin">Administrador</option>
				<option value="aluno">Aluno</option>
				<option value="instrutor">Instrutor</option>
			</select>

		  <input type="submit" name="" class="login" value="Entrar"> 
		</form>
	  </div>
	</div>
</body>
<jsp:include page="includes/footer.jsp" />
</html>