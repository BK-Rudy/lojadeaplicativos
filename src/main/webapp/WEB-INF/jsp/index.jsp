<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>LojaDeAplicativo</title>
<style>
body {
	background-image: url("/infnet.png");
	background-size: auto;
	background-position: center center;
	background-repeat: no-repeat;
	background-attachment: fixed;
	height: 100vh;
	color: white;
}

.container {
	height: 100%;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}

h1 {
	font-size: 4rem;
	margin-bottom: 2rem;
	text-shadow: 2px 2px #000000;
}

p {
	font-size: 1.5rem;
	text-align: center;
	text-shadow: 2px 2px #000000;
}
</style>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
</body>
</html>