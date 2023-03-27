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
		<h3>Produtos</h3>

		<c:if test="${not empty produtos}">
			<div class="alert alert-success">
				<strong>Sucesso!</strong> ${mensagem} Total de produtos cadastrados:
				${produtos.size()}.
			</div>
		</c:if>

		<c:if test="${empty produtos}">
			<div class="alert alert-info">
				<strong>Atenção!</strong> Não há produtos cadastrados.
			</div>
		</c:if>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Valor</th>
					<th>Ano de Lançamento</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="p" items="${produtos}">
					<tr>
						<td>${p.id}</td>
						<td>${p.nome}</td>
						<td>${p.valor}</td>
						<td>${p.anoLancamento}</td>
						<td>
							<form action="/produto/${p.id}/excluir" method="get">
								<button type="submit" class="btn btn-danger">
									<span class="glyphicon glyphicon-remove"></span>
								</button>
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>