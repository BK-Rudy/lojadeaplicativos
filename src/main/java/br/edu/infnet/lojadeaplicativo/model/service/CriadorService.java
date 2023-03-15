package br.edu.infnet.lojadeaplicativo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.lojadeaplicativo.model.domain.Criador;
import br.edu.infnet.lojadeaplicativo.model.repository.CriadorRepository;

@Service
public class CriadorService {

	@Autowired
	private CriadorRepository criadorRepository;

	public boolean incluir(Criador criador) {
		return criadorRepository.incluir(criador);
	}
	
	public Criador excluir(Integer key) {
		return criadorRepository.excluir(key);
	}
	
	public Collection<Criador> obterLista() {
		return criadorRepository.obterLista();
	}
}