package br.edu.infnet.lojadeaplicativo.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TableUsuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String senha;
	private String tipo;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Cliente> clientes;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Produto> produtos;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Pedido> pedidos;

	public Usuario() {

	}

	public Usuario(String email, String senha) {
		this();
		this.email = email;
		this.senha = senha;
	}

	public Usuario(String nome, String email, String senha, String tipo) {
		this(email, senha);
		this.setNome(nome);
		this.setTipo(tipo);

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
}