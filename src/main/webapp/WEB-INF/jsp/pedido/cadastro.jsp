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
		<h2>Cadastrar Pedidos</h2>
		<form action="/pedido/incluir" method="post">

			<div class="form-group">
				<label>Descrição:</label> <input type="text" name="descricao"
					placeholder="Insira a descrição do pedido" class="form-control">
			</div>

			<div>
				<label for="oferta">Produto em promoção</label> <input type="checkbox"
					id="oferta" name="oferta">
			</div>
			
			<%-- Backend não implementado ainda --%>
			<label for="datetime">Data e hora:</label> 
			<input type="datetime-local" id="datetime" name="datetime">

			<div class="form-group">
				<label>Cliente</label> <select name="cliente" id="form-control">
					<c:forEach var="c" items="${clientes}">
						<option value="${c.id}">${c.nome}</option>
					</c:forEach>
				</select>
			</div>

			<div class="form-group">
				<label>Produtos</label>
				<c:forEach var="p" items="${produtos}">
					<div class="form-check">
						<label class="form-check-label"> <input type="checkbox"
							name="produtos" value="${p.id}" class="form-check-input">
							${p.nome}
						</label>
					</div>
				</c:forEach>
			</div>

			<button type="submit">Cadastrar</button>
		</form>
	</div>
</body>
</html>