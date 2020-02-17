<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
 	<html>
  		<jsp:include page="includes/head.jsp" />

<body>
<jsp:include page="includes/navbar.jsp" />
<div class="title-link-forms">
    <h1 class="title-text ">Links de Formulários</h1>
</div>
<table class="table table-dark">
    <tbody>
        <tr>
            <th scope="row"><a  class="tc" href="?acao=StaticPage&pageName=formAluno">Aluno</a></th>
        </tr>
        <tr>
            <th scope="row"><a  class="tc" href="?acao=StaticPage&pageName=formAdmin">Administrador</a></th>
        </tr>
        <tr>
            <th scope="row"><a  class="tc" href="?acao=StaticPage&pageName=formInstrutor">Intrutor</a></th>
        </tr>
    </tbody>
</table>
</body>
<jsp:include page="includes/footer.jsp" />
</html>

