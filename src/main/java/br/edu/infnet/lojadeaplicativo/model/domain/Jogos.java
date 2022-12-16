package br.edu.infnet.lojadeaplicativo.model.domain;

import br.edu.infnet.lojadeaplicativo.model.exceptions.AnoLancamentoNaoPreenchidoException;

public class Jogos extends Aplicativo {

	private String desenvolvedor;
	private String genero;
	private String anoLancamento;
	private String descricaoJogo;
	private boolean classificacaoLivre;
	
	public Jogos(int id, String nome, float valor, String desenvolvedor, String genero, String anoLancamento, String descricaoJogo, boolean classificacaoLivre) {
		super(id, nome, valor);
		this.desenvolvedor = desenvolvedor;
		this.genero = genero;
		this.anoLancamento = anoLancamento;
		this.descricaoJogo = descricaoJogo;
		this.classificacaoLivre = classificacaoLivre;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.desenvolvedor);
		sb.append(";");
		sb.append(this.genero);
		sb.append(";");
		sb.append(this.anoLancamento);
		sb.append(";");
		sb.append(this.descricaoJogo);
		sb.append(";");
		sb.append(this.classificacaoLivre ? "Classificação Livre" : "Classificação etária restrita");
		
		return sb.toString();
	}
	
	public String getDesenvolvedor() {
		return desenvolvedor;
	}

	public void setDesenvolvedor(String desenvolvedor) {
		this.desenvolvedor = desenvolvedor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getDescricaoJogo() {
		return descricaoJogo;
	}

	public void setDescricaoJogo(String descricaoJogo) {
		this.descricaoJogo = descricaoJogo;
	}

	public boolean isClassificacaoLivre() {
		return classificacaoLivre;
	}

	public void setClassificacaoLivre(boolean classificacaoLivre) {
		this.classificacaoLivre = classificacaoLivre;
	}

	@Override
	public float calcularOferta() throws AnoLancamentoNaoPreenchidoException {
		
		if(this.anoLancamento.isBlank()) {
		   throw new AnoLancamentoNaoPreenchidoException("Não foi informado o ano de lançamento");
		}
		float valorReturn;
		
		if ("2020".equalsIgnoreCase(anoLancamento)) {
			valorReturn = (float) (this.valor * 0.90);
		}
		
		else {
			valorReturn = this.valor;
		}
		
		return  valorReturn;
	}
}