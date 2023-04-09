package br.edu.infnet.lojadeaplicativo.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.lojadeaplicativo.model.domain.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
	
    @Query("from Produto d where d.usuario.id = :id")
	List<Produto> obterLista(Integer id, Sort sort);
}