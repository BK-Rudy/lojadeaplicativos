package br.edu.infnet.lojadeaplicativo.model.exceptions;

public class FormatoNaoPreenchidoException extends Exception {

	private static final long serialVersionUID = 1L;

	public FormatoNaoPreenchidoException(String mensagem) {
		super(mensagem);
	}
}