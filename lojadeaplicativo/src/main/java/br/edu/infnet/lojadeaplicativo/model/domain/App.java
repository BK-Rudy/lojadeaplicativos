package br.edu.infnet.lojadeaplicativo.model.domain;

import br.edu.infnet.lojadeaplicativo.model.exceptions.CategoriaAppNaoPreenchidaException;

public class App extends Produto {

    private Integer id;
	private int idadeRestrita;
	private String categoria;
	private int totalDowloads;
	
	public App(String nome, float valor, String anoLancamento, int idadeRestrita, String categoria,
			int totalDowloads) {
		super(nome, valor, anoLancamento);
		
		this.setIdadeRestrita(idadeRestrita);
		this.setCategoria(categoria);
		this.setTotalDowloads(totalDowloads);
		
		//duracao = valor
		// anoDeGravacao = anoLancamento
		// tipo = categoria
		// numeroDeMusicas = idadeRestrita
		// tempoConteudoBonus = totalDowloads
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getCategoria());
		sb.append(";");
		sb.append(this.getIdadeRestrita());
		sb.append(";");
		sb.append(this.getTotalDowloads());

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

	public int getTotalDowloads() {
		return totalDowloads;
	}

	public void setTotalDowloads(int totalDowloads) {
		this.totalDowloads = totalDowloads;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String construirLinha() {

		StringBuilder sb = new StringBuilder();

		sb.append(this.toString());
		sb.append("\r\n");

		return sb.toString();
	}
}