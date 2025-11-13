package aula13.heranca.ex01;

public class Teste {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Jair Rodrigues", 37);

		pessoa1.imprimirDados();

		Professor professor1 = new Professor("Carl Gustav Jung", 33, 11000.00, 5500.00);

		professor1.imprimirDados();

		Aluno aluno1 = new Aluno("Noel Rosa", 34);

		aluno1.imprimirDados();

		aluno1.realizarMatricula("Análise e Desenvolvimento de Sistemas");

		aluno1.imprimirDados();

	}

}
