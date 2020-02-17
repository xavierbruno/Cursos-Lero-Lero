<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
  <html>
	<jsp:include page="includes/head.jsp" />

	<body>
	<jsp:include page="includes/navbar.jsp" />
	<div class="cont" style="height: 1000px;">
	  <div class="form">
		<form method="POST" action="entrada?acao=RegistraTurma">
			<h1>Criar matrícula</h1>

			<select id="appearance-select" name="turma" required>
			<option value="" >Selecione uma turma*</option>
			<option value="1">Turma 1</option>
			<option value="2">Turma 2</option>
			<option value="3">Turma 3</option>
			</select>

			<select id="appearance-select" name="turma" required>
			<option value="">Selecione um aluno*</option>
			<option value="1">aluno 1</option>
			<option value="2">aluno 2</option>
			<option value="3">aluno 3</option>
			</select>

			<input class="user" type="date" name="data_matricula" placeholder="Data da matrícula" pattern="^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{4}$">
			<input class="user" type="number" name="nota"  placeholder="Nota" step="0.1" max="10">
			<input class="login" type="submit">
		</form>
	  </div>
	</div>
</body>
<jsp:include page="includes/footer.jsp" />
</html>