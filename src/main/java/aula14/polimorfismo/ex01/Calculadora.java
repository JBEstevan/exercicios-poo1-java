package aula14.polimorfismo.ex01;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

	public Calculadora() {
	}

	public int somar(int numero1, int numero2) {
		return numero1 + numero2;
	}

	public double somar(double num1, double num2) {
		return num1 + num2;
	}

	public int somar(List<Integer> listaNumeros) {
		int soma = 0;
		for (int valor : listaNumeros) {
			soma += valor;
		}
		return soma;
	}
}
