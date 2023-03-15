package br.edu.infnet.lojadeaplicativo.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.lojadeaplicativo.model.domain.App;

@Repository
public class AppRepository {

	private static Integer id = 1;
	
	private static Map<Integer, App> mapaApp = new HashMap<Integer, App>();  
	
	public boolean incluir(App app) {
		
	app.setId(id++);
		
	try {
		mapaApp.put(app.getId(), app);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static App excluir(Integer key) {
				
		return mapaApp.remove(key);
	}
	
	public static Collection<App> obterLista(){
		return mapaApp.values();
		
	}
}