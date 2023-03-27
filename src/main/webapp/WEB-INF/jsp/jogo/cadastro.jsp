<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>LojaDeAplicativo</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"></c:import>

	<div class="container">
	<h2>Cadastrar Jogo</h2>
		<form action="/jogo/incluir" method="post">
			<div class="form-group">
				<label>Nome do jogo:</label> <input type="text" name="nome"
					value="God of War Ragnarok" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Valor de venda:</label> <input type="number" name="valor"
					value="200" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Ano de Lançamento:</label> <input type="text"
					name="anoLancamento" value="2022" class="form-control">
			</div>
			
			<div class="form-group">
				<label>Desenvolvedora:</label> <input type="text"
					name="desenvolvedora" value="Santa Mônica" class="form-control">
			</div>

			<div class="form-group">
				<label>Gênero:</label> <input type="text" name="genero"
					value="Aventura" class="form-control">
			</div>

			<div class="form-group">
				<label>Idade mínima recomendada:</label> <input type="number"
					name="idadeRestrita" value="12" class="form-control">
			</div>

			<button type="submit">Cadastrar</button>
		</form>
	</div>
</body>
</html>