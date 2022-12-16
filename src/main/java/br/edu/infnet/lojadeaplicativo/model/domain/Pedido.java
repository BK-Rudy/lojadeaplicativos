package br.edu.infnet.lojadeaplicativo.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pedido {

	private Cliente cliente;
	private String descricao;
	private LocalDateTime data;
	
	public Pedido() {
		data = LocalDateTime.now();
	}

	public Pedido(Cliente cliente, String descricao) {
		this();
		this.cliente = cliente;
		this.descricao = descricao;
	}
	
	public String obterPedido() {
		return String.format("Pedido do(a) %s, CPF: %s, realizado com sucesso em %s",this.cliente.getNome(), this.cliente.getCpf(), this.data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
	}
	
	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.cliente);
		sb.append(";");
		sb.append(this.descricao);
		sb.append(";");
		sb.append(this.data.format(formato));

		return sb.toString(); 
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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