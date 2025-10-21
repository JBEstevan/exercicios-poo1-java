package aula12.listas.exemplo01;

import java.util.ArrayList;
import java.util.List;

public class ExemploListas {
	public static void main(String[] args) {
		List<String> listaNomes = new ArrayList<>();

		System.out.println("Número de Elementos: " + listaNomes.size());

		listaNomes.add("João");
		listaNomes.add("Maria");
		listaNomes.add("José");
		listaNomes.add("Ricardo");

		System.out.println("Número de Elementos: " + listaNomes.size());

		for (int i = 0; i < listaNomes.size(); i++) {

			String nome = listaNomes.get(i);

			System.out.println(listaNomes.get(i));
		}
		
		System.out.println("===== ===== ===== =====");
		
		for(String nome : listaNomes) {
			System.out.println(nome);
		}
	}
}
