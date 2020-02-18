<%@ page contentType="text/html;charset=UTF-8" %>
<%@page import="cursolerolero.modelos.Instrutor"%>
<%@page import="cursolerolero.modelos.Curso"%>
<%@page import="cursolerolero.modelos.Turma"%>
<%@page import="java.util.List"%>
<% 
Turma a = null;
if(request.getParameter ("id") != null)
	a = (Turma) Turma.getById(Integer.parseInt(request.getParameter ("id"))); 
%>

<!DOCTYPE html>
  <html>
	<jsp:include page="includes/head.jsp" />

	<body>
	<jsp:include page="includes/navbar.jsp" />
	<div class="cont" style="height: 1000px;">
	  <div class="form">
		<form method="POST" action="entrada?acao=RegistraTurma">
			<h1>Criar turma</h1>

			<select id="appearance-select" name="instrutores_id" required="">
			
			<option value="">Selecione um instrutor*</option>
			<%  List<Instrutor> instrutores = (List<Instrutor>) request.getAttribute("instrutores");
				for (Instrutor inst : instrutores) { %>
				<option ${inst.getId() == a.getInstrutores_id() ? 'selected="selected"' : ''}  
				 value="<%=inst.getId()%>"><%=inst.getNome()%></option>
			<%}%>
			</select>
			
			<select id="appearance-select" name="cursos_id" required="">
			<option value="">Selecione um curso*</option>
			<%  List<Curso> cursos = (List<Curso>) request.getAttribute("cursos");
				for (Curso curso : cursos) { %>
				<option ${curso.getId() == a.getCursos_id() ? 'selected="selected"' : ''}  
				 value="<%=curso.getId()%>"><%=curso.getNome()%></option>
			<%}%>
			</select>

			<input 
			value="<%if (a != null) {%><%=a.getData_inicio()%><%}%>"
			class="user" type="date" name="data_inicio" placeholder="Data início" pattern="^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{4}$">
			
			<input value="<%if (a != null) {%><%=a.getData_final()%><%}%>"
			class="user" type="date" name="data_final" placeholder="Data fim" pattern="^(0?[1-9]|[12][0-9]|3[01])[\/\-](0?[1-9]|1[012])[\/\-]\d{4}$">


			<input value="<%if (a != null) {%><%=a.getCarga_horaria()%><%}%>"
			class="user" type="number" name="carga_horaria"  placeholder="Carga horária" max="5">
			<input class="login" type="submit">
		</form>
	  </div>
	</div>
</body>
<jsp:include page="includes/footer.jsp" />
</html>