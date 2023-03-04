<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="UTF-8">
<title>LojaDeAplicativo</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<main>
		<div class="container mt-5 d-flex flex-column align-items-center">
			<c:if test="${not empty mensagem}">
				<div class="alert alert-danger contanier">
					<strong>Atenção!</strong> ${mensagem}
				</div>
			</c:if>
		</div>
		<form action="" method="post"
			class="container mt-5 d-flex flex-column align-items-center border border-2 rounded pt-5 pb-5">
			<h2>Usuários</h2>
			<div class="mb-3 mt-3">
				<label for="email" class="form-label">E-mail:</label> <input
					type="email" class="form-control" id="email" placeholder="E-mail"
					name="email" value="bruno.rudy@al.infnet.edu.br">
			</div>
			<div class="mb-3">
				<label for="pwd" class="form-label">Senha:</label> <input
					type="password" class="form-control" id="pwd" placeholder="Senha"
					name="senha" value="bruno.rudy@al.infnet.edu.br">
			</div>
			<button type="submit" class="btn btn-primary">Entrar</button>
		</form>
	</main>
</body>
</html>