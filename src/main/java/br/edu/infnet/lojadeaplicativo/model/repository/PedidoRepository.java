package br.edu.infnet.lojadeaplicativo.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.lojadeaplicativo.model.domain.Pedido;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Integer>{
	
    @Query("from Pedido p where p.usuario.id = :id")
    List<Pedido> obterLista(Integer id);
}