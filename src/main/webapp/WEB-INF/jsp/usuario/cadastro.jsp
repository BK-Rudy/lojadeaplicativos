<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Loja de aplicativos</title>
</head>
<body>
	<div class="container">
		<h2>Cadastro de Usuário</h2>
		<form action="/usuario/incluir" method="post">

	    <div class="form-group">
	    	<label>Nome:</label>
	    	<input type="text" name="nome" value="Bruno Koiasqui Rudy" class="form-control" >
	    </div>

	    <div class="form-group">
	    	<label>E-mail:</label>
	    	<input type="email" name="email" value="bruno.rudy@al.infnet.edu.br" class="form-control" >
	    </div>

        <div class="form-group">
            <label>Senha:</label>
            <input type="password" name="senha" value="123456" class="form-control" >
        </div>
		
	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  	</form>
	</div>
</body>
</html>