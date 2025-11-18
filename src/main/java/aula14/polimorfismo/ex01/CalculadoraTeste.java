package aula14.polimorfismo.ex01;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraTeste {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();

		int resultadoInt = calc.somar(10, 5);
		System.out.println("Resultado (int): " + resultadoInt);

		double resultadoDouble = calc.somar(10.5, 5.2);
		System.out.printf("Resultado (double): %.2f\n", resultadoDouble);

		List<Integer> minhaLista = new ArrayList<>();
		minhaLista.add(100);
		minhaLista.add(200);
		minhaLista.add(300);

		int resultadoLista = calc.somar(minhaLista);
		System.out.println("Resultado (lista): " + resultadoLista);
	}
}
