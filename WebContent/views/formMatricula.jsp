<%@ page contentType="text/html;charset=UTF-8" %>
<%@page import="cursolerolero.modelos.Aluno"%>
<%@page import="cursolerolero.modelos.Turma"%>
<%@page import="cursolerolero.modelos.Matricula"%>
<%@page import="java.util.List"%>
<% 
Matricula a = null;
if(request.getParameter ("id") != null)
	a = (Matricula) Matricula.getById(Integer.parseInt(request.getParameter ("id"))); 
%>
<!DOCTYPE html>
  <html>
	<jsp:include page="includes/head.jsp" />

	<body>
	<jsp:include page="includes/navbar.jsp" />
	<div class="cont" style="height: 1000px;">
	  <div class="form">
		<form method="POST" action="entrada?acao=RegistraMatricula">
			<h1>Criar matrícula</h1>

			<select id="appearance-select" name="turmas_id" required>
			<option value="" >Selecione uma turma*</option>
			<%  List<Turma> turmas = (List<Turma>) request.getAttribute("turmas");
				for (Turma turma : turmas) { %>
				<option ${turma.getId() == a.getTurmas_id() ? 'selected="selected"' : ''}  
				 value="<%=turma.getId()%>"><%=turma.getNome()%></option>
			<%}%>
			</select>

			<select id="appearance-select" name="alunos_id" required>
			<option value="">Selecione um aluno*</option>
			<%  List<Aluno> alunos = (List<Aluno>) request.getAttribute("alunos");
				for (Aluno aluno : alunos) { %>
				<option ${aluno.getId() == a.getalunos_id() ? 'selected="selected"' : ''}  
				 value="<%=aluno.getId()%>"><%=aluno.getNome()%></option>
			<%}%>
			</select>

			<input class="user" type="date" name="data_matricula" placeholder="Data da matrícula" pattern="^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{4}$">
			<input class="login" type="submit">
		</form>
	  </div>
	</div>
</body>
<jsp:include page="includes/footer.jsp" />
</html>