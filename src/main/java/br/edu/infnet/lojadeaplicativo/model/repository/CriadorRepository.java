package br.edu.infnet.lojadeaplicativo.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.lojadeaplicativo.model.domain.Criador;

@Repository
public class CriadorRepository {
	private static Integer id = 1;

	private static Map<Integer, Criador> mapaCriador = new HashMap<Integer, Criador>();

	public boolean incluir(Criador criador) {

		criador.setId(id++);

		try {
			mapaCriador.put(criador.getId(), criador);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static Criador excluir(Integer key) {

		return mapaCriador.remove(key);
	}

	public static Collection<Criador> obterLista() {
		
		return mapaCriador.values();
	}
}