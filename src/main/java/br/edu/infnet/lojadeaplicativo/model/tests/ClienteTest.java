package br.edu.infnet.lojadeaplicativo.model.tests;

import br.edu.infnet.lojadeaplicativo.model.domain.Usuario;

public class ClienteTest {

	public static void main(String[] args) {
		Usuario c1 = new Usuario("Bruno", "bruno.rudy@al.infnet.edu.br", "123456", "1");
		Usuario c2 = new Usuario("José", "zezinho@al.infnet.edu.br", "abcdef", "2");
		Usuario c3 = new Usuario("Maria", "maria@al.infnet.edu.br", "987654", "1");
		System.out.println("Usuários: " + "\n" + c1 + "\n" + c2 + "\n" + c3);
	}
}