package br.edu.infnet.lojadeaplicativo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LojaDeAplicativoController {

	@GetMapping(value = "/")
	public String telaindex() {
		return "index";
	}

	@GetMapping(value = "/home")
	public String telaHome() {
		return "index";
	}

}