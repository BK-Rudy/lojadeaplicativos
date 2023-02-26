<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Loja de aplicativos</title>
</head>
<body>	
	<div class="container">
		<form action="/usuario" method="get">
            <h3>Listagem de Usuários</h3>
			<button type="submit" class="btn btn-link">Novo</button>
		</form>
		
	<table class="table table-striped">
    <thead>
      <tr>
        <th>Nome</th>
        <th>E-mail</th>
        <th>Senha</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>Bruno Koiasqui Rudy</td>
        <td>bruno.rudy@al.infnet.edu.br></td>
        <td>123456</td>
      </tr>
      <tr>
        <td>Ezequiel</td>
        <td>ezequiel.castro@al.infnet.edu.br></td>
        <td>teste</td>
      </tr>
      <tr>
        <td>José</td>
        <td>jose.rocha@al.infnet.edu.br></td>
        <td>000000</td>
      </tr>
      <tr>
        <td>Leonardo</td>
        <td>leonardo.schmidtt@al.infnet.edu.br></td>
        <td>987654</td>
      </tr>
    </tbody>
  	</table>		
	</div>
</body>
</html>