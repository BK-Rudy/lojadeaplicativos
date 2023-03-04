package br.edu.infnet.lojadeaplicativo.model.tests;

import br.edu.infnet.lojadeaplicativo.model.domain.Apps;
import br.edu.infnet.lojadeaplicativo.model.domain.Jogos;
import br.edu.infnet.lojadeaplicativo.model.domain.Livros;

public class AplicativoTest {

	public static void main(String[] args) {
		Jogos j1 = new Jogos(1, " Stardew Valley", 25, " ConcernedApe", " Simulação", " 2019",
				" Mude-se para o campo e cultive uma nova vida agrícola neste premiado RPG de simulação agrícola sem fim!",
				true);
		Livros l1 = new Livros(2, " Do mil ao milhão: Sem cortar o cafezinho", 24, " Thiago Nigro",
				" Os três pilares para atingir a independência financeira", 2018, " E-Book", true);
		Apps a1 = new Apps(3, " Universe in a Nutshell", 19, " 2020", " Educação", " Descubra o seu lugar no universo",
				" Wait But Why & Kurzgesagt");
		System.out.println("Jogo: " + j1 + "\nLivro: " + l1 + "\nApp: " + a1);
	}
}