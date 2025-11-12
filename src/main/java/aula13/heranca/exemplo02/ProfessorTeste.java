package aula13.heranca.exemplo02;

public class ProfessorTeste {

	public static void main(String[] args) {
		Professor professor1 = new Professor(111, "João da Silva", "01/01/2010", 5000.0);
		professor1.lancarFrequencia();
		professor1.aplicarAvaliacao();
		professor1.imprimirDados();

		CoordenadorCurso coordenadorCurso1 = new CoordenadorCurso(222, "Maria de Oliveira", "01/01/2005", 5000.0,
				1000.0);
		coordenadorCurso1.analisarPedidoSegundaChamada();
		coordenadorCurso1.analisarPedidoSuficiencia();
		coordenadorCurso1.participarReunioesDirecao();
		coordenadorCurso1.imprimirDadosCoordenador();

	}

}
