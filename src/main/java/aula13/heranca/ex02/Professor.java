package aula13.heranca.ex02;

public class Professor extends Pessoa {
	private Double salarioBase;
	private Double salarioTitulacao;

	public Professor(String nome, int idade, Double salarioBase, Double salarioTitulacao, Endereco endereco) {
		super(nome, idade, endereco);
		this.salarioBase = salarioBase;
		this.salarioTitulacao = salarioTitulacao;
	}

	public double calcularSalario() {
		return this.salarioBase + this.salarioTitulacao;
	}

	@Override
	public void imprimirDados() {
		System.out.println("===== ===== Professor ===== =====\n");

		super.imprimirDadosBasicos();

		System.out.println("Salário base: " + this.salarioBase);
		System.out.println("Salário titulação: " + this.salarioTitulacao);
		System.out.println("Salário total: " + this.calcularSalario());

		super.imprimirEndereco();

		System.out.println("\n===== ===== ===== =====\n");
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public Double getSalarioTitulacao() {
		return salarioTitulacao;
	}

}