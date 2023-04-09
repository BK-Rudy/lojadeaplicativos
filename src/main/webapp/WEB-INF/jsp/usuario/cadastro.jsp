<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LojaDeAplicativo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-5 d-flex flex-column align-items-center border border-2 rounded pt-5 pb-5">

		<h2>Cadastre-se</h2>
		
		<form action="/cep" class="form-inline" method="post">
			<label>Cep:</label>
			<input type="text" name="cep" value="" class="form-control">
			<button type="submit" class="btn btn-primary">Buscar</button>
		</form>

		<form action="/usuario/incluir" method="post" class="w-50">

			<div class="mb-3">
				<label for="nome" class="form-label">Nome:</label> 
				<input type="text" class="form-control" name="nome" id="nome" placeholder="insira o seu nome">
			</div>
			
			<div class="mb-3">
				<label for="email" class="form-label">E-mail:</label> 
				<input type="email" class="form-control" name="email" id="email" placeholder="exemplo@gmail.com">
			</div>
			
			<div class="mb-3">
				<label for="senha" class="form-label">Senha:</label> 
				<input type="password" class="form-control" name="senha" id="senha" placeholder="insira sua senha">
			</div>
			
			<c:import url="/WEB-INF/jsp/endereco/cadastro.jsp"/>

			<button type="submit" class="btn btn-outline-secondary mt-5">Cadastrar</button>
		</form>
	</div>
</body>
</html>