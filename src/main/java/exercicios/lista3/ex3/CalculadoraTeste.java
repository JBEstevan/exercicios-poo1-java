package exercicios.lista3.ex3;

public class CalculadoraTeste {

	public static void main(String[] args) {
		Calculadora calculadora1 = new Calculadora("Casio", "FX-991LA CW", Tipo.CIENTIFICA, 2);
		Calculadora calculadora2 = new Calculadora("HP", "12C Gold", Tipo.FINANCEIRA, 1);
		Calculadora calculadora3 = new Calculadora("Casio", "FX-82MS", Tipo.CIENTIFICA, 1);

		System.out.println("===== ===== ===== =====");

		System.out.println(calculadora1);

		double resultadoSoma = calculadora2.somar(10, 600);
		System.out.printf("O resultado da soma é: %.2f\n", resultadoSoma);

		double resultadoSubtracao = calculadora3.subtrair(100, 55);
		System.out.printf("O resultado da subtração é: %.2f\n", resultadoSubtracao);

		double resultadoMultiplicacao = calculadora3.multiplicar(100, 100);
		System.out.printf("O resultado da multiplicação é: %.2f\n", resultadoMultiplicacao);

		double resultadoDivisao = calculadora1.dividir(1000, 0);
		System.out.printf("O resultado da divisão é: %.2f\n", resultadoDivisao);

	}

}
