package aula12.listas.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<Integer> numeros = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor: ");
			int valorDigitado = scanner.nextInt();

			numeros.add(valorDigitado);
		}

		double soma = 0.0;

		for (Integer numero : numeros) {
			soma += numero;
		}

		double media = soma / numeros.size();

		System.out.println("A soma de todos os valores é: " + soma);
		System.out.printf("A média dos valores é: %.2f\n", media);

		scanner.close();
	}

}
