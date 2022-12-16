package br.edu.infnet.lojadeaplicativo.model.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import br.edu.infnet.lojadeaplicativo.model.domain.Apps;
import br.edu.infnet.lojadeaplicativo.model.domain.Cliente;
import br.edu.infnet.lojadeaplicativo.model.domain.Jogos;
import br.edu.infnet.lojadeaplicativo.model.domain.Livros;
import br.edu.infnet.lojadeaplicativo.model.domain.Pedido;
import br.edu.infnet.lojadeaplicativo.model.exceptions.FormatoNaoPreenchidoException;
import br.edu.infnet.lojadeaplicativo.model.exceptions.AnoLancamentoNaoPreenchidoException;
import br.edu.infnet.lojadeaplicativo.model.exceptions.CategoriaAppNaoPreenchidaException;

public class LojaDeAplicativoApplicationTest {

	public static void main(String[] args) {
		String dir = System.getProperty("user.dir");
		String arqSaida = "\\src\\main\\resources\\static\\pedido_out.txt";
		String arq = "/src/main/resources/static/pedido.txt";

		try {		
			FileWriter fileW = new FileWriter(dir + arqSaida);
			BufferedWriter escrita = new BufferedWriter(fileW);
				
			FileReader file = new FileReader(dir + arq);
			BufferedReader leitura = new BufferedReader(file);
			
			StringBuilder sbOut = new StringBuilder();
			
			try {
				String linha = leitura.readLine();
				System.out.println(linha);

				while (linha != null) {
					String[] campos = linha.split(";");

					switch (campos[0].toUpperCase()) {
					case "C":
						Cliente compradorC1 = new Cliente(Integer.valueOf(campos[1]), campos[2], campos[3], campos[4], campos[5]);
						Pedido p1 = new Pedido(compradorC1, "Pedido Realizado");
						sbOut.append(p1.obterPedido()+"\r\n");
						break;

					case "J":
						Jogos j1 = new Jogos(Integer.valueOf(campos[1]), campos[2], Float.valueOf(campos[3]), campos[4], campos[5], campos[6], campos[7],"S".equalsIgnoreCase(campos[8]));
						sbOut.append(j1.getAplicativo()+"\r\n");
						break;

					case "A":
						Apps a1 = new Apps(Integer.valueOf(campos[1]), campos[2], Float.valueOf(campos[3]), campos[4], campos[5], campos[6], campos[7]);
						sbOut.append(a1.getAplicativo()+"\r\n");
						break;

					case "L":
						Livros l1 = new Livros(Integer.valueOf(campos[1]), campos[2], Float.valueOf(campos[3]), campos[4], campos[5], Integer.valueOf(campos[6]), campos[7], "S".equalsIgnoreCase(campos[8]));
						sbOut.append(l1.getAplicativo()+"\r\n");
						break;

					default:
						System.out.println("Entrada inválida!!!");
						break;
					}
					linha = leitura.readLine();
				}
				escrita.write(sbOut.toString());;
			} 
			
			catch (FormatoNaoPreenchidoException| AnoLancamentoNaoPreenchidoException| CategoriaAppNaoPreenchidaException | IOException e) {
				System.out.println(e.getMessage());
			}
			
			finally {
				leitura.close();
				
				if(escrita!= null) {
					escrita.close();
				}
				fileW.close();
			}
		}
		
		catch(IOException e) {
			System.out.println(e.getMessage());		
		} 
		
		finally {
			System.out.println("Processamento finalizado: "+(dir + arqSaida)+"!!!");
		}
	}
}