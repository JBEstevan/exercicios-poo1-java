package exercicios.lista2.ex4;

public class AlunoTeste {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno(2244661, "Juan Estevan", "Análise e Desenvolvimento de Sistemas", "Noturno", 2, 93.16,
				"Regular");
		Aluno aluno2 = new Aluno(1133552, "Chico Anysio", "Análise e Desenvolvimento de Sistemas", "Noturno", 3, 77.5,
				"Regular");
		Aluno aluno3 = new Aluno(1133552, "Adamastor Pitaco", "Bacharelado em Ciência da Computação", "Integral", 1,
				60.5, "Irregular");

		System.out.println("===== ===== ===== =====");

		aluno2.responderChamada();

		aluno3.fazerAvaliacao();

		aluno1.setNome("Juan E. B.");

		aluno1.imprimirRelatorio();

		System.out.println("===== ===== ===== =====");
	}
}
