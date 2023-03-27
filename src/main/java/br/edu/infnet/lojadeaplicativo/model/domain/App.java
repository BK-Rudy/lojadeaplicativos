package br.edu.infnet.lojadeaplicativo.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.lojadeaplicativo.model.exceptions.CategoriaAppNaoPreenchidaException;

@Entity
@Table(name = "TableApp")
public class App extends Produto {

	private int idadeRestrita;
	private String categoria;
	private int totalDownloads;

	public App() {

	}

	public App(String nome, float valor, String anoLancamento, int idadeRestrita, String categoria, int totalDownloads) {
		super(nome, valor, anoLancamento);

		this.setIdadeRestrita(idadeRestrita);
		this.setCategoria(categoria);
		this.setTotalDownloads(totalDownloads);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(categoria);
		sb.append(";");
		sb.append(idadeRestrita);
		sb.append(";");
		sb.append(totalDownloads);

		return sb.toString();
	}

	@Override
	public double calcularOferta() throws CategoriaAppNaoPreenchidaException {

		if (this.categoria.isBlank()) {
			throw new CategoriaAppNaoPreenchidaException("Não foi informado a categoria do aplicativo");
		}
		double valorReturn;

		if ("Medicina".equalsIgnoreCase(categoria)) {
			valorReturn = (float) (this.valor * 0.60);
		}

		else {
			valorReturn = this.valor;
		}
		return valorReturn;
	}

	public int getIdadeRestrita() {
		return idadeRestrita;
	}

	private void setIdadeRestrita(int idadeRestrita) {
		this.idadeRestrita = idadeRestrita;
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getTotalDownloads() {
		return totalDownloads;
	}

	public void setTotalDownloads(int totalDownloads) {
		this.totalDownloads = totalDownloads;
	}
}