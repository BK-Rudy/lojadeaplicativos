package br.edu.infnet.lojadeaplicativo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.lojadeaplicativo.model.domain.Livro;
import br.edu.infnet.lojadeaplicativo.model.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livroRepository;

	public boolean incluir(Livro livro) {
		return livroRepository.incluir(livro);
	}
	
	public Livro excluir(Integer key) {
		return livroRepository.excluir(key);
	}
	
	public Collection<Livro> obterLista() {
		return livroRepository.obterLista();
	}
}