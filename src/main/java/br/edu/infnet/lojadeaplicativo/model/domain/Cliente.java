package br.edu.infnet.lojadeaplicativo.model.domain;

public class Cliente {

	private int id;
	private String nome;
	private String email;
	private String Cpf;
	private String numeroCelular;
	
	public Cliente() {
	}
	
	public Cliente(int id, String nome, String email, String Cpf, String numeroCelular ) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.Cpf = Cpf;
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
		sb.append(this.Cpf);
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

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
}