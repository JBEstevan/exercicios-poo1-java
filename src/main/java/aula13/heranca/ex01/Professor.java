package aula13.heranca.ex01;

public class Professor extends Pessoa {
	private Double salarioBase;
	private Double salarioTitulacao;

	public Professor(String nome, int idade, Double salarioBase, Double salarioTitulacao) {
		super(nome, idade);
		this.salarioBase = salarioBase;
		this.salarioTitulacao = salarioTitulacao;
	}

	public double calcularSalario() {
		return this.salarioBase + this.salarioTitulacao;
	}

	@Override
	public void imprimirDados() {
		System.out.println("===== ===== Professor ===== =====");
		super.imprimirDados();
		System.out.println("Salário base: " + this.salarioBase);
		System.out.println("Salário titulação: " + this.salarioTitulacao);
		System.out.println("Salário total: " + this.calcularSalario());
		System.out.println("\n===== ===== ===== =====\n");
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public Double getSalarioTitulacao() {
		return salarioTitulacao;
	}

}