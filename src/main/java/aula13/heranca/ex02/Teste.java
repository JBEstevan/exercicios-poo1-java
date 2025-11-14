package aula13.heranca.ex02;

public class Teste {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua do Bobo", 0, "Jd. Orvalho", "Ponta Fina", "Paraná");
		Pessoa pessoa1 = new Pessoa("Jair Rodrigues", 37, endereco1);

		pessoa1.imprimirDados();

		Endereco endereco2 = new Endereco("Av. Vicente Machado", 127, "Centro", "Ponta Fina", "Paraná");
		Professor professor1 = new Professor("Carl Gustav Jung", 33, 11000.00, 5500.00, endereco2);

		professor1.imprimirDados();

		Endereco endereco3 = new Endereco("Rua Rio de Janeiro", 111, "Nova Rússia", "Ponta Fina", "Paraná");
		Aluno aluno1 = new Aluno("Noel Rosa", 34, endereco3);

		aluno1.imprimirDados();

		aluno1.realizarMatricula("Análise e Desenvolvimento de Sistemas");

		aluno1.imprimirDados();

	}

}
