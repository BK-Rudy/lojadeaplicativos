package br.edu.infnet.lojadeaplicativo.model.exceptions;

public class AnoLancamentoNaoPreenchidoException extends Exception {

	private static final long serialVersionUID = 1L;

	public AnoLancamentoNaoPreenchidoException(String mensagem) {
		super(mensagem);
	}
}