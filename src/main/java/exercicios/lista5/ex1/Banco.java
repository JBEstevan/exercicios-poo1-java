package exercicios.lista5.ex1;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Conta> contas;

	public Banco() {
		this.contas = new ArrayList<Conta>();
	}

	private Conta buscarContaPorNumero(int numeroConta) {
		for (Conta conta : this.contas) {
			if (conta.getNumeroConta() == numeroConta) {
				return conta;
			}
		}
		return null;
	}

	public void criarConta(int numeroConta, String nome, String cpf) {
		if (this.buscarContaPorNumero(numeroConta) != null) {
			System.out.println("Já existe uma conta de número " + numeroConta);
			return;
		}
		Cliente novoCliente = new Cliente(nome, cpf);
		Conta conta = new Conta(numeroConta, novoCliente);

		this.contas.add(conta);
		System.out.println("Conta " + numeroConta + " criada com sucesso para " + nome + ".\n");
	}

	public void sacarConta(int numeroConta, double valor) {
		Conta conta = this.buscarContaPorNumero(numeroConta);
		if (conta != null) {
			conta.sacar(valor);
			return;
		}
		System.out.println("Conta inexistente.\n");
	}

	public void depositarConta(int numeroConta, double valor) {
		Conta conta = this.buscarContaPorNumero(numeroConta);
		if (conta != null) {
			conta.depositar(valor);
			return;
		}
		System.out.println("Conta inexistente.\n");
	}

	public void verificarSaldo(int numeroConta) {
		Conta conta = this.buscarContaPorNumero(numeroConta);
		if (conta != null) {
			conta.imprimirSaldo();
			return;
		}
		System.out.println("Conta inexistente.\n");
	}
}
