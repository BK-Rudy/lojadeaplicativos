package br.edu.infnet.lojadeaplicativo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.lojadeaplicativo.model.domain.Criador;
import br.edu.infnet.lojadeaplicativo.model.domain.Usuario;
import br.edu.infnet.lojadeaplicativo.model.repository.CriadorRepository;

@Service
public class CriadorService {

	@Autowired
	private CriadorRepository criadorRepository;

	public Criador incluir(Criador criador) {
		return criadorRepository.save(criador);
	}

	public void excluir(Integer key) {
		criadorRepository.deleteById(key);
	}

	public Collection<Criador> obterLista() {
		return (Collection<Criador>) criadorRepository.findAll();
	}
	
	public Collection<Criador> obterLista(Usuario usuario) {
		return (Collection<Criador>) criadorRepository.ObterLista(usuario.getId());
	}
}