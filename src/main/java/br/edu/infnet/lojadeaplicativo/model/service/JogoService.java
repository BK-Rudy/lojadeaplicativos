package br.edu.infnet.lojadeaplicativo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.lojadeaplicativo.model.domain.Jogo;
import br.edu.infnet.lojadeaplicativo.model.repository.JogoRepository;

@Service
public class JogoService {

	@Autowired
	private JogoRepository jogoRepository;

	public boolean incluir(Jogo jogo) {
		return jogoRepository.incluir(jogo);
	}
	
	public Jogo excluir(Integer key) {
		return jogoRepository.excluir(key);
	}
	
	public Collection<Jogo> obterLista() {
		return jogoRepository.obterLista();
	}
}