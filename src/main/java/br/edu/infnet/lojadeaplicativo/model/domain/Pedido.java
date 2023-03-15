package br.edu.infnet.lojadeaplicativo.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pedido {

	private Usuario usuario;
	private String descricao;
	private LocalDateTime data;

	public Pedido() {
		data = LocalDateTime.now();
	}

	public Pedido(Usuario usuario, String descricao) {
		this();
		this.usuario = usuario;
		this.descricao = descricao;
	}

	public String obterPedido() {
		return String.format("Pedido do(a) %s, email: %s, realizado com sucesso em %s", this.usuario.getNome(),
				this.usuario.getEmail(), this.data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
	}

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		StringBuilder sb = new StringBuilder();

		sb.append(this.usuario);
		sb.append(";");
		sb.append(this.descricao);
		sb.append(";");
		sb.append(this.data.format(formato));

		return sb.toString();
	}

	public Usuario getCliente() {
		return usuario;
	}

	public void setCliente(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}
}