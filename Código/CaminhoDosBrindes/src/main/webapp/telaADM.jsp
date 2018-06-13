<%-- 
    Document   : telaADM
    Created on : 26/04/2018, 14:42:16
    Author     : Nome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tela de Administrador</title>
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
      <li class="active"><a href="telaADM"><font color="yellow">Home</font></a></li>
    
          
        
          
        
      
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
        <ul class="nav navbar-nav navbar-right">
           <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><font color="yellow"> <%= session.getAttribute( "adm_nome" ) %></font>
        <span class="caret"></span></a>
         <ul class="dropdown-menu">
            
             
            <li><a href="Logout"><font color="yellow"><span class="glyphicon glyphicon-log-out"></span> Sair</font></a></li></ul></li>
      
      
    </ul>
     
    </ul>
  </div>
</nav> 
      
        
 <div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active">
      <img src="b.jpeg" alt="Promoção">
      <div class="carousel-caption">
          <h3><font color="black">Promoções</font></h3></div>
    </div>
     <div class="item">
      <img src="logo.jpg" alt="Logomarca" >
      <div class="carousel-caption">
          <h3><font color="black">Logo</font></h3></div>
    </div>
    <div class="item">
      <img src="a.jpeg" alt="Novidades">
      <div class="carousel-caption">
          <h3><font color="black">Novidades</font></h3></div>
    </div>

   
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Voltar</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Avançar</span>
  </a>
</div>

        <!-- Modal -->
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
           <p align="center"><b>Caminho dos Brindes</b></p>
          <p align="center"><b>Contato :</b></p>
          <p align="center"><b>(81) 3339-1803</b></p>
          <p align="center"><b>(81) 98611-7113</b></p>
          <p align="center"><b>marcoscaminhodosbrindes@hotmail.com</b></p>
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
