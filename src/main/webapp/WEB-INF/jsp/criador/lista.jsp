<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>LojaDeAplicativo</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"></c:import>

	<div class="container">

		<h3>Criadores/autores</h3>

		<form action="/criador/cadastro">
            <input type="submit" value="Novo" />
        </form>

		<c:if test="${not empty criador }">
			<div class="alert alert-success">
				<strong>Atenção!</strong> ${mensagem}
			</div>
		</c:if>

	<c:if test="${empty criadores }">
		<h5>Não há criadores/autores cadastrados!</h5>
	</c:if>

	<c:if test="${not empty criadores }">
		<h5>Total de criadores/autores cadastrados: ${criadores.size()}</h5>
	</c:if>

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
			<c:forEach var="c" items="${criadores }">
				<tr>
					<td>${c.id }</td>
					<td>${c.nome }</td>
					<td>${c.email }</td>
					<td>${c.cnpj }</td>
					<td>${c.numeroCelular }</td>
					<th><a href="/criador/${c.id }/excluir">excluir</a></th>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>