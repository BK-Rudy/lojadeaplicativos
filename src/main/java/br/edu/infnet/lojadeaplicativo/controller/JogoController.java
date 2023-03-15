package br.edu.infnet.lojadeaplicativo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.lojadeaplicativo.model.domain.Jogo;
import br.edu.infnet.lojadeaplicativo.model.service.JogoService;

@Controller
public class JogoController {
	
	@Autowired
	private JogoService jogoService;
	
	private String msg;

	@GetMapping(value = "/jogo/cadastro")
	public String telaCadastro() {

		return "jogo/cadastro";
	}

	@GetMapping(value = "/jogo/lista")
	public String telaLista(Model model) {

		model.addAttribute("jogos", jogoService.obterLista());

		model.addAttribute("mensagem", msg);

		msg = null;

		return "jogo/lista";
	}

	@PostMapping(value = "/jogo/incluir")
	public String incluir(Jogo jogo) {
		
		jogoService.incluir(jogo);

		msg = "A inclusão do jogo " + jogo.getNome() + " foi realizada com sucesso!";
		
		return "redirect:/jogo/lista";
	}

	@GetMapping(value="/jogo/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		Jogo jogo = jogoService.excluir(id);

		msg = "A exclusão do jogo " + jogo.getNome() + " foi realizada com sucesso!";

		return "redirect:/jogo/lista";
	}
}