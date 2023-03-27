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
		<h2>Cadastrar App</h2>
		<form action="/app/incluir" method="post">
			<div class="form-group">
				<label>Nome do Aplicativo:</label> <input type="text" name="nome"
					value="Nota Paraná" class="form-control">
			</div>

			<div class="form-group">
				<label>Valor:</label> <input type="number" name="valor"
					value="0" class="form-control">
			</div>

			<div class="form-group">
				<label>Ano de lançamento:</label> <input type="text"
					name="anoLancamento" value="2018" class="form-control">
			</div>

			<div class="form-group">
				<label>Idade mínima recomendada:</label> <input type="number"
					name="idadeRestrita" value="0" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Categoria:</label> <input type="text"
					name="categoria" value="Cidadania" class="form-control">
			</div>

			<div class="form-group">
				<label>Total de Downloads:</label> <input type="number"
					name="totalDownloads" value="200000" class="form-control">
			</div>

			<button type="submit">Cadastrar</button>
		</form>
	</div>
</body>
</html>