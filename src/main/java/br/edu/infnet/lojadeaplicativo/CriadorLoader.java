package br.edu.infnet.lojadeaplicativo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.lojadeaplicativo.model.domain.Criador;
import br.edu.infnet.lojadeaplicativo.model.service.CriadorService;

@Order(2)
@Component
public class CriadorLoader implements ApplicationRunner {

	@Autowired
	private CriadorService criadorService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		try {
			String arq = "criadores.txt";

			try {
				FileReader fileR = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileR);

				String linha = leitura.readLine();
				String[] campos = null;

				while (linha != null) {

					campos = linha.split(";");

					Criador criador = new Criador(Integer.parseInt(campos[0]), campos[1], campos[2],
							campos[3], campos[4]);

					criadorService.incluir(criador);

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