package br.edu.infnet.lojadeaplicativo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.lojadeaplicativo.model.domain.Usuario;
import br.edu.infnet.lojadeaplicativo.model.service.ProdutoService;

@Controller
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    private String msgAlerta;

    @GetMapping(value = "/produto/lista")
    public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {
        model.addAttribute("produtos", produtoService.obterLista(usuario));
        
        model.addAttribute("mensagem", msgAlerta);
        msgAlerta = null;

        return "produto/lista";
    }

    @GetMapping(value = "/produto/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
    	produtoService.excluir(id);

        msgAlerta = "Exclussão realizada!";

        return "redirect:/produto/lista";
    }
}