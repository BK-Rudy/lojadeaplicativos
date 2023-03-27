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

		<h3>Aplicativos</h3>

		<c:if test="${not empty apps }">
			<div class="alert alert-success">
				<strong>Sucesso!</strong> ${mensagem} Total de apps cadastrados:
				${apps.size()}.
			</div>
		</c:if>

		<c:if test="${empty apps }">
			<div class="alert alert-info">
				<strong>Atenção!</strong> Não há apps cadastrados.
			</div>
		</c:if>

		<form action="/app" method="get">
			<button type="submit" class="btn btn-success">
				<span class="glyphicon glyphicon-plus"></span>
			</button>
		</form>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Valor</th>
					<th>Ano de Lançamento</th>
					<th>Idade mínima recomendada</th>
					<th>Categoria</th>
					<th>Total de Downloads</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="a" items="${apps }">
					<tr>
						<td>${a.id }</td>
						<td>${a.nome }</td>
						<td>${a.valor }</td>
						<td>${a.anoLancamento }</td>
						<td>${a.idadeRestrita }</td>
						<td>${a.categoria }</td>
						<td>${a.totalDownloads }</td>
						<td>
							<form action="/app/${a.id}/excluir" method="get">
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