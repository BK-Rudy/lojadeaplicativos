package br.edu.infnet.lojadeaplicativo.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.edu.infnet.lojadeaplicativo.model.exceptions.AnoLancamentoNaoPreenchidoException;
import br.edu.infnet.lojadeaplicativo.model.exceptions.CategoriaAppNaoPreenchidaException;
import br.edu.infnet.lojadeaplicativo.model.exceptions.FormatoNaoPreenchidoException;

@Entity
@Table(name = "TableProduto")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	protected String nome;
	protected float valor;
	protected String anoLancamento;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	@ManyToMany(mappedBy = "produtos")
	private List<Pedido> pedidos;

	public Produto() {
	}

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
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(valor);
		sb.append(";");
		sb.append(anoLancamento);

		return sb.toString();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}