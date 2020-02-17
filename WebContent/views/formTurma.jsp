<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
  <html>
	<jsp:include page="includes/head.jsp" />

	<body>
	<jsp:include page="includes/navbar.jsp" />
	<div class="cont" style="height: 1000px;">
	  <div class="form">
		<form method="POST" action="entrada?acao=RegistraTurma">
			<h1>Criar turma</h1>

			<select id="appearance-select" name="instrutor_id" required="">
			<option value="">Selecione um instrutor*</option>
			<option value="1">instrutor 1</option>
			<option value="2">instrutor 2</option>
			<option value="3">instrutor 3</option>
			</select>

			<select id="appearance-select" name="cursos_id" required="">
			<option value="">Selecione um curso*</option>
			<option value="1">curso 1</option>
			<option value="2">curso 2</option>
			<option value="3">curso 3</option>
			</select>

			<input class="user" type="date" name="data_inicio" placeholder="Data início" pattern="^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{4}$">
			<input class="user" type="date" name="data_fim" placeholder="Data fim" pattern="^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{4}$">


			<input class="user" type="number" name="carga_horaria"  placeholder="Carga horária" max="5">
			<input class="login" type="submit">
		</form>
	  </div>
	</div>
</body>
<jsp:include page="includes/footer.jsp" />
</html>