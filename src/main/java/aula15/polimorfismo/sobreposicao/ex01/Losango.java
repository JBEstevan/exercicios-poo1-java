package aula15.polimorfismo.sobreposicao.ex01;

public class Losango extends Quadrilatero {
	private double diagonalMenor;
	private double diagonalMaior;

	public Losango(double diagonalMenor, double diagonalMaior) {
		super();
		this.diagonalMenor = diagonalMenor;
		this.diagonalMaior = diagonalMaior;
	}

	public double losango() {
		return (diagonalMenor * diagonalMaior) / 2;
	}

	public void calcularArea() {
		System.out.println("A área do losango é: " + this.losango() + " metros.\n");
	}
}
