package br.edu.infnet.lojadeaplicativo.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.lojadeaplicativo.model.exceptions.FormatoNaoPreenchidoException;

@Entity
@Table(name = "TableLivro")
public class Livro extends Produto {

	private String autor;
	private int paginas;
	private String genero;
	
	public Livro() {
		
	}

	public Livro(String nome, float valor, String anoLancamento, String autor, int paginas, String genero){
		super(nome, valor, anoLancamento);

		this.setAutor(autor);
		this.setPaginas(paginas);
		this.setGenero(genero);
	}

	@Override
	public double calcularOferta() throws FormatoNaoPreenchidoException {

		if (this.genero.isBlank()) {
			throw new FormatoNaoPreenchidoException("Não foi informado o gênero deste livro");
		}
		double valorReturn;

		if ("Romance".equalsIgnoreCase(genero)) {
			valorReturn = (float) (this.valor * 0.80);
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
		sb.append(autor);
		sb.append(";");
		sb.append(paginas);
		sb.append(";");
		sb.append(genero);

		return sb.toString();
	}

	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}
	
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}