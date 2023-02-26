package br.edu.infnet.lojadeaplicativo.model.domain;

public class Usuario {

	private String nome;
	private String email;
	private String senha;

	public Usuario() {
    }

    public Usuario(String email, String senha){
        this();
        this.setEmail(email);
        this.setSenha(senha);
    }

    public Usuario(String nome, String email, String senha){
        this(email, senha);
        this.setNome(nome);
    }

    @Override
    public String toString(){
        return String.format("Bem vindo/a %s de e-mail %s!", this.nome, this.email);
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
}