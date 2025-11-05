package aula12.listas.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {

	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();

		List<Integer> numeros = new ArrayList<>();

		// Inserir 500 mil números no ArrayList
		for (int i = 0; i < 500000; i++) {
			numeros.add(i);
		}

		// Percorrer todo o ArrayList e imprimir os valores de cada indice
		for (Integer numero : numeros) {
			System.out.println(numero);
		}

		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;

		System.out.println("Tempo gasto " + tempo + "ms");

	}

}
