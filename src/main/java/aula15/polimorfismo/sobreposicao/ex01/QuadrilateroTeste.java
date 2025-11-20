package aula15.polimorfismo.sobreposicao.ex01;

public class QuadrilateroTeste {

	public static void main(String[] args) {
		Quadrado quadrado1 = new Quadrado(2.0);

		quadrado1.calcularArea();

		Retangulo retangulo1 = new Retangulo(4.0, 6.0);

		retangulo1.calcularArea();

		Losango losango1 = new Losango(7.0, 10.0);

		losango1.calcularArea();

	}

}
