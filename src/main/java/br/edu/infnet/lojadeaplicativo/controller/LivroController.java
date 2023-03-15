package br.edu.infnet.lojadeaplicativo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.lojadeaplicativo.model.domain.Livro;
import br.edu.infnet.lojadeaplicativo.model.service.LivroService;

@Controller
public class LivroController {
	
	@Autowired
	private LivroService livroService;
	
	private String msg;

	@GetMapping(value = "/livro/cadastro")
	public String telaCadastro() {

		return "livro/cadastro";
	}

	@GetMapping(value = "/livro/lista")
	public String telaLista(Model model) {

		model.addAttribute("livros", livroService.obterLista());

		model.addAttribute("mensagem", msg);

		msg = null;

		return "livro/lista";
	}

	@PostMapping(value = "/livro/incluir")
	public String incluir(Livro livro) {

		livroService.incluir(livro);

		msg = "A inclusão do livro " + livro.getNome() + " foi realizada com sucesso!";
		
		return "redirect:/livro/lista";
	}

	@GetMapping(value="/livro/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		Livro livro = livroService.excluir(id);

		msg = "A exclusão do livro " + livro.getNome() + " foi realizada com sucesso!";

		return "redirect:/livro/lista";
	}
}