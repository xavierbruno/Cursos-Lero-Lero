<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="cursolerolero.modelos.Usuario" %>
<% Usuario user = (Usuario) request.getSession().getAttribute("usuarioLogado");%>
<!DOCTYPE html>
 	<html>
  		<jsp:include page="includes/head.jsp" />

<body>
<jsp:include page="includes/navbar.jsp" />
<div class="title-link-forms">
    <h1 class="title-text ">Área aluno</h1>
</div>
<table class="table table-dark">
    <tbody>
        <tr>
            <th scope="row"><a  class="tc" href="?acao=StaticPage&pageName=formAluno&dados=aluno&id=<%=user.getId()%>"  >Dados</a></th>
        </tr>
        <tr>
            <th scope="row"><a  class="tc" href="?acao=StaticPage&pageName=formMatricula">Matricula</a></th>
        </tr>
        <tr>
            <th scope="row"><a  class="tc" href="?acao=StaticPage&pageName=formInstrutor">Notas</a></th>
        </tr>
        <tr>
            <th scope="row"><a  class="tc" href="?acao=StaticPage&pageName=formInstrutor">Comentário</a></th>
        </tr>
        <tr>
            <th scope="row"><a  class="tc" href="?acao=StaticPage&pageName=formInstrutor">Upload foto</a></th>
        </tr>
    </tbody>
</table>
</body>
<jsp:include page="includes/footer.jsp" />
</html>

