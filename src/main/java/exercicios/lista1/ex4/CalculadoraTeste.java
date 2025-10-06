package exercicios.lista1.ex4;

public class CalculadoraTeste {

	public static void main(String[] args) {
		Calculadora calculadora1 = new Calculadora("Casio", "FX-CG50", "Científica", "16 MB");
		Calculadora calculadora2 = new Calculadora("HP", "Prime V2", "Científica", "256 MB");
		Calculadora calculadora3 = new Calculadora("Casio", "FX-82MS", "Científica", "10 MB");

		System.out.println(calculadora1);

		System.out.println("===== ===== ===== ===== ===== =====\n");

		calculadora1.desligar();

		calculadora1.ligar();
		calculadora1.ligar();

		double resultadoSoma = calculadora1.calcular("+", 5, 100);
		System.out.printf("O resultado de 5 + 100 é: %.0f \n", resultadoSoma);

		calculadora1.desligar();

		System.out.println("===== ===== ===== ===== ===== =====\n");

		calculadora2.desligar();

		calculadora2.ligar();
		calculadora2.ligar();

		double resultadoSubtracao = calculadora2.calcular("-", 5, 100);
		System.out.printf("O resultado de 5 - 100 é: %.0f \n", resultadoSubtracao);

		double resultadoMultiplicacao = calculadora2.calcular("*", 8, 100);
		System.out.printf("O resultado de 8 * 100 é: %.0f \n", resultadoMultiplicacao);

		calculadora2.desligar();

		System.out.println("===== ===== ===== ===== ===== =====\n");

		calculadora3.desligar();

		calculadora3.ligar();
		calculadora3.ligar();

		double resultadoDivisao = calculadora3.calcular("/", 100, 5);
		System.out.printf("O resultado de 100 / 5 é: %.0f \n", resultadoDivisao);
		calculadora2.desligar();

	}

}
