<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>LojaDeAplicativo</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"></c:import>

	<div class="container">
		<h2>Cadastrar Cliente</h2>
		<form action="/cliente/incluir" method="post">
			<div class="form-group">
				<label>Nome:</label> <input type="text" name="nome"
					value="Santa Monica Studio" class="form-control">
			</div>
			<div class="form-group">
				<label>E-mail:</label> <input type="text" name="email"
					value="santamonica@gmail.com" class="form-control">
			</div>
			<div class="form-group">
				<label>CNPJ:</label> <input type="text" name="cnpj"
					value="00.000.555-99" class="form-control">
			</div>
			<div class="form-group">
				<label>Telefone:</label> <input type="text" name="numeroCelular"
					value="+55 (44)99999-9999" class="form-control">
			</div>
			<button type="submit">Cadastrar</button>
		</form>
	</div>
</body>
</html>