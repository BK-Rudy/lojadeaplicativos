package br.edu.infnet.lojadeaplicativo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.lojadeaplicativo.model.domain.Jogo;
import br.edu.infnet.lojadeaplicativo.model.domain.Usuario;
import br.edu.infnet.lojadeaplicativo.model.service.JogoService;

@Controller
public class JogoController {
    @Autowired
    private JogoService jogoService;

    private String msgAlerta;

    @GetMapping(value = "/jogo")
    public String telaCadastro() {
        return "jogo/cadastro";
    }

    @GetMapping(value = "/jogo/lista")
    public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {
        
    	model.addAttribute("jogos", jogoService.obterLista(usuario));
        model.addAttribute("mensagem", msgAlerta);
        
        msgAlerta = null;

        return "jogo/lista";
    }

    @PostMapping(value = "/jogo/incluir")
    public String incluir(Jogo jogo, @SessionAttribute("usuario") Usuario usuario) {
    	
    	jogo.setUsuario(usuario);
    	jogoService.incluir(jogo);

        msgAlerta = "Inclusão realizada com sucesso!";

        return "redirect:/jogo/lista";
    }

    @GetMapping(value = "/jogo/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
    	jogoService.excluir(id);

        msgAlerta = "Exclusão realizada com sucesso!";

        return "redirect:/jogo/lista";
    }
}