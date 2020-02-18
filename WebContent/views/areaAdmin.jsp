<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
 	<html>
  		<jsp:include page="includes/head.jsp" />

<body>
<jsp:include page="includes/navbar.jsp" />
<div class="title-link-forms">
    <h1 class="title-text ">Área administrador</h1>
</div>
<table class="table table-dark">
    <tbody>
        <tr>
            <th scope="row"><strike><a  class="tc" href="?acao=StaticPage&pageName=formAluno">Aprovar alunos</a> </strike></th>
        </tr>
        <tr>
            <th scope="row"><strike><a  class="tc" href="?acao=StaticPage&pageName=formInstrutor">  Notas</a> </strike></th>
        </tr>
        <tr>
            <th scope="row"><a  class="tc" href="?acao=ListaModelo&modelo=Aluno">Alunos</a></th>
        </tr>
        <tr>
            <th scope="row"><a  class="tc" href="?acao=ListaModelo&modelo=Instrutor">Instrutores</a></th>
        </tr>
        <tr>
            <th scope="row"><a  class="tc" href="?acao=ListaModelo&modelo=Curso">Cursos</a></th>
        </tr>
         <tr>
            <th scope="row"><a  class="tc" href="?acao=ListaModelo&modelo=Turma">Turmas</a></th>
        </tr>
        <tr>
            <th scope="row"> <strike><a  class="tc" href="?acao=StaticPage&pageName=formInstrutor">Notas por curso</a> </strike></th>
        </tr>
        <tr>
            <th scope="row"> <strike><a  class="tc" href="?acao=StaticPage&pageName=formInstrutor">Upload foto instrutor</a> </strike></th>
        </tr>
        <tr>
            <th scope="row"> <strike><a  class="tc" href="?acao=StaticPage&pageName=formInstrutor">Upload foto curso</a> </strike></th>
        </tr>
    </tbody>
</table>
</body>
<jsp:include page="includes/footer.jsp" />
</html>

