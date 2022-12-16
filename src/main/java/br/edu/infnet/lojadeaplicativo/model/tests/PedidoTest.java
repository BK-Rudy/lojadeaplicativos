package br.edu.infnet.lojadeaplicativo.model.tests;

import br.edu.infnet.lojadeaplicativo.model.domain.Cliente;
import br.edu.infnet.lojadeaplicativo.model.domain.Pedido;

public class PedidoTest {

	public static void main(String[] args) {
		Cliente c1 = new Cliente(1, "Bruno Koiasqui Rudy", "088.304.839-66", "bruno.rudy@al.infnet.edu.br", "(41) 99861-8208");
		Pedido p1 = new Pedido(c1, "\nPedido teste realizado em:");
		System.out.println(p1);
	}
}