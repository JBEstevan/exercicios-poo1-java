package exercicios.lista4.ex2;

public class DisciplinaTeste {

	public static void main(String[] args) {
		Professor professor1 = new Professor(33333, "George Vereador", "07/07/1977", 3333.33);

		Disciplina disciplina1 = new Disciplina(1241, "Oratória", Modalidade.A_DISTANCIA, 60, professor1);

		disciplina1.emitirRelatorio();
	}

}
