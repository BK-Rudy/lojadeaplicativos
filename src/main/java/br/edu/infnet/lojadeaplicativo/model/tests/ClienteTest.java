package br.edu.infnet.lojadeaplicativo.model.tests;

import br.edu.infnet.lojadeaplicativo.model.domain.Cliente;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente c1 = new Cliente(1, "Bruno Koiasqui Rudy", "088.304.839-66", "bruno.rudy@al.infnet.edu.br", "(41) 99861-8208");
		Cliente c2 = new Cliente(1, "Elberth Moraes", "000.111.222-33", "exemplo1@gmail.com", "(41) 98765-4321");
		Cliente c3 = new Cliente(1, "José Carlos", "999.888.777-66", "exemplo2@gmail.com", "(41) 99876-5432");
		System.out.println("Clientes: " + "\n" + c1 + "\n" + c2 + "\n" + c3);	
	}
}