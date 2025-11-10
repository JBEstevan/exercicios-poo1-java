package exercicios.lista5.ex3;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	private String cnpj;
	private String razaoSocial;
	private List<Produto> produtos;

	public Loja(String cnpj, String razaoSocial) {
		super();
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.produtos = new ArrayList<Produto>();
	}

	public Produto buscarCodigoProduto(int codigo) {
		for (Produto produto : produtos) {
			if (produto.getCodigo() == codigo) {
				return produto;
			}
		}
		return null;
	}

	public void cadastrarProduto(int codigo, String nomeProduto, String marca, String modelo, int qtdEstoque,
			double valorUnt) {
		Produto produtoExistente = this.buscarCodigoProduto(codigo);

		if (produtoExistente == null) {
			Produto novoProduto = new Produto(codigo, nomeProduto, marca, modelo, qtdEstoque, valorUnt);
			produtos.add(novoProduto);
			System.out.println("Produto '" + modelo + "' cadastrado com sucesso!\n");
		} else {
			System.out.println("Produto '" + modelo + "' já cadastrado.\n Quantidade será atualizada.\n");
			int estoqueAtual = produtoExistente.getQtdEstoque();
			int novaQtdEstoque = estoqueAtual + qtdEstoque;
			produtoExistente.setQtdEstoque(novaQtdEstoque);
		}
	}

	public void reporEstoque(int codigo, int qtdAdquirida) {
		Produto produtoEncontrado = this.buscarCodigoProduto(codigo);
		if (produtoEncontrado != null) {
			int novaQtdEstoque = produtoEncontrado.getQtdEstoque() + qtdAdquirida;
			produtoEncontrado.setQtdEstoque(novaQtdEstoque);
		} else {
			System.out.println("Produto não encontrado!");
		}
	}

	public void imprimirRelatorio() {
		for (Produto produto : produtos) {
			System.out.println("\n===== ===== PRODUTOS ===== =====\n");
			System.out.println("Código: " + produto.getCodigo());
			System.out.println("Nome: " + produto.getNomeProduto());
			System.out.println("Marca: " + produto.getMarca());
			System.out.println("Modelo: " + produto.getModelo());
			System.out.println("Quantidade estoque: " + produto.getQtdEstoque());
			System.out.printf("Valor unitário: %.2f", produto.getValorUnt());
			System.out.println("\n===== ===== ===== =====\n");
		}
	}

	public void efetuarVenda(int codigo, int qtdVenda) {
		Produto produto = this.buscarCodigoProduto(codigo);

		if (produto != null) {
			if (produto.getQtdEstoque() >= qtdVenda) {
				System.out.println("Venda realizada no valor de R$ " + qtdVenda * produto.getValorUnt());
				int novaQtdEstoque = produto.getQtdEstoque() - qtdVenda;
				produto.setQtdEstoque(novaQtdEstoque);
			} else {
				System.out.println("Não foi possível efetuar a venda, estoque insuficiente.\n");
			}
		} else {
			System.out.println("Venda não realizada: Produto de código " + codigo + " não encontrado!\n");
		}
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

}
