package br.edu.infnet.lojadeaplicativo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.lojadeaplicativo.model.domain.Livro;
import br.edu.infnet.lojadeaplicativo.model.domain.Usuario;
import br.edu.infnet.lojadeaplicativo.model.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livroRepository;

	public Livro incluir(Livro livro) {
		return livroRepository.save(livro);
	}

	public void excluir(Integer key) {
		livroRepository.deleteById(key);
	}

	public Collection<Livro> obterLista() {
		return (Collection<Livro>) livroRepository.findAll();
	}
	
	public Collection<Livro> obterLista(Usuario usuario) {
		return (Collection<Livro>) livroRepository.ObterLista(usuario.getId());
	}
	
	public Livro obterLista(Integer id){
        return livroRepository.findById(id).orElse(null);
    }
}