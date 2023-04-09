<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<div class="mb-3">
	<label for="cep" class="form-label">Nome:</label> 
	<input type="text" name="cep" value="${endereco.cep}" class="form-control" required>
</div>

<div class="mb-3">
	<label for="logradouro" class="form-label">Logradouro:</label> 
	<input type="text" name="logradouro" value="${endereco.logradouro}" class="form-control" required>
</div>

<div class="mb-3">
	<label for="complemento" class="form-label">Complemento:</label> 
	<input type="text" name="complemento" value="${endereco.complemento}" class="form-control" required>
</div>

<div class="mb-3">
	<label for="bairro" class="form-label">Bairro:</label> 
	<input type="text" name="bairro" value="${endereco.bairro}" class="form-control" required>
</div>

<div class="mb-3">
	<label for="localidade" class="form-label">Localidade:</label> 
	<input type="text" name="localidade" value="${endereco.localidade}" class="form-control" required>
</div>

<div class="mb-3">
	<label for="uf" class="form-label">UF:</label> 
	<input type="text" name="uf" value="${endereco.uf}" class="form-control" required>
</div>