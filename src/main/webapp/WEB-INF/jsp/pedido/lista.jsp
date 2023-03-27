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
		<h3>Pedidos</h3>

		<c:if test="${not empty pedidos}">
			<div class="alert alert-success">
				<strong>Sucesso!</strong> ${mensagem} Total de pedidos cadastrados:
				${pedidos.size()}.
			</div>
		</c:if>

		<c:if test="${empty pedidos}">
			<div class="alert alert-info">
				<strong>Atenção!</strong> Não há pedidos cadastrados.
			</div>
		</c:if>

		<form action="/pedido" method="get">
			<button type="submit" class="btn btn-success">
				<span class="glyphicon glyphicon-plus"></span>
			</button>
		</form>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Descrição</th>
					<th>Preço promocional</th>
					<th>Data</th>
					<th>Cliente</th>
					<th>Produtos</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="pe" items="${pedidos}">
					<tr>
						<td>${pe.id}</td>
						<td>${pe.descricao}</td>
						<td>${pe.oferta}</td>
						<td>${pe.data}</td>
						<td>${pe.cliente.nome}</td>
						<td>${pe.produtos.size()}</td>
						<td>
							<form action="/pedido/${pe.id}/excluir" method="get">
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