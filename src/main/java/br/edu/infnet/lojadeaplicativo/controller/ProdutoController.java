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

    private String msg;

    @GetMapping(value = "/produto/lista")
    public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {
       
    	model.addAttribute("produtos", produtoService.obterLista(usuario));
        model.addAttribute("mensagem", msg);
        
        msg = null;

        return "produto/lista";
    }

    @GetMapping(value = "/produto/{id}/excluir")
    public String excluir(@PathVariable Integer id) {
    	 
    	try {
             produtoService.excluir(id);

             msg = "Produto excluído com sucesso!";
         } 
    	
    	catch (Exception e) {
             msg = "Impossível excluir o produto!";
         }
         
         return "redirect:/produto/lista";
    }
}