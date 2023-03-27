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
		<h2>Cadastrar Livro</h2>
		<form action="/livro/incluir" method="post">

			<div class="form-group">
				<label>Nome do livro:</label> <input type="text" name="nome"
					value="Duna" class="form-control">
			</div>

			<div class="form-group">
				<label>Valor de venda:</label> <input type="number" name="valor"
					value="50" class="form-control">
			</div>

			<div class="form-group">
				<label>Ano de Publicação:</label> <input type="text"
					name="anoLancamento" value="1965" class="form-control">
			</div>

			<div class="form-group">
				<label>Nome do(a) autor(a):</label> <input type="text" name="autor"
					value="Frank Herbert" class="form-control">
			</div>

			<div class="form-group">
				<label>Total de Páginas:</label> <input type="number" name="paginas"
					value="544" class="form-control">
			</div>

			<div class="form-group">
				<label>Gênero:</label> <input type="text" name="genero"
					value="Ficção científica" class="form-control">
			</div>

			<button type="submit">Cadastrar</button>
		</form>
	</div>
</body>
</html>