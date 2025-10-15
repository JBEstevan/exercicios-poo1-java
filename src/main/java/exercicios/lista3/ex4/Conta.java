package exercicios.lista3.ex4;

public class Conta {
	private int numeroAgencia;
	private int numeroConta;
	private double saldo;

	public Conta(int numeroAgencia, int numeroConta, double saldo) {
		super();
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public void sacar(double valor) {
		if (valor < 0.0) {
			System.out.println("Operação inválida.\n");
		} else if (valor > this.saldo) {
			System.out.println("Você não tem saldo suficiente.\n");
		} else {
			this.saldo -= valor;
		}
	}

	public void depositar(double valor) {
		if (valor < 0.0) {
			System.out.println("Operação inválida.\n");
		} else {
			this.saldo += valor;
		}
	}

	public void verificarSaldo() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Conta [numeroAgencia=" + numeroAgencia + ", numeroConta=" + numeroConta + ", saldo=" + saldo
				+ " reais]";
	}

	public int getNumeroAgencia() {
		return this.numeroAgencia;
	}

	public int getNumeroConta() {
		return this.numeroConta;
	}

	public double getSaldo() {
		return this.saldo;
	}
}
