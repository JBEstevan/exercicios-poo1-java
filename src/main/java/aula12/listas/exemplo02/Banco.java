package aula12.listas.exemplo02;

import java.util.List;
import java.util.ArrayList;

public class Banco {
	private int cnpj;
	private String nome;
	private List<ContaBancaria> listaContas;

	public Banco(int cnpj, String nome) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.listaContas = new ArrayList<>();
	}

	public void adicionarNovaConta(int numeroConta, String nomeTitular) {
		ContaBancaria conta = this.verificarExistenciaConta(numeroConta);

		if (conta == null) {
			ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular);
			this.listaContas.add(contaBancaria);

			System.out.println("Conta " + numeroConta + " criada com sucesso.");
		} else {
			System.out.println("A Conta: " + numeroConta + " já existe.");
		}
	}

	public void excluirConta(int numeroConta) {
		ContaBancaria conta = this.verificarExistenciaConta(numeroConta);

		if (conta != null) {
			this.listaContas.remove(conta);
			System.out.println("Conta " + numeroConta + " removida com sucesso.");
		} else {
			System.out.println("Conta " + numeroConta + " não existe.");
		}
	}

	public ContaBancaria verificarExistenciaConta(int numeroConta) {
		for (ContaBancaria conta : this.listaContas) {
			if (conta.getNumero() == numeroConta) {
				return conta;
			}
		}
		return null;
	}
}
