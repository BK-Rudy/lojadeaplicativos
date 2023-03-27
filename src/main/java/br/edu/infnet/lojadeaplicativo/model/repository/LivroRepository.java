package br.edu.infnet.lojadeaplicativo.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.lojadeaplicativo.model.domain.Livro;

@Repository
public interface LivroRepository extends CrudRepository<Livro, Integer>{

	@Query("from Livro a where a.usuario.id = :id")
	List<Livro> ObterLista(Integer id);
}