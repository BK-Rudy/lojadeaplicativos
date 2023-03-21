package br.edu.infnet.lojadeaplicativo.model.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.lojadeaplicativo.model.domain.Criador;

@Repository
public interface CriadorRepository extends CrudRepository<Criador, Integer>{

	@Query("from Criador a where a.usuario.id = :userId")
	List<Criador> ObterLista(Integer userId);
}