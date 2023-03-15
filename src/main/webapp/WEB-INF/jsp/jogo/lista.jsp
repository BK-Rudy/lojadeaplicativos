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

		<h3>Jogos</h3>

		<form action="/jogo/cadastro">
			<input type="submit" value="Novo" />
		</form>

		<c:if test="${not empty jogo }">
			<div class="alert alert-success">
				<strong>Atenção!</strong> ${mensagem}
			</div>
		</c:if>

		<c:if test="${empty jogos }">
			<h5>Não há jogos cadastrados!</h5>
		</c:if>

		<c:if test="${not empty jogos }">
			<h5>Total de jogos cadastrados: ${jogos.size()}</h5>
		</c:if>

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
						<th><a href="/jogo/${j.id }/excluir">excluir</a></th>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>