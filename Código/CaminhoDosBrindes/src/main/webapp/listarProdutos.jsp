<%-- 
    Document   : listarProdutos
    Created on : 22/04/2018, 09:02:27
    Author     : Nome
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Produtos</title>
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
            
             
            <li><a href="Logout"><font color="yellow"><span class="glyphicon glyphicon-log-out"></span>Sair</font></a></li></ul></li>
      
      
    </ul>
     
    </ul>
  </div>
</nav> 
    
        <br>
        <div class="container">
            <h3 align="center"><b> Lista de Produtos</b><h3><br><br>
                    
                    
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
    
        <div class="table-responsive" >          
  <table class="table"   style="width: 100%" CELLPADDING="8" border="1" >
    <thead>
      <tr>
        <th style="padding: 15px">ID</th>
        <th style="padding: 15px">Nome</th>
        <th style="padding: 15px">Altura (Metros)</th>
        <th style="padding: 15px">Largura (Metros)</th>
        <th style="padding: 15px">Quantidade</th>
        <th style="padding: 15px">Tipo</th>
        <th style="padding: 15px">Preço</th>
        
      </tr>
    </thead>
    <tbody>
        <c:forEach items="${lista}" var="produto">
      <tr>
        <td><c:out value="${produto.IDProduto}"/></td>
        <td><c:out value="${produto.nome}"/></td>
        <td><c:out value="${produto.tamanhoAltura}"/></td>
        <td><c:out value="${produto.tamanhoLargura}"/></td>
        <td><c:out value="${produto.quantidade}"/></td>
        <td><c:out value="${produto.tipo}"/></td>
        <td><c:out value="${produto.preco}"/></td>
         
        <td><a href="EditProduto?id=${produto.IDProduto}"/>Editar</a></td>
        <td><a href="DeleteProduto?id=${produto.IDProduto}"/>Deletar</a></td>
      </tr> </c:forEach>
    </tbody>
  </table>
   </div>
    
    
    
    
    
    
    
    </body>   
</html>
