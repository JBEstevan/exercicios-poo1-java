package exercicios.lista3.ex4;

public class Conta {
	private String numeroAgencia;
	private String numeroConta;
	private double saldo;

	public Conta(String numeroAgencia, String numeroConta, double saldo) {
		super();
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public boolean sacar(double valor) {
		if (valor < 0.0) {
			System.out.println("Operação inválida.\n");
			return false;
		} else if (valor > this.saldo) {
			System.out.println("Operação inválida: Saldo insuficiente.\n");
			return false;
		} else {
			this.saldo -= valor;
			System.out.println("Saque de R$ " + valor + " realizado com sucesso.\n");
			return true;
		}
	}

	public boolean depositar(double valor) {
		if (valor < 0.0) {
			System.out.println("Operação inválida.\n");
			return false;
		} else {
			this.saldo += valor;
			System.out.println("Depósito de R$ " + valor + " realizado com sucesso.\n");
			return true;
		}
	}

	public void verificarSaldo() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Conta [numeroAgencia=" + numeroAgencia + ", numeroConta=" + numeroConta + ", saldo=" + saldo
				+ " reais]\n";
	}

	public String getNumeroAgencia() {
		return this.numeroAgencia;
	}

	public String getNumeroConta() {
		return this.numeroConta;
	}

	public double getSaldo() {
		return this.saldo;
	}
}
