package br.edu.infnet.lojadeaplicativo.model.domain;

import br.edu.infnet.lojadeaplicativo.model.exceptions.AnoLancamentoNaoPreenchidoException;
import br.edu.infnet.lojadeaplicativo.model.exceptions.CategoriaAppNaoPreenchidaException;
import br.edu.infnet.lojadeaplicativo.model.exceptions.FormatoNaoPreenchidoException;

public abstract class Produto {

	protected String nome;
	protected float valor;
	protected String anoLancamento;

	public Produto(String nome, float valor, String anoLancamento) {
		this.nome = nome;
		this.valor = valor;
		this.anoLancamento = anoLancamento;
	}

	public abstract double calcularOferta() throws AnoLancamentoNaoPreenchidoException, FormatoNaoPreenchidoException,
			CategoriaAppNaoPreenchidaException;

	public String getAplicativo() throws AnoLancamentoNaoPreenchidoException, CategoriaAppNaoPreenchidaException,
			FormatoNaoPreenchidoException {
		StringBuilder sb = new StringBuilder();
		sb.append(this.valor);
		sb.append(";");
		sb.append(this.calcularOferta());

		return sb.toString();
	}

	@Override
	public String toString() {
		return String.format("%d;%s;%f", this.nome, this.valor, this.anoLancamento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
}