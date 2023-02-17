<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Cadastro de usuário</title>
</head>
<body>
	<div class="container">
		<form action="/usuario/incluir" method="post">
			<h3>Cadastro de usuário</h3>

			<div class="form-group">
				<label>Insira o seu nome:</label> <input type="text" name="nome"
					value="Bruno" class="form-control">
			</div>

			<div class="form-group">
				<label>Insira uma senha:</label> <input type="password" name="senha"
					value="123" class="form-control">
			</div>

			<div class="form-group">
				<label>Insira o seu e-mail:</label> <input type="email" name="email"
					value="bruno.rudy@al.infnet.edu.br" class="form-control">
			</div>

			<div class="form-group">
				<label>Qual a sua idade?:</label> <input type="text" name="idade"
					value="26" class="form-control">
			</div>

			<div class="form-group">
				<label>Insira o seu número de celular:</label> <input type="text"
					name="celular" value="41998618208" class="form-control">
			</div>

			<div class="form-group">
				<label>Qual foi o seu gasto com jogos/aplicativos nos
					últimos 90 dias?</label> <input type="text" name="gastos" value="20"
					class="form-control">
			</div>

			<div class="form-group">
				<label>Como você conheceu a nossa loja?:</label>
				<div class="form-check">
					<label class="form-check-label"> <input type="radio"
						name="pesquisa" value="Redes_Sociais" class="form-check-input">
						Redes Sociais
					</label>
				</div>
				<div class="form-check">
					<label class="form-check-label"> <input type="radio"
						name="pesquisa" value="Email" class="form-check-input">
						E-mail
					</label>
				</div>
				<div class="form-check">
					<label class="form-check-label"> <input type="radio"
						name="pesquisa" value="Indicacao" class="form-check-input">
						Indicação
					</label>
				</div>
				<div class="form-check">
					<label class="form-check-label"> <input type="radio"
						name="pesquisa" value="Sites_de_pesquisa" class="form-check-input">
						Sites de pesquisa (Google, Yahoo, etc.)
					</label>
				</div>
				<div class="form-check">
					<label class="form-check-label"> <input type="radio"
						name="pesquisa" value="Anuncio" class="form-check-input">
						Anúncio
					</label>
				</div>
				<div class="form-check">
					<label class="form-check-label"> <input type="radio"
						name="pesquisa" value="Youtube" class="form-check-input">
						Youtube
					</label>
				</div>
			</div>

			<div class="form-group">
				<label>Por quais das categorias abaixo você se interessa?</label>
				<div class="form-check">
					<label class="form-check-label"> <input type="checkbox"
						name="categorias" value="Jogos" class="form-check-input">
						Jogos
					</label>
				</div>
				<div class="form-check">
					<label class="form-check-label"> <input type="checkbox"
						name="categorias" value="Livros" class="form-check-input">
						Livros
					</label>
				</div>
				<div class="form-check">
					<label class="form-check-label"> <input type="checkbox"
						name="categorias" value="Audiolivros" class="form-check-input">
						Áudiolivros
					</label>
				</div>
				<div class="form-check">
					<label class="form-check-label"> <input type="checkbox"
						name="categorias" value="Aplicativos" class="form-check-input">
						Aplicativos
					</label>
				</div>
				<div class="form-check">
					<label class="form-check-label"> <input type="checkbox"
						name="categorias" value="Podcast" class="form-check-input">
						Podcast
					</label>
				</div>
			</div>

			<div class="form-group">
				<label>Selecione o gênero de jogo que você mais gosta</label> <select
					name="genero" class="form-control">
					<option value="Nenhuma" selected>Nenhuma</option>
					<option value="RPG">RPG</option>
					<option value="Acao_e_aventura">Ação e aventura</option>
					<option value="Terror">Terror</option>
					<option value="Simulação">Simulação</option>
					<option value="Sobrevivencia">Sobrevivência</option>
					<option value="FPS">FPS</option>
					<option value="Estrategia">Estratégia</option>
					<option value="MMORPG">MMORPG</option>
					<option value="Cartas">Cartas</option>
					<option value="Puzzle">Puzzle</option>
				</select>
			</div>
			<button type="submit">Cadastrar</button>
		</form>
	</div>
</body>
</html>