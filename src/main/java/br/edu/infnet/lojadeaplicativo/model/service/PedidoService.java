package br.edu.infnet.lojadeaplicativo.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.lojadeaplicativo.model.domain.Pedido;
import br.edu.infnet.lojadeaplicativo.model.domain.Usuario;
import br.edu.infnet.lojadeaplicativo.model.repository.PedidoRepository;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido incluir(Pedido Pedido) {
        return pedidoRepository.save(Pedido); 
    }

    public void excluir(Integer key){
        pedidoRepository.deleteById(key);
    }

    public Collection<Pedido> obterLista(){
        return (Collection<Pedido>) pedidoRepository.findAll();
    }

    public Collection<Pedido> obterLista(Usuario usuario){
        return (Collection<Pedido>) pedidoRepository.obterLista(usuario.getId());
    }

    public Pedido obterLista(Integer id){
        return pedidoRepository.findById(id).orElse(null);
    }
}