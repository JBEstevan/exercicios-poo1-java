package aula09;

public class ContaBancaria {
	
	// 1 - ATRIBUTOS
	private int numero;
	private String titular;
	private double saldo;
	
	public ContaBancaria(int numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0.00;
	}
	
	// 2 - MÉTODOS
	public void sacar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso.");
		} else {
			System.out.println("Saldo é insuficiente.");
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Depósito realizado com sucesso.");
		
		this.calcularRendimentos();
	}
	
	private void calcularRendimentos() {
		double rendimento = this.saldo * 0.10;
		this.saldo += rendimento;
	}
	
	public void imprimirSaldo() {
		System.out.println("===============================");
		System.out.println("Numero da Conta: " + this.numero);
		System.out.println("Nome do Titular: " + this.titular);
		System.out.println("Saldo: R$ " + this.saldo);
		System.out.println("===============================");
		
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	/*public double getSaldo() {
		return this.saldo;
	}*/
	
	/*public void setNumero(int numero) {
		this.numero = numero;
	}*/
	
	public void setTitular(String titular) {
		if(!titular.equals("")) {
			
			this.titular = titular;
		}
	}

	@Override
	public String toString() {
		return "ContaBancaria [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	
	/*public void setSaldo(double saldo) {
		this.saldo = saldo;
	}*/
}
