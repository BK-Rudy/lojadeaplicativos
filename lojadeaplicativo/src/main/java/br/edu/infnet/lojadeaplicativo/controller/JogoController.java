package br.edu.infnet.lojadeaplicativo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.lojadeaplicativo.model.domain.Jogo;
import br.edu.infnet.lojadeaplicativo.model.repository.JogoRepository;

@Controller
public class JogoController {
	private String msg;

	@GetMapping(value = "/jogo/cadastro")
	public String telaCadastro() {

		return "jogo/cadastro";
	}

	@GetMapping(value = "/jogo/lista")
	public String telaLista(Model model) {

		model.addAttribute("jogos", JogoRepository.obterLista());

		model.addAttribute("mensagem", msg);

		msg = null;

		return "jogo/lista";
	}

	@PostMapping(value = "/jogo/incluir")
	public String incluir(Jogo jogo) {
		
		JogoRepository.incluir(jogo);

		msg = "A inclusão do jogo " + jogo.getNome() + " foi realizada com sucesso!";
		
		return "redirect:/jogo/lista";
	}

	@GetMapping(value="/jogo/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		Jogo jogo = JogoRepository.excluir(id);

		msg = "A exclusão do jogo " + jogo.getNome() + " foi realizada com sucesso!";

		return "redirect:/jogo/lista";
	}
}