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

		<h3>Livros</h3>

		<form action="/livro/cadastro">
			<input type="submit" value="Novo" />
		</form>

		<c:if test="${not empty livro }">
			<div class="alert alert-success">
				<strong>Atenção!</strong> ${mensagem}
			</div>
		</c:if>

		<c:if test="${empty livros }">
			<h5>Não há livros cadastrados!</h5>
		</c:if>

		<c:if test="${not empty livros }">
			<h5>Total de livros cadastrados: ${livros.size()}</h5>
		</c:if>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Duração</th>
					<th>Ano de Publicação</th>
					<th>Nome do(a) autor(a)</th>
					<th>Total de Páginas</th>
					<th>Gênero</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="l" items="${livros}">
					<tr>
						<td>${l.id }</td>
						<td>${l.nome }</td>
						<td>${l.valor }</td>
						<td>${l.anoLancamento }</td>
						<td>${l.autor }</td>
						<td>${l.paginas }</td>
						<td>${l.genero }</td>
						<th><a href="/livro/${l.id }/excluir">excluir</a></th>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>