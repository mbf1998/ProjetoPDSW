<%-- 
    Document   : login
    Created on : 20/04/2018, 08:57:24
    Author     : Nome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

         <!-- Latest compiled JavaScript -->
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
         <style>
             ul.dropdown-menu{background-color: black;}
         </style>
    </head>
    <body>
          <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="inicio.jsp"><font color="yellow">Caminho dos Brindes</font></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="inicio.jsp"><font color="yellow">Home</font></a></li>
     <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><font color="yellow">Produtos</font>
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#"><font color="yellow">Tipos</font></a></li>
          <li><a href="#"><font color="yellow">Promoção</font></a></li>
          <li><a href="#"><font color="yellow">Novidades</font></a></li>
        </ul>
      </li>
      <li><a href="#"><font color="yellow">Page 2</font></a></li>
      <li><a data-toggle="modal" data-target="#myModal"><font color="yellow">Sobre</font></a></li>
    </ul>
      <ul class="nav navbar-nav navbar-right">
      <li><a href="cadastroUsuario.jsp"><font color="yellow"><span class="glyphicon glyphicon-user"></span>Cadastrar</font></a></li>
      <li><a href="login.jsp"><font color="yellow"><span class="glyphicon glyphicon-log-in"></spanfont color="yellow"> Login</a></font></li>
    </ul>
  </div>
</nav>
        <br><br>
        <form action="LoginServlet" method="post">
            <div class="container">
  <div class="form-group">
    <label for="Login_cliente">Nome de Usuário:</label>
    <input  name="Login_cliente" type="text" class="form-control" id="Login_cliente">
  </div> 
    <div class="form-group">
    <label for="Senha_cliente">Senha:</label>
    <input name="Senha_cliente" type="password" class="form-control" id="Senha_cliente">
          </div><br>
 
                <button type="submit" class="btn btn-default">Logar</button></div>
</form>
        
        
<div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Caminho dos brindes</h4>
      </div>
      <div class="modal-body">
          <div class="container">
              <img class="center" width="350px" height="200px" hspace="60px"  src="logo.jpeg" ></div>
          <br><br>
          
          
          
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>
         
    </body>
</html>
