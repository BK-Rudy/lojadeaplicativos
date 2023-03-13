package br.edu.infnet.lojadeaplicativo.model.domain;

import br.edu.infnet.lojadeaplicativo.model.exceptions.AnoLancamentoNaoPreenchidoException;

public class Jogo extends Produto {

    private Integer id;
	private String desenvolvedora;
	private String genero;
	private int idadeRestrita;

	public Jogo(String nome, float valor, String anoLancamento, String desenvolvedora, 
			String genero, int idadeRestrita) {
		super(nome, valor, anoLancamento);

		this.setDesenvolvedora(desenvolvedora);
		this.setGenero(genero);
		this.setIdadeRestrita(idadeRestrita);
	}
	// duracao = valor
	// diretor = desenvolvedora
	// linkVideo = genero
	// numeroDeAtoresFigurantes = idadeRestrita
	
	@Override
	public double calcularOferta() throws AnoLancamentoNaoPreenchidoException {

		if (this.anoLancamento.isBlank()) {
			throw new AnoLancamentoNaoPreenchidoException("Não foi informado o ano de lançamento");
		}
		double valorReturn;

		if ("2020".equalsIgnoreCase(anoLancamento)) {
			valorReturn = (float) (this.valor * 0.90);
		}

		else {
			valorReturn = this.valor;
		}

		return valorReturn;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getDesenvolvedora());
		sb.append(";");
		sb.append(this.getGenero());
		sb.append(";");
		sb.append(this.getIdadeRestrita());

		return sb.toString();
	}

	public String getDesenvolvedora() {
		return desenvolvedora;
	}

	public void setDesenvolvedora(String desenvolvedora) {
		this.desenvolvedora = desenvolvedora;
	}
	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdadeRestrita() {
		return idadeRestrita;
	}

	public void setIdadeRestrita(int idadeRestrita) {
		this.idadeRestrita = idadeRestrita;
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