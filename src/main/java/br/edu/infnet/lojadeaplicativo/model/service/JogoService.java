package br.edu.infnet.lojadeaplicativo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import br.edu.infnet.lojadeaplicativo.model.domain.Jogo;
import br.edu.infnet.lojadeaplicativo.model.domain.Usuario;
import br.edu.infnet.lojadeaplicativo.model.repository.JogoRepository;

@Service
public class JogoService {

	@Autowired
	private JogoRepository jogoRepository;

	public Jogo incluir(Jogo jogo) {
		return jogoRepository.save(jogo);
	}

	public void excluir(Integer key) {
		jogoRepository.deleteById(key);
	}

	public Collection<Jogo> obterLista() {
		return (Collection<Jogo>) jogoRepository.findAll();
	}
	
	public Collection<Jogo> obterLista(Usuario usuario) {
		return (Collection<Jogo>) jogoRepository.obterLista(usuario.getId(), Sort.by(Direction.ASC, "nome"));
	}
	
	public Jogo obterLista(Integer id){
        return jogoRepository.findById(id).orElse(null);
    }
}