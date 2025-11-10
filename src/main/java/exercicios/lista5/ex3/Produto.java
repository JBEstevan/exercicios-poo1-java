package exercicios.lista5.ex3;

public class Produto {
	private int codigo;
	private String nomeProduto;
	private String marca;
	private String modelo;
	private int qtdEstoque;
	private double valorUnt;

	public Produto(int codigo, String nomeProduto, String marca, String modelo, int qtdEstoque, double valorUnt) {
		this.codigo = codigo;
		this.nomeProduto = nomeProduto;
		this.marca = marca;
		this.modelo = modelo;
		this.qtdEstoque = qtdEstoque;
		this.valorUnt = valorUnt;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public double getValorUnt() {
		return valorUnt;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

}
