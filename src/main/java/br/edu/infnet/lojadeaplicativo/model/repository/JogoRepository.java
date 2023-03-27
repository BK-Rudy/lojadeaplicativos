package br.edu.infnet.lojadeaplicativo.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.lojadeaplicativo.model.domain.Jogo;

@Repository
public interface JogoRepository extends CrudRepository<Jogo, Integer>{

	@Query("from Jogo a where a.usuario.id = :id")
	List<Jogo> ObterLista(Integer id);
}