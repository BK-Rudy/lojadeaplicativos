package br.edu.infnet.lojadeaplicativo.model.exceptions;

public class CategoriaAppNaoPreenchidaException extends Exception{

	private static final long serialVersionUID = 1L;

	public CategoriaAppNaoPreenchidaException (String mensagem) {
		super(mensagem);
	}	
}