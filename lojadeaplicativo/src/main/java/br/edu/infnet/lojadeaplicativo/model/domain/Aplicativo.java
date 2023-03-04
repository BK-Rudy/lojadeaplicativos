package br.edu.infnet.lojadeaplicativo.model.domain;

import br.edu.infnet.lojadeaplicativo.model.exceptions.AnoLancamentoNaoPreenchidoException;
import br.edu.infnet.lojadeaplicativo.model.exceptions.CategoriaAppNaoPreenchidaException;
import br.edu.infnet.lojadeaplicativo.model.exceptions.FormatoNaoPreenchidoException;

public abstract class Aplicativo {

	protected int id;
	protected String nome;
	protected float valor;

	public Aplicativo(int id, String nome, float valor) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}

	public abstract float calcularOferta() throws AnoLancamentoNaoPreenchidoException, FormatoNaoPreenchidoException,
			CategoriaAppNaoPreenchidaException;

	public String getAplicativo() throws AnoLancamentoNaoPreenchidoException, CategoriaAppNaoPreenchidaException,
			FormatoNaoPreenchidoException {
		StringBuilder sb = new StringBuilder();
		sb.append(this.nome);
		sb.append(";");
		sb.append(this.calcularOferta());

		return sb.toString();
	}

	@Override
	public String toString() {
		return String.format("%d;%s;%f", this.id, this.nome, this.valor);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
}