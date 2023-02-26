package br.edu.infnet.lojadeaplicativo.model.repository;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.lojadeaplicativo.model.domain.Usuario;

public class UsuarioRepository {

	private static List<Usuario> Lista = new ArrayList<Usuario>();
	
	public static boolean incluir(Usuario usuario) {
		
		try {
			Lista.add(usuario);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static List<Usuario> obterLista() {
		return Lista;
	}
}