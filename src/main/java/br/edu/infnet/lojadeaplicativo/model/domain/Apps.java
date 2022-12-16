package br.edu.infnet.lojadeaplicativo.model.domain;

import br.edu.infnet.lojadeaplicativo.model.exceptions.CategoriaAppNaoPreenchidaException;

public class Apps extends Aplicativo {

	private String anoLancamento;
	private String categoria;
	private String descricaoApp;
	private String desenvolvedorApp;
	
	public Apps(int id, String nome, float valor, String anoLancamento, String categoria, String descricaoApp, String desenvolvedorApp ) {
		super(id, nome, valor);
		this.anoLancamento = anoLancamento;
		this.categoria = categoria;
		this.descricaoApp = descricaoApp;
		this.desenvolvedorApp = desenvolvedorApp;		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.anoLancamento);
		sb.append(";");
		sb.append(this.categoria);
		sb.append(";");
		sb.append(this.descricaoApp);
		sb.append(";");
		sb.append(this.desenvolvedorApp);
		
		return sb.toString();
	}

	@Override
	public float calcularOferta() throws CategoriaAppNaoPreenchidaException {
		
		if(this.categoria.isBlank()) {
			   throw new CategoriaAppNaoPreenchidaException("Não foi informado a categoria do aplicativo");
			}		
		float valorReturn;
		
		if ("Medicina".equalsIgnoreCase(categoria)) {
			valorReturn = (float) (this.valor * 0.60);
		}
		
		else {
			valorReturn = this.valor;
		}
		return valorReturn;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricaoApp() {
		return descricaoApp;
	}

	public void setDescricaoApp(String descricaoApp) {
		this.descricaoApp = descricaoApp;
	}

	public String getDesenvolvedorApp() {
		return desenvolvedorApp;
	}

	public void setDesenvolvedorApp(String desenvolvedorApp) {
		this.desenvolvedorApp = desenvolvedorApp;
	}
}