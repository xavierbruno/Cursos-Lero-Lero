<%@ page import="cursolerolero.modelos.Usuario" %>
<% Usuario user = (Usuario) request.getSession().getAttribute("usuarioLogado");%>
 <header class="top-fixed">
  <div class="header-home"></div>
   <nav class="nav-desk navbar navbar-fixed-top row affix-top header-home" id="mainNav">
   <!-- <nav class="nav-desk navbar navbar-fixed-top row affix-top " id="mainNav"> -->
     <div class="container">
       <div class="row wrapper">
         <div class="col-md-4 ">
           <ul class="nav navbar-nav header-links-pages">
             <li><a href="?acao=StaticPage&pageName=listaComentarios" >Comentários</a></li>
             <li><a href="?acao=StaticPage&pageName=sobre">Sobre Nós</a></li>
             
           </ul>
         </div>
         <div class=" col-md-4">
           <a href="?acao=Home">
             <img  class="img-responsive img-logo" src="resources/images/logo.png">
           </a>
         </div>
         <div class=" col-md-4">
           <ul class="nav navbar-nav navbar-right header-links-pages">
             
              <% if (user == null) 
              { %>
               <li><a href="?acao=StaticPage&pageName=registro">Registro</a></li>
               <li><a href="?acao=StaticPage&pageName=login">Login</a></li>
              <% } 
              else 
              { %>
              	<% String tipo = user.getTipo();
                if (tipo.equals("admin")) {%> 
                  <li><a  href="?acao=StaticPage&pageName=areaAdmin">Área do administrador</a></li>
                <%} else if (tipo.equals("instrutor")) { %>
                  <li><a  href="?acao=StaticPage&pageName=areaInstrutor">Área do instrutor</a></li>
                  <%} else { %>
                    <li><a  href="?acao=StaticPage&pageName=areaAluno">Área do aluno</a></li>
                <%} %>
                <li><a  href="?acao=Logout">Logout</a></li>
              <%}%>
           </ul>
         </div>
       </div>
     </div>  
   </nav>
</header>