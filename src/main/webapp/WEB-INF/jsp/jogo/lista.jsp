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

		<h3>Jogos</h3>

		<c:if test="${not empty jogos}">
			<div class="alert alert-success">
				<strong>Sucesso!</strong> ${mensagem} Total de jogos cadastrados:
				${jogos.size()}.
			</div>
		</c:if>

		<c:if test="${empty jogos}">
			<div class="alert alert-info">
				<strong>Atenção!</strong> Não há jogos cadastrados.
			</div>
		</c:if>

		<form action="/jogo" method="get">
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
					<th>Desenvolvedora</th>
					<th>Gênero</th>
					<th>Idade recomendada</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="j" items="${jogos}">
					<tr>
						<td>${j.id }</td>
						<td>${j.nome }</td>
						<td>${j.valor }</td>
						<td>${j.anoLancamento }</td>
						<td>${j.desenvolvedora }</td>
						<td>${j.genero }</td>
						<td>${j.idadeRestrita }</td>
						<td>
							<form action="/jogo/${j.id}/excluir" method="get">
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