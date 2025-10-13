package exercicios.lista3.ex2;

public class DisciplinaTeste {

	public static void main(String[] args) {
		Disciplina disciplina1 = new Disciplina("AD32A", "Estrutura de Dados", Modalidade.PRESENCIAL, 120,
				"Estrutura de dados e lógica de programação em C");
		Disciplina disciplina2 = new Disciplina("AD32C", "Orientação a Objetos", Modalidade.PRESENCIAL, 120,
				"Programação orientada a objetos, encapsulamento, herança e polimorfismo em Java");

		System.out.println("===== ===== ===== =====");

		System.out.println(disciplina1);
		System.out.println(disciplina2);

		disciplina1.setConteudoProgramatico(
				"Tipos abstratos de dados. Ponteiros. Pilhas, filas e listas com alocação estática e dinâmica de memória. Recursividade. Algoritmos de busca e ordenação."
						+ " Gerência de memória. Princípios de árvores binárias e tabela de espalhamento.");

		System.out.println(disciplina1);

		System.out.println("===== ===== ===== =====");
	}

}
