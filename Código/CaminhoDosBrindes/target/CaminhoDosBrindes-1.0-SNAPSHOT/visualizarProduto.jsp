<%-- 
    Document   : visualizarProduto
    Created on : 13/06/2018, 10:35:31
    Author     : Nome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Visualizar produto</title>
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
      <a class="navbar-brand" href="telaADM.jsp"><font color="yellow">Caminho dos Brindes</font></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="Inicio"><font color="yellow">Home</font></a></li>
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
        <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><font color="yellow">Usuários</font>
        <span class="caret"></span></a>
         <ul class="dropdown-menu">
            
             <li><a href="ListarUsuarios"><font color="yellow"><span class="glyphicon glyphicon-list-alt"></span> Listar Usuários</font></a><li>
           </ul></li>
           <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><font color="yellow">Promoção</font>
        <span class="caret"></span></a>
         <ul class="dropdown-menu">
            <li><a href="AdicionarPromocao"><font color="yellow"><span class="glyphicon glyphicon-plus"></span> Adicionar Promoção</font></a><li>
                 
          <li><a href="ListarPromocao"><font color="yellow"><span class="glyphicon glyphicon-list-alt"></span> Listar Promoção</font></a><li>
       </ul></li>
          <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><font color="yellow">Produtos</font>
        <span class="caret"></span></a>
         <ul class="dropdown-menu">
             <li><a href="cadastroProdutos.jsp"><font color="yellow"><span class="glyphicon glyphicon-plus"></span> Cadastrar Produtos</font></a><li>
           
          <li><a href="ListarProdutos"><font color="yellow"><span class="glyphicon glyphicon-list-alt"></span> Listar Produtos</font></a><li>
      </ul></li>
       <li><a href="Logout"><font color="yellow"><span class="glyphicon glyphicon-log-out"></span> Sair</font></a></li>
     
    </ul>
  </div>
</nav>   
        <br><br>
        <div class="container">
        <form action ="EditProduto" method="post">
            <div class="container">
          <div class="form-group">
              
              <input id="idUs" name="idUs" type="hidden" class="form-control" value="${produto.IDProduto}" hidden><br>
              
              <h3><b>Nome do produto : <b></h3>
               <h4>${produto.nome}</h4></div><br>
          <div class="form-group">
              <h3><b>Altura do produto (EM METROS) : </b></h3>
    <h4>${produto.tamanhoAltura}</h4>      
          </div>    <br> 
         <div class="form-group">
             <h3><b>Largura do produto (EM METROS) :</b> </h3>
    <h4>${produto.tamanhoLargura}</h4>
         </div><br>   
         <div class="form-group">
             <h3><b>Quantidade minima para compra : </b></h3>
    <h4>${produto.quantidade}</h4>
         </div> <br>
         <div class="form-group">
             <h3><b>Preço do produto :</b> </h3>
    <h4>${produto.preco}</h4>
         </div> <br>
          <div class="form-group">
              <h3><b>Descrição do produto : </b></h3>
    <h4>${produto.descricao}</h4>
          </div>  <br>
         <div class="form-group">
             <h3><b>Tipo do produto :</b> </h3>
    <h4>${produto.tipo}</h4>
            
         </div>  <br>
         <div class="form-group">
             <h3><b>Cor do produto :</b> </h3>
             <h4>${produto.cor}</h4>
         </div> 
        



<br><br>
            <button type="submit" class="btn btn-success">Comprar</button>
         
            </div>
            
        </form> 
        </div>
        
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

