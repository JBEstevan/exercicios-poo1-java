package aula15.polimorfismo.sobreposicao.ex01;

public class Retangulo extends Quadrilatero {
	private double base;
	private double altura;

	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double retangulo() {
		return base * altura;
	}

	public void calcularArea() {
		System.out.println("A área do retangulo é: " + this.retangulo() + " metros.\n");
	}
}
