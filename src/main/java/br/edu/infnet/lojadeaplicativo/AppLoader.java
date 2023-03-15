package br.edu.infnet.lojadeaplicativo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.lojadeaplicativo.model.domain.App;
import br.edu.infnet.lojadeaplicativo.model.service.AppService;

@Order(3)
@Component
public class AppLoader implements ApplicationRunner {

	@Autowired
	private AppService appService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		try {
			String arq = "apps.txt";

			try {
				FileReader fileR = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileR);

				String linha = leitura.readLine();
				String[] campos = null;

				while (linha != null) {

					campos = linha.split(";");

					App app = new App(campos[0], Float.parseFloat(campos[1]), campos[2], Integer.parseInt(campos[3]),
							campos[4], Integer.parseInt(campos[5]));

					appService.incluir(app);

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