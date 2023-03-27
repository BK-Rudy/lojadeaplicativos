package br.edu.infnet.lojadeaplicativo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.lojadeaplicativo.model.domain.Livro;
import br.edu.infnet.lojadeaplicativo.model.domain.Usuario;
import br.edu.infnet.lojadeaplicativo.model.service.LivroService;

@Order(5)
@Component
public class LivroLoader implements ApplicationRunner {

	@Autowired
	private LivroService livroService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		try {
			String arq = "livros.txt";

			try {
				FileReader fileR = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileR);

				String linha = leitura.readLine();
				String[] campos = null;

				while (linha != null) {

					campos = linha.split(";");

					Livro livro = new Livro(campos[1], Float.valueOf(campos[2]), campos[3], campos[4], Integer.valueOf(campos[5]), campos[6]);
					
					Usuario usuario = new Usuario();
					usuario.setId(1);

					livro.setUsuario(usuario);
					
					livroService.incluir(livro);

					linha = leitura.readLine();

				}

				leitura.close();
				fileR.close();

			}

			catch (IOException e) {
				System.out.println("[ERRO] " + e.getMessage());
			}
		}

		finally {
			System.out.println("Processamento realizado com sucesso!!!");
		}
	}
}