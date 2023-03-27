package br.edu.infnet.lojadeaplicativo.model.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.lojadeaplicativo.model.domain.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer>{

	@Query("from Cliente a where a.usuario.id = :id")
	List<Cliente> ObterLista(Integer id);
}