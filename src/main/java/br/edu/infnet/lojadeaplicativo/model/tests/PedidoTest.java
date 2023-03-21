package br.edu.infnet.lojadeaplicativo.model.tests;

import br.edu.infnet.lojadeaplicativo.model.domain.Pedido;
import br.edu.infnet.lojadeaplicativo.model.domain.Usuario;

public class PedidoTest {

	public static void main(String[] args) {
		Usuario c1 = new Usuario("Bruno", "bruno.rudy@al.infnet.edu.br", "123456", "1");
		Pedido p1 = new Pedido(c1, "\nPedido teste realizado em:");
		System.out.println(p1);
	}
}