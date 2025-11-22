package exercicios.lista5.ex4;

public class DisciplinaTeste {

	public static void main(String[] args) {

		Disciplina disciplina1 = new Disciplina("Estrutura de Dados");

		disciplina1.matricularAluno(111, "Anakin da Silva Santos");
		disciplina1.matricularAluno(111, "Anakin da Silva Santos");

		disciplina1.lancarNota(222, 10);
		disciplina1.lancarNota(111, 8.9);
		disciplina1.lancarNota(111, 9.4);
		disciplina1.lancarNota(111, 9.9);

		disciplina1.matricularAluno(222, "Leia Santos");
		disciplina1.lancarNota(222, 10);
		disciplina1.lancarNota(222, 9.9);
		disciplina1.lancarNota(222, 10);

		disciplina1.finalizarSemestre();

	}

}
