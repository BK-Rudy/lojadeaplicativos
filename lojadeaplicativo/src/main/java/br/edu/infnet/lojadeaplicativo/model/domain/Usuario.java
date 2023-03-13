package br.edu.infnet.lojadeaplicativo.model.domain;

public class Usuario {

	private Integer id;
	private String nome;
	private String email;
	private String senha;
	private String tipo;

	public Usuario() {

	}

	public Usuario(String email, String senha) {
		this();
		this.email = email;
		this.senha = senha;
	}

	public Usuario(String nome, String email, String senha) {
		this(email, senha);
		this.setNome(nome);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {

		return String.format("O usuario tem o nome %s e as credenciais %s e %s.", nome, email, senha);
	}
}