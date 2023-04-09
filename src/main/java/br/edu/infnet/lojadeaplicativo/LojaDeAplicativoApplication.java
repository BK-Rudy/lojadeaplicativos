package br.edu.infnet.lojadeaplicativo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class LojaDeAplicativoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaDeAplicativoApplication.class, args);
	}

}