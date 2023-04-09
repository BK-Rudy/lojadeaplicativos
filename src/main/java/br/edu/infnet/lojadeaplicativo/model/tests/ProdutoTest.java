package br.edu.infnet.lojadeaplicativo.model.tests;

import br.edu.infnet.lojadeaplicativo.model.domain.App;
import br.edu.infnet.lojadeaplicativo.model.domain.Jogo;
import br.edu.infnet.lojadeaplicativo.model.domain.Livro;

public class ProdutoTest {

	public static void main(String[] args) {
		Jogo j1 = new Jogo("God of War Ragnarok", 200, "2022", "Santa Mônica Studios", "Aventura", true);
		Livro l1 = new Livro("Duna", 20, "1950", "Jose", 500, "Ficção Científica");
		App a1 = new App("Nota Paraná", 0, "2016", false, "Cidadania", 200000);
		System.out.println("Jogo: " + j1 + "\nLivro: " + l1 + "\nApp: " + a1);
	}
}