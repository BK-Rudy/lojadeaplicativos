package br.edu.infnet.lojadeaplicativo.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.lojadeaplicativo.model.exceptions.CategoriaAppNaoPreenchidaException;

@Entity
@Table(name = "TableApp")
public class App extends Produto {

	private String categoria;
	private int totalDownloads;
	private Boolean idadeRestrita = false;

	public App() {

	}

	public App(String nome, float valor, String anoLancamento, Boolean idadeRestrita, String categoria, int totalDownloads) {
		super(nome, valor, anoLancamento);

		this.categoria = categoria;
		this.totalDownloads = totalDownloads;
		this.idadeRestrita = (this.idadeRestrita == null) ? false : idadeRestrita;

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
	
	public boolean isIdadeRestrita() {
        return idadeRestrita;
    }
    public void setIdadeRestrita(boolean idadeRestrita) {
        this.idadeRestrita = idadeRestrita;
    }
}