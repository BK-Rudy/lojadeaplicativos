package br.edu.infnet.lojadeaplicativo.model.domain;

public class Usuario {

	private String nome;
	private String senha;
	private String email;
	private int idade;
	private String celular;
	private float gastos;
	private String pesquisa;
	private String[] categorias;
	private String genero;

	public Usuario(String nome, String email) {
		this.setNome(nome);
		this.setEmail(email);
	}
	
	@Override
	public String toString() {
		
		return String.format(
				"Relatório: %s, detentor(a) do e-mail(%s) e senha (%s), tem %d anos e seu número de celular é o %s."
				+ " %s gastou cerca de R$%.2f em jogos/aplicativos nos últimos 90 dias."
				+ " Ele(a) tem interesse em %s categoria(s), com relação à jogos ele(a) gosta de %s."
				+ " E conheceu a nossa loja através do seguinte:%s",
				nome,
				email,
				senha,
				idade,
				celular,
				nome,
				gastos,
				categorias.length,
				genero,
				pesquisa
				);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getCelular() {
		return celular;
	}
	
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public float getGastos() {
		return gastos;
	}
	
	public void setGastos(float gastos) {
		this.gastos = gastos;
	}
	
	public String getPesquisa() {
		return pesquisa;
	}
	
	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}
	
	public String[] getCategorias() {
		return categorias;
	}

	public void setCategorias(String[] categorias) {
		this.categorias = categorias;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
}
