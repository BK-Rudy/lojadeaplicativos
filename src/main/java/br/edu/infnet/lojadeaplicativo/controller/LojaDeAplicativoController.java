package br.edu.infnet.lojadeaplicativo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LojaDeAplicativoController {
	
	@GetMapping(value="/")
	public String telaIndex() {
		return "index";
	}
}