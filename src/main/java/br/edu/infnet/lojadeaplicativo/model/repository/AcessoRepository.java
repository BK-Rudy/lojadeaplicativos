package br.edu.infnet.lojadeaplicativo.model.repository;

import br.edu.infnet.lojadeaplicativo.model.domain.Usuario;

public class AcessoRepository {

	public static Usuario autenticar(Usuario usuario) {
		
		if (usuario.getEmail().equalsIgnoreCase(usuario.getSenha())) {
			return new Usuario("Admin", usuario.getEmail(), usuario.getSenha(), usuario.getTipo());
		}

		return null;
	}
}