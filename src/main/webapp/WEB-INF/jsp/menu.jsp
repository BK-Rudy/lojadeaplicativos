<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>LojaDeAplicativo</title>
</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Loja De Aplicativos</a>
			</div>
			<ul class="nav navbar-nav d-flex flex-row">
				<li class="active"><a href="/?">Home</a></li>
				<c:if test="${not empty usuario}">
					<li><a href="/usuario/lista">Usuário</a></li>
					<li><a href="/cliente/lista">Clientes</a></li>
					<li><a href="/pedido/lista">Pedidos</a></li>
					<li><a href="/produto/lista">Produtos</a></li>
					<li><a href="/app/lista">Apps</a></li>
					<li><a href="/jogo/lista">Jogos</a></li>
					<li><a href="/livro/lista">Livros</a></li>
				</c:if>
			</ul>
			<ul class="nav navbar-nav navbar-right d-flex flex-row">
				<c:if test="${empty usuario}">
					<li><a href="/usuario"><span
							class="glyphicon glyphicon-user"></span> Sign Up</a></li>
					<li><a href="/login"><span
							class="glyphicon glyphicon-log-in"></span> Login</a></li>
				</c:if>
				<c:if test="${not empty usuario}">
					<li><a href="/logout"><span
							class="glyphicon glyphicon-log-out"></span> Logout,
							${usuario.nome}</a></li>
				</c:if>
			</ul>
		</div>
	</nav>
</body>
</html>