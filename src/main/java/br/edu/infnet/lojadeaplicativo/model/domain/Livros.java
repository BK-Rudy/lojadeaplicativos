package br.edu.infnet.lojadeaplicativo.model.domain;

import br.edu.infnet.lojadeaplicativo.model.exceptions.FormatoNaoPreenchidoException;

public class Livros extends Aplicativo {

	private String autor;
	private String descricaoLivro;
	private int anoPublicacao;
	private String tipoLivro;
	private boolean classificacaoLivre;
	
	public Livros(int id, String nome, float valor, String autor, String descricaoLivro, int anoPublicacao, String tipoLivro, boolean classificacaoLivre) {
		super(id, nome, valor);
		this.autor = autor;
		this.descricaoLivro = descricaoLivro;
		this.anoPublicacao = anoPublicacao;
		this.tipoLivro = tipoLivro;
		this.classificacaoLivre = classificacaoLivre;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.autor);
		sb.append(";");
		sb.append(this.descricaoLivro);
		sb.append(";");
		sb.append(this.anoPublicacao);
		sb.append(";");
		sb.append(this.tipoLivro);
		sb.append(";");
		sb.append(classificacaoLivre ? "Classificação Livre" : "Classificação etária restrita");
		
		return sb.toString();
	}

	@Override
	public float calcularOferta() throws FormatoNaoPreenchidoException {
		
		if(this.tipoLivro.isBlank()) {
			   throw new FormatoNaoPreenchidoException("Não foi informada o tipo de edição deste livro");
			}	
		float valorReturn;
		
		if ("Audiolivros".equalsIgnoreCase(tipoLivro)) {
			valorReturn = (float) (this.valor * 0.80);
		}
		
		else {
			valorReturn = this.valor;
		}
		return valorReturn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDescricaoLivro() {
		return descricaoLivro;
	}

	public void setDescricaoLivro(String descricaoLivro) {
		this.descricaoLivro = descricaoLivro;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public String getTipoLivro() {
		return tipoLivro;
	}

	public void setTipoLivro(String tipoLivro) {
		this.tipoLivro = tipoLivro;
	}


	public boolean isClassificacaoLivre() {
		return classificacaoLivre;
	}

	public void setClassificacaoLivre(boolean classificacaoLivre) {
		this.classificacaoLivre = classificacaoLivre;
	}
}