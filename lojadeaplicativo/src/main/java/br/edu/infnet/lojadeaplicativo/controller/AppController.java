package br.edu.infnet.lojadeaplicativo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.lojadeaplicativo.model.domain.App;
import br.edu.infnet.lojadeaplicativo.model.repository.AppRepository;

@Controller
public class AppController {
	
	private String msg;

	@GetMapping(value = "/app/cadastro")
	public String telaCadastro() {

		return "app/cadastro";
	}

	@GetMapping(value = "/app/lista")
	public String telaLista(Model model) {

		model.addAttribute("apps", AppRepository.obterLista());

		model.addAttribute("mensagem", msg);

		msg = null;

		return "app/lista";
	}

	@PostMapping(value = "/app/incluir")
	public String incluir(App app) {

		AppRepository.incluir(app);

		msg = "A inclusão do app " + app.getNome() + " foi realizada com sucesso!";

		return "redirect:/app/lista";
	}

	@GetMapping(value="/app/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		App app = AppRepository.excluir(id);

		msg = "A exclusão do app " + app.getNome() + " foi realizada com sucesso!";

		return "redirect:/app/lista";
	}
}