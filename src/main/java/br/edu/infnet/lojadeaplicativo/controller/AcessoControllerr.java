package br.edu.infnet.lojadeaplicativo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.lojadeaplicativo.model.domain.Usuario;
import br.edu.infnet.lojadeaplicativo.model.service.UsuarioService;

@Controller
@SessionAttributes("usuario")
public class AcessoControllerr {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/login")
	public String telaLogin() {

		return "login";
	}
	
	@PostMapping(value = "/login")
	public String login(Model model, @RequestParam String email, @RequestParam String senha) {
		
		Usuario usuario = new Usuario(email, senha);
		usuario = usuarioService.autenticar(usuario);

		if(usuario != null) {
			
			model.addAttribute("usuario", usuario);		
			
			return "redirect:/home";
		}
		
		model.addAttribute("mensagem", "As credenciais de acesso para o e-mail "+ email +" estão incorretas!");

		return telaLogin();
	}
	
	@GetMapping(value = "/logout")
	public String logout(HttpSession session, SessionStatus status) {
		
		status.setComplete();
		session.removeAttribute("usuario");
		
		return "redirect:/";
	}
}