package br.edu.infnet.lojadeaplicativo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.lojadeaplicativo.model.domain.Criador;
import br.edu.infnet.lojadeaplicativo.model.domain.Usuario;
import br.edu.infnet.lojadeaplicativo.model.service.CriadorService;

@Controller
public class CriadorController {

	@Autowired
	private CriadorService criadorService;
	
	private String msg;

	@GetMapping(value = "/criador/cadastro")
	public String telaCadastro() {

		return "criador/cadastro";
	}

	@GetMapping(value = "/criador/lista")
	public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {

		model.addAttribute("criadores", criadorService.obterLista());

		model.addAttribute("mensagem", msg);

		msg = null;

		return "criador/lista";
	}

	@PostMapping(value = "/criador/incluir")
	public String incluir(Criador criador, @SessionAttribute("usuario") Usuario usuario) {

		criador.setUsuario(usuario);
		criadorService.incluir(criador);

		msg = "A inclusão do criador/autor " + criador.getNome() + " foi realizada com sucesso!";

		return "redirect:/criador/lista";
	}

	@GetMapping(value="/criador/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		criadorService.excluir(id);

		msg = "A exclusão do criador/autor " + id + " foi realizada com sucesso!";

		return "redirect:/criador/lista";
	}
}