package exercicios.lista4.ex3;

public class Conta {
	private String numeroAgencia;
	private String numeroConta;
	private Titular titular;
	private double saldo;

	public Conta(String numeroAgencia, String numeroConta, Titular titular, double saldo) {
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public void sacar(double valor) {
		if (this.saldo <= 0) {
			System.out.println("Saldo insuficiente!\n");
		} else if (valor > this.saldo) {
			System.out.println("Saldo insuficiente! O valor indicado excede o valor do saldo.\n");
		} else if (valor < 0) {
			System.out.println("Operação inválida!\n");
		} else {
			this.saldo -= valor;
			System.out.println("Saque de R$ " + valor + " reais, efetuado.\n");
		}
	}

	public void depositar(double valor) {
		if (valor < 0) {
			System.out.println("Operação inválida!\n");
		} else {
			this.saldo += valor;
			System.out.println("Depósito de R$ " + valor + " reais, efetuado.\n");
		}
	}

	public void emitirSaldo() {
		System.out.println("===== ===== Conta ===== =====\n");
		System.out.println("Agência: " + this.numeroAgencia);
		System.out.println("Conta: " + this.numeroConta);
		System.out.println("Saldo R$: " + this.saldo);
		System.out.println("\n===== ===== Titular ===== =====\n");
		System.out.println("Nome: " + this.titular.getNome());
		System.out.println("CPF: " + this.titular.getCpf());
		System.out.println("RG: " + this.titular.getRg());
		System.out.println("Data de nascimento: " + this.titular.getDataNascimento());
		System.out.println("Sexo: " + this.titular.getSexo());
		System.out.println("Renda mensal R$: " + this.titular.getRendaMensal());
		System.out.println("\n===== ===== Endereço do titular ===== =====\n");
		System.out.println("Logradouro: " + this.titular.getEndereco().getLogradouro());
		System.out.println("Número: " + this.titular.getEndereco().getNumero());
		System.out.println("Bairro: " + this.titular.getEndereco().getBairro());
		System.out.println("Cidade: " + this.titular.getEndereco().getCidade());
		System.out.println("Unidade federativa: " + this.titular.getEndereco().getUnidadeFederativa());
		System.out.println("\n===== ===== ===== ===== =====\n");
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public Titular getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

}
