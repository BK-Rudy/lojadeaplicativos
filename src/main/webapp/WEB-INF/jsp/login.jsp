<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Loja de Aplicativo</title>
</head>
<body>
	<div class="container">
		<h2>Autentica��o</h2>

		<form action="/login" method="post">

	    <div class="form-group">
	      <label>E-mail:</label>
	      <input value="bruno.rudy@al.infnet.edu.br" type="email" class="form-control" placeholder="Entre com o seu e-mail" name="email">
	    </div>

	    <div class="form-group">
	      <label>Senha:</label>
	      <input value="bruno.rudy@al.infnet.edu.br" type="password" class="form-control" placeholder="Entre com a sua senha" name="senha">
	    </div>

	    <button type="submit" class="btn btn-default">Acessar</button>
	  </form>
	</div>

</body>
</html>