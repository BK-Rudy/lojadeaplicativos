package br.edu.infnet.lojadeaplicativo.model.domain;

public class Criador {

	private int id;
	private String nome;
	private String email;
	private String cnpj;
	private String numeroCelular;
	
	public Criador() {
	}
	
	public Criador(int id, String nome, String email, String cnpj, String numeroCelular ) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cnpj = cnpj;
		this.numeroCelular = numeroCelular;
	}	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.id);
		sb.append(";");
		sb.append(this.nome);
		sb.append(";");
		sb.append(this.email);
		sb.append(";");
		sb.append(this.cnpj);
		sb.append(";");
		sb.append(this.numeroCelular);
			
		return sb.toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
}