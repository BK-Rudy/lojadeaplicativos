<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>LojaDeAplicativo</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"></c:import>

	<div class="container">

		<h3>Clientes</h3>

		<c:if test="${not empty clientes}">
			<div class="alert alert-success">
				<strong>Sucesso!</strong> ${mensagem} Total de clientes cadastrados:
				${clientes.size()}.
			</div>
		</c:if>

		<c:if test="${empty clientes}">
			<div class="alert alert-info">
				<strong>Atenção!</strong> Não há clientes cadastrados.
			</div>
		</c:if>

		<form action="/cliente" method="get">
			<button type="submit" class="btn btn-success">
				<span class="glyphicon glyphicon-plus"></span>
			</button>
		</form>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>E-mail</th>
					<th>CNPJ</th>
					<th>Telefone</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="c" items="${clientes }">
					<tr>
						<td>${c.id }</td>
						<td>${c.nome }</td>
						<td>${c.email }</td>
						<td>${c.cnpj }</td>
						<td>${c.numeroCelular }</td>
						<td>
							<form action="/cliente/${c.id}/excluir" method="get">
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