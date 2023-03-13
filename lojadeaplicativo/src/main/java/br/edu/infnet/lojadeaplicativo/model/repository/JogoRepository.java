package br.edu.infnet.lojadeaplicativo.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.lojadeaplicativo.model.domain.Jogo;

@Repository
public class JogoRepository {
	private static Integer id = 1;

	private static Map<Integer, Jogo> mapaJogo = new HashMap<Integer, Jogo>();

	public static boolean incluir(Jogo jogo) {

		jogo.setId(id++);

		try {
			mapaJogo.put(jogo.getId(), jogo);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static Jogo excluir(Integer key) {

		return mapaJogo.remove(key);
	}

	public static Collection<Jogo> obterLista() {
		return mapaJogo.values();
	}
}