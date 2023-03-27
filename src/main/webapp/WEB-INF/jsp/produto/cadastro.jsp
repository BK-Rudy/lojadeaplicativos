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
		<h2>Cadastrar Produto</h2>
		<form action="/produto/incluir" method="post">

			<div class="form-group">
				<label>Nome do produto:</label> <input type="text" name="nome"
					value="Teste" class="form-control">
			</div>

			<div class="form-group">
				<label>Valor do produto:</label> <input type="number" name="valor"
					value="50" class="form-control">
			</div>

			<div class="form-group">
				<label>Ano de lançamento/publicação:</label> <input type="text"
					name="anoLancamento" value="2023" class="form-control">
			</div>
		</form>
	</div>
</body>
</html>