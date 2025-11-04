package exercicios.lista5.ex1;

public class Conta {
	private int numeroConta;
	private double saldo;
	private Cliente cliente;

	public Conta(int numeroConta, Cliente cliente) {
		this.numeroConta = numeroConta;
		this.saldo = 00.00;
		this.cliente = cliente;
	}

	public void sacar(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque de R$: " + valor + " realizado com sucesso.\n");
		} else {
			System.out.println("Saldo insuficiente.\n");
		}
	}

	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso\n");
	}

	public void imprimirSaldo() {
		System.out.println("===== ===== ===== =====\n");
		System.out.println("Número da conta: " + this.numeroConta);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Nome do titular: " + this.cliente.getNome());
		System.out.println("Nome do titular: " + this.cliente.getCpf());
		System.out.println("===== ===== ===== =====\n");
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

}
