<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Promoção</title>
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
      <li class="active"><a href="telaADM.jsp"><font color="yellow">Home</font></a></li>
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
            <li><a href="ListarUsuarios"><font color="yellow"><span class="glyphicon glyphicon-list-alt"></span> Listar usuários</font></a></li>
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
    
    
    
        <br>
        <div class="container">
            <h3 align="center"><b> Lista de Promoções</b><h3><br><br>
                    
                    
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
         
        </div>
    
        <div class="table-responsive"  style="overflow: auto;">          
  <table class="table"   style="width: 100%" CELLPADDING="8" border="1" >
    <thead>
      <tr>
        <th style="padding: 15px">ID</th>
        <th style="padding: 15px">Data Inicio</th>
        <th style="padding: 15px">Data Fim</th>
        <th style="padding: 15px">Desconto (R$) </th>
     
      
        
      </tr>
    </thead>
    <tbody>
        <c:forEach items="${lista}" var="pro">
      <tr>
          
        <td><c:out value="${pro.iDPromocao}"/></td>
        <td><c:out value="${pro.dataInicio}"/></td>
        <td><c:out value="${pro.dataFim}"/></td>
        <td><c:out value="${pro.descontoPreco}"/></td>
      
                

           <td><a href="EditProduto?promocao=${pro.iDPromocao}"/>Editar</a></td>
        <td><a href="DeleteProduto?promocao=${pro.iDPromocao}"/>Deletar</a></td>
        
      </tr> </c:forEach>
    </tbody>
  </table>
   </div>
    
    
    
    
    
    </body>   
</html>
