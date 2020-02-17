<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
  <html>
	<jsp:include page="includes/head.jsp" />

	<body>
	<jsp:include page="includes/navbar.jsp" />
	<div class="cont" style="height: 1000px;">
	  <div class="form">
		<form method="POST" action="entrada?acao=RegistraCurso">
			<h1>Adicionar curso</h1>
			<input class="user" type="text" name="nome" placeholder="Nome*" required="" minlength="3" maxlength="50">
			<input class="user" type="text" name="requisito" placeholder="Requisito" minlength="3" maxlength="255">
			<input class="user" type="text" name="emenda" placeholder="Emenda" minlength="3" maxlength="255">
			<input class="user" type="number" name="carga_horaria" max="5" placeholder="Carga horária" minlength="1" maxlength="5">
			<input class="user" type="number" name="preco" placeholder="Preço" >
			<input class="login" type="submit">
		</form>
	  </div>
	</div>
</body>
<jsp:include page="includes/footer.jsp" />
</html>