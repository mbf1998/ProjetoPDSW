<%-- 
    Document   : inicio
    Created on : 20/04/2018, 08:12:17
    Author     : Nome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Caminho dos Brindes</title>
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
    <body >
        
    
  
   <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="Inicio"><font color="yellow">Caminho dos Brindes</font></a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="Inicio"><font color="yellow">Home</font></a></li>
     
       
       
          
        
          
        
     
     
      <li><a  data-toggle="modal" data-target="#myModal"><font color="yellow">Sobre</font></a></li>
    </ul>
      <ul class="nav navbar-nav navbar-right">
      <li><a href="cadastroUsuario.jsp"><span class="glyphicon glyphicon-user"></span><font color="yellow"> Cadastrar</font></a></li>
      <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span><font color="yellow"> Login</font></a></li>
    </ul>
  </div>
</nav>
        <br>
        
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
      <img style="image-rendering: auto; image-rendering: crisp-edges;image-rendering: pixelated;"src="data:image/png;base64,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
"<br>
      <h4 align="center"><b>${produto.nome}</b></h4>
      
      </div>
          </c:forEach>
      
    
  
 
  
</div>
  
  <div class="panel-body"></div>
  </div>   </div>   
    </body>
</html>
