package br.edu.infnet.lojadeaplicativo.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.lojadeaplicativo.model.domain.App;

@Repository
public interface AppRepository extends CrudRepository<App, Integer>{

	@Query("from App a where a.usuario.id = :id")
	List<App> obterLista(Integer id, Sort sort);
}