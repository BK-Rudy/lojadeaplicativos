package br.edu.infnet.lojadeaplicativo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.lojadeaplicativo.model.domain.Usuario;
import br.edu.infnet.lojadeaplicativo.model.service.UsuarioService;

@Order(1)
@Component
public class UsuarioLoader implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Usuario usuario1 = new Usuario("Bruno Rudy", "bruno.rudy@al.infnet.edu.br", "123456");
		usuario1.setTipo(true);

		usuarioService.incluir(usuario1);

		for (int i = 0; i < 9; i++) {
			Usuario usuario = new Usuario("Usuario " + i, "usuario@" + i + "usuario.com", "0" + i);
			usuarioService.incluir(usuario);
		}	
	}
}