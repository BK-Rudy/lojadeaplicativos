package br.edu.infnet.lojadeaplicativo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.lojadeaplicativo.model.domain.App;
import br.edu.infnet.lojadeaplicativo.model.domain.Usuario;
import br.edu.infnet.lojadeaplicativo.model.repository.AppRepository;

@Service
public class AppService {

	@Autowired
	private AppRepository appRepository;

	public App incluir(App app) {
		return appRepository.save(app);
	}

	public void excluir(Integer key) {
		appRepository.deleteById(key);
	}

	public Collection<App> obterLista() {
		return (Collection<App>) appRepository.findAll();
	}
	
	public Collection<App> obterLista(Usuario usuario) {
		return (Collection<App>) appRepository.ObterLista(usuario.getId());
	}
	
	public App obterLista(Integer id){
        return appRepository.findById(id).orElse(null);
    }
}