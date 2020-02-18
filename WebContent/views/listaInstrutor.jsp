<%@ page contentType="text/html;charset=UTF-8" %>
<%@page import="cursolerolero.modelos.Instrutor"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
    <html>
        <jsp:include page="includes/head.jsp" />

<body>
<jsp:include page="includes/navbar.jsp" />
<div class="title-link-forms">
    <h1 class="title-text ">Links de Formulários</h1>
</div>
<a href="entrada?acao=StaticPage&pageName=formInstrutor">Incluir</a>
<table class="table table-dark">
    <tbody>
        <tr>
            <th scope="row">Nome</th>   
            <th scope="row">Email</th>
            <th scope="row">Valor Hora</th>
            <th scope="row">Login</th>
            <th scope="row">Experiência</th>
            <th scope="row">Altera</th>	
            <th scope="row">Exclui</th>	
           
        </tr>
         <% List<Instrutor> instrutores = (List<Instrutor>) request.getAttribute("modelos");
            for (Instrutor inst : instrutores) { %>
            <tr>
                <td>    <%=inst.getNome()%>       </td>
                <td>    <%=inst.getEmail() %>        </td>
                <td>    <%=inst.getValor_hora() %>   </td>
                <td>    <%=inst.getLogin() %> </td>
                <td>    <%=inst.getExperiencia() %> </td>
                <td><a href="<%="entrada?acao=StaticPage&pageName=formInstrutor&id="+inst.getId() %>"> Alterar</a>	</td>
                <td><a href="<%="entrada?acao=ExcluiModelo&modelo=Instrutor&id="+inst.getId() %>"> Excluir</a>	</td>
            
            </tr>
       <%}%>
    </tbody>
</table>
</body>
<jsp:include page="includes/footer.jsp" />
</html>ludes/footer.jsp" />
</html>