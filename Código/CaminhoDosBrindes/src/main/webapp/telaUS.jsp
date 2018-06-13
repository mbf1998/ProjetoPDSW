<%-- 
    Document   : telaUS
    Created on : 27/04/2018, 09:24:24
    Author     : ALUNO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tela Usuário</title>
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

         <!-- Latest compiled JavaScript -->
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
         <style>
             ul.dropdown-menu{background-color: black;}
             .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  
         </style>
    </head>
    <body>
        
    
  
   <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="telaUS"><font color="yellow">Caminho dos Brindes</font></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="telaUS"><font color="yellow">Home</font></a></li>
   
          <li><a href="todosprodutos"><font color="yellow">Produtos</font></a></li>
          <li><a href="todaspromocoes"><font color="yellow">Promoção</font></a></li>
          
        
    
      <li><a  data-toggle="modal" data-target="#myModal"><font color="yellow">Sobre</font></a></li>
    </ul>
      <ul class="nav navbar-nav navbar-right">
           <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#"><font color="yellow"> <%= session.getAttribute( "nome" ) %></font>
        <span class="caret"></span></a>
         <ul class="dropdown-menu">
            
             <li><a href="EditUsuario"><font color="yellow"><span class="glyphicon glyphicon-user"></span> Editar Usuario</font></a><li>
            <li><a href=minhasCompras.jsp"><font color="yellow"><span class="glyphicon glyphicon-shopping-cart"></span> Minhas Compras</font></a></li>
            <li><a href="Logout"><font color="yellow"><span class="glyphicon glyphicon-log-out"></span>Logout</font></a></li></ul></li>
      
      
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
      <img src="logo.jpg" alt="Promoção">
      <div class="carousel-caption">
          </div>
    </div>
     <div class="item">
      <img src="a.jpeg" alt="Novidades" >
      <div class="carousel-caption">
          <h3><font color="black">Novidades</font></h3></div>
    </div>
    <div class="item">
      <img src="b.jpeg"  alt="Promoção">
      <div class="carousel-caption">
          <h3><font color="black">Promoção</font></h3></div>
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
              <img class="center" width="350px" height="200px" hspace="60px"  src="logo.jpeg" ><br>
             
             </div>
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
        <br><br>
   <div class="panel panel-default">
       <div style=" color: red; background-color: black; "class="panel-heading"><b>Produtos</b></div>
 
  
       <div class="panel-body">
            <div class="container">
  <div class="row">
      
          <c:forEach items="${lista}" end="3" var="produto">
              <div class="col-lg-3">
           <img style="image-rendering: auto; image-rendering: crisp-edges;image-rendering: pixelated;;"src="data:image/png;base64,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"<br>
      <h4 align="center"><b>${produto.nome}</b></h4>
      <h4 align="center"><b>Preço atual : ${produto.preco}</b></h4>
        </div>
           </c:forEach>
      
    
  
 
  
</div>
       </div>
       </div></div>
        <br><br>
        
  <div class="panel panel-default">
       <div style=" color: blue;  background-color: black; "class="panel-heading"><b>Novidades</b></div>
  <div class="container">
  <div class="row">
      
          <c:forEach items="${lista}" begin="${inicio}" end="${fim}" var="produto">
              <div class="col-lg-3">
      <img style="image-rendering: auto; image-rendering: crisp-edges;image-rendering: pixelated;"src="data:image/png;base64,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"<br>
      <h4 align="center"><b>${produto.nome}</b></h4>
      
      </div>
          </c:forEach>
      
    
  
 
  
</div>
  
  <div class="panel-body"></div>
  </div>   </div>   
    </body>
</html>
