<%-- 
    Document   : editarUsuario
    Created on : 02/05/2018, 16:20:10
    Author     : Nome
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Produto</title>
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
        <br><br>
        <div class="container">
        <form action ="EditProduto" method="post">
            <div class="container">
          <div class="form-group">
              <label for="idUs">ID:</label>
              <input id="idUs" name="idUs" type="hidden" class="form-control" value="${produto.IDProduto}" hidden><br>
    <label for="Nome_produto">Nome:</label>
    <input  name="Nome_produto"type="text" class="form-control" id="Nome_produto" value="${produto.nome}">
     </div>
          <div class="form-group">
    <label for="Altura_produto">Altura do Produto : (Em metros)</label>
    <input name="Altura_produto" type="float" class="form-control" id="Altura_produto" value="${produto.tamanhoAltura}">
  </div>     
         <div class="form-group">
    <label for="Largura_produto">Largura do Produto: (Em metros)</label>
    <input name="Largura_produto" type="float" class="form-control" id="Largura_produto" value="${produto.tamanhoLargura}">
  </div>   
         <div class="form-group">
    <label for="Quantidade_produto">Quantidade minima para compra:</label>
    <input name="Quantidade_produto"type="number" class="form-control" id="Quantidade_produto" value="${produto.quantidade}">
  </div> 
         <div class="form-group">
    <label for="preco_produto">Preço por Unidade :</label>
    <input name="preco_produto" type="float" class="form-control" id="preco_produto" value="${produto.preco}">
  </div> 
          <div class="form-group">
    <label for="Descricao_produto">Descrição:</label>
    <textarea  name="descricao_produto"class="form-control" rows="5" id="descricao_produto" value="${produto.descricao}">${produto.descricao}</textarea>

  </div>  
         <div class="form-group">
    <label for="tipo_produto">Tipo do produto:</label>
    <input name="tipo_produto"type="text" class="form-control" id="tipo_produto" value="${produto.tipo}">
         </div>  <br>
         <div class="form-group">
    <label for="cor">Cor do produto:</label>
    <input name="cor"type="text" class="form-control" id="cor" value="${produto.cor}">
         </div> 
        

<br><br>
 <label>Imagens : </label><br>
<input name="image1" type="file" id="image1" value="${produto.image01}"/>
<input name="image2" type="file" id="image2" value="${produto.image02}"/>
<input name="image3" type="file" id="image3" value="${produto.image03}"/>
<input name="i4" type="file" id="i4" value="${produto.image04}"/>
<input name="image5" type="file" id="image5" value="${produto.image05}"/>

<br><br>
            <button type="submit" class="btn btn-success">Atualizar</button>
         
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
