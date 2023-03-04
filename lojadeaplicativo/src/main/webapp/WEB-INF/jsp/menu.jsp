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
				<a class="navbar-brand" href="#">Loja De Aplicativo</a> <img
					src="logo.png" width="50" height="50">
			</div>
			<ul class="nav navbar-nav d-flex flex-row">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="/usuario/lista">Clientes</a></li>
				<li><a href="#">Apps</a></li>
				<li><a href="#">Jogos</a></li>
				<li><a href="#">Livros</a></li>
				<li><a href="#">Pedidos</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right d-flex flex-row">
				<li><a href="/usuario"><span
						class="glyphicon glyphicon-user"></span> Cadastre-se</a></li>
				<li><a href="/login"><span
						class="glyphicon glyphicon-log-in"></span> Entrar</a></li>
			</ul>
		</div>
	</nav>
</body>
</html>