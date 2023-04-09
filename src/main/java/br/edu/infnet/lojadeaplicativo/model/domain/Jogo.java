package br.edu.infnet.lojadeaplicativo.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.lojadeaplicativo.model.exceptions.AnoLancamentoNaoPreenchidoException;

@Entity
@Table(name = "TableJogo")
public class Jogo extends Produto {

	private String desenvolvedora;
	private String genero;
	private Boolean idadeRestrita = false;

	public Jogo() {

	}

	public Jogo(String nome, float valor, String anoLancamento, String desenvolvedora, String genero,
			Boolean idadeRestrita) {
		super(nome, valor, anoLancamento);

		this.desenvolvedora = desenvolvedora;
		this.genero = genero;
		this.idadeRestrita = (this.idadeRestrita == null) ? false : idadeRestrita;
	}

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
		sb.append(desenvolvedora);
		sb.append(";");
		sb.append(genero);
		sb.append(";");
		sb.append(idadeRestrita);

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

	public boolean isIdadeRestrita() {
        return idadeRestrita;
    }
    public void setIdadeRestrita(boolean idadeRestrita) {
        this.idadeRestrita = idadeRestrita;
    }
}