package aula15.polimorfismo.sobreposicao.ex01;

public class Quadrado extends Quadrilatero {
	private double lado;

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double quadrado() {
		return lado * lado;
	}

	public void calcularArea() {
		System.out.println("A área do quadrado é: " + this.quadrado() + " metros.\n");
	}
}
