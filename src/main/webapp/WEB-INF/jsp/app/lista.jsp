<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>LojaDeAplicativo</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"></c:import>

	<div class="container">

		<h3>Aplicativos</h3>

		<form action="/app/cadastro">
			<input type="submit" value="Novo" />
		</form>


		<c:if test="${not empty app }">
			<div class="alert alert-success">
				<strong>Atenção!</strong> ${mensagem}
			</div>
		</c:if>

		<c:if test="${empty apps }">
			<h5>Não há aplicativos cadastrados!</h5>
		</c:if>

		<c:if test="${not empty apps }">
			<h5>Total de aplicativos cadastrados: ${apps.size()}</h5>
		</c:if>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Valor</th>
					<th>Ano de Lançamento</th>
					<th>Idade mínima recomendada</th>
					<th>Categoria</th>
					<th>Tempo de Downloads</th>
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
						<td>${a.totalDowloads }</td>
						<th><a href="/app/${a.id }/excluir">excluir</a></th>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>