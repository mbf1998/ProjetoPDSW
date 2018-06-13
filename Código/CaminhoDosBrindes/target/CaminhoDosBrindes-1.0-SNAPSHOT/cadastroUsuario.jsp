<%-- 
    Document   : cadastroUsuario
    Created on : 20/04/2018, 08:41:48
    Author     : Nome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Usuário</title>
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
      <a class="navbar-brand" href="Inicio"><font color="yellow">Caminho dos Brindes</font></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="Inicio"><font color="yellow">Home</font></a></li>
     
      <li><a data-toggle="modal" data-target="#myModal"><font color="yellow">Sobre</font></a></li>
    </ul>
      <ul class="nav navbar-nav navbar-right">
      <li><a href="cadastroUsuario.jsp"><font color="yellow"><span class="glyphicon glyphicon-user"></span> Cadastrar</font></a></li>
      <li><a href="login.jsp"><font color="yellow"><span class="glyphicon glyphicon-log-in"></span> Login</font></a></li>
    </ul>
  </div>
</nav>
        <br><br>
        
        <form action="AdicionarUsuario" method="POST">
            <div class="container">
          <div class="form-group">
    <label for="Nome_cliente">Nome:</label>
    <input name="Nome_cliente" type="text" class="form-control" id="Nome_cliente">
     </div>
          <div class="form-group">
    <label for="Sobrenome_cliente">Sobrenome:</label>
    <input name="Sobrenome_cliente" type="text" class="form-control" id="Sobrenome_cliente">
  </div>     
         <div class="form-group">
    <label for="Email_cliente">Email:</label>
    <input name="Email_cliente" type="email" class="form-control" id="Email_cliente">
  </div>   
         <div class="form-group">
    <label for="Login_cliente">Nome de Usuário:</label>
    <input  name="Login_cliente"type="text" class="form-control" id="Login_cliente">
  </div> 
          <div class="form-group">
    <label for="Bairro_cliente">Bairro:</label>
    <input name="Bairro_cliente" type="text" class="form-control" id="Bairro_cliente">
  </div>  
         <div class="form-group">
    <label for="Cidade_cliente">Cidade:</label>
    <input name="Cidade_cliente"type="text" class="form-control" id="Cidade_cliente">
  </div>   
         <div class="form-group">
    <label for="Cep_cliente">CEP</label>
    <input name="Cep_cliente"type="number" class="form-control" id="Cep_cliente">
  </div>   
         <div class="form-group">
    <label for="Telefone_cliente">Telefone:</label>
    <input  name="Telefone_cliente"type="number" class="form-control" id="Telefone_cliente">
  </div>  
          <div class="form-group">
    <label for="Celular_cliente">Celular:</label>
    <input name="Celular_cliente" type="number" class="form-control" id="Celular_cliente">
  </div>   
          <div class="form-group">
    <label for="Senha_cliente">Senha:</label>
    <input name="Senha_cliente" type="password" class="form-control" id="Senha_cliente">
          </div><br>
            <button type="submit" class="btn btn-success">Cadastrar</button>
            <button type="button" class="btn btn-danger">Cancelar</button>
            </div>
            
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
