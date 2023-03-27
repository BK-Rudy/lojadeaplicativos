package br.edu.infnet.lojadeaplicativo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.lojadeaplicativo.model.domain.Livro;
import br.edu.infnet.lojadeaplicativo.model.domain.Usuario;
import br.edu.infnet.lojadeaplicativo.model.service.LivroService;

@Controller
public class LivroController {
    @Autowired
    private LivroService livroService;

    private String msgAlerta;

    @GetMapping(value = "/livro")
    public String telaCadastro() {
        return "livro/cadastro";
    }

    @GetMapping(value = "/livro/lista")
    public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {
        
    	model.addAttribute("livros", livroService.obterLista(usuario));
        model.addAttribute("mensagem", msgAlerta);
        
        msgAlerta = null;

        return "livro/lista";
    }

    @PostMapping(value = "/livro/incluir")
    public String incluir(Livro livro, @SessionAttribute("usuario") Usuario usuario) {
    	
    	livro.setUsuario(usuario);
    	livroService.incluir(livro);

        msgAlerta = "Inclusão realizada com sucesso!";

        return "redirect:/livro/lista";
    }

    @GetMapping(value = "/livro/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
    	livroService.excluir(id);

        msgAlerta = "Exclusão realizada com sucesso!";

        return "redirect:/livro/lista";
    }
}