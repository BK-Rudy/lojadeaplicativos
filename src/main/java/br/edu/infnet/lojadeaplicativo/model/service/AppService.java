package br.edu.infnet.lojadeaplicativo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.lojadeaplicativo.model.domain.App;
import br.edu.infnet.lojadeaplicativo.model.repository.AppRepository;

@Service
public class AppService {

	@Autowired
	private AppRepository appRepository;

	public boolean incluir(App app) {
		return appRepository.incluir(app);
	}
	
	public App excluir(Integer key) {
		return appRepository.excluir(key);
	}
	
	public Collection<App> obterLista() {
		return appRepository.obterLista();
	}
}