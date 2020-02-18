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
<table class="table table-dark">
    <tbody>
        <tr>
            <th scope="row">Nome</th>   
            <th scope="row">Email</th>
            <th scope="row">Valor Hora</th>
            <th scope="row">Login</th>
            <th scope="row">Experiência</th>
           
        </tr>
         <% List<Instrutor> instrutores = (List<Instrutor>) request.getAttribute("modelos");
            for (Instrutor inst : instrutores) { %>
            <tr>
                <td>    <%=inst.getNome()%>       </td>
                <td>    <%=inst.getEmail() %>        </td>
                <td>    <%=inst.getValor_hora() %>   </td>
                <td>    <%=inst.getLogin() %> </td>
                <td>    <%=inst.getExperiencia() %> </td>
            
            </tr>
       <%}%>
    </tbody>
</table>
</body>
<jsp:include page="includes/footer.jsp" />
</html>ludes/footer.jsp" />
</html>