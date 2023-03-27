package br.edu.infnet.lojadeaplicativo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.lojadeaplicativo.model.domain.App;
import br.edu.infnet.lojadeaplicativo.model.domain.Usuario;
import br.edu.infnet.lojadeaplicativo.model.service.AppService;

@Controller
public class AppController {
    @Autowired
    private AppService appService;

    private String msgAlerta;

    @GetMapping(value = "/app")
    public String telaCadastro() {
        return "app/cadastro";
    }

    @GetMapping(value = "/app/lista")
    public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {
        
    	model.addAttribute("apps", appService.obterLista(usuario));
        model.addAttribute("mensagem", msgAlerta);
        
        msgAlerta = null;

        return "app/lista";
    }

    @PostMapping(value = "/app/incluir")
    public String incluir(App app, @SessionAttribute("usuario") Usuario usuario) {
    	
    	app.setUsuario(usuario);
    	appService.incluir(app);

        msgAlerta = "Inclusão realizada com sucesso!";

        return "redirect:/app/lista";
    }

    @GetMapping(value = "/app/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
    	appService.excluir(id);

        msgAlerta = "Exclusão realizada com sucesso!";

        return "redirect:/app/lista";
    }
}