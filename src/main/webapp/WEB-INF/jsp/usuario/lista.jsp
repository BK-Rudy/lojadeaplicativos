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
	<main class="container mt-5 d-flex flex-column align-items-center">
		<c:if test="${not empty mensagem}">
			<div class="alert alert-success">
				<strong>Sucesso!</strong> ${mensagem}
			</div>
		</c:if>

		<h2>Usuários</h2>
		<c:if test="${empty usuarios}">
			<h5>Não há usuários cadastrados!</h5>
		</c:if>

		<c:if test="${not empty usuarios}">
			<h5>Total de usuários cadastrados: ${usuarios.size()} !!!</h5>

			<table class="table table-striped container">
				<thead>
					<th>Id</th>
					<th>Nome</th>
					<th>E-mail</th>
					<th>Senha</th>
					<th>Tipo</th>
					<th></th>
				</thead>
				<tbody>
					<c:forEach var="u" items="${usuarios}">
						<tr>
							<td>${u.id}</td>
							<td>${u.nome}</td>
							<td>${u.email}</td>
							<td>${u.senha}</td>
							<td>
							<c:if test="${u.tipo == '1'}">Administrador</c:if> 
							<c:if test="${u.tipo == '2'}">Desenvolvedor</c:if>
							</td>
							<td><a href="/usuario/${u.id}/excluir">Excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
	</main>
</body>
</html>