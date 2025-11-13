package aula13.heranca.ex01;

public class Aluno extends Pessoa {
	private String curso;

	public Aluno(String nome, int idade) {
		super(nome, idade);
		this.curso = null;
	}

	public void realizarMatricula(String curso) {
		this.curso = curso;
		System.out.println("Matrícula no curso: " + curso + ", realizada com sucesso!");
	}

	@Override
	public void imprimirDados() {
		super.imprimirDados();
		if (this.curso == null) {
			System.out.println(this.nome + ", por favor realize sua matrícula.");
		} else {
			System.out.println("Matriculado no curso: " + this.curso);
		}
		System.out.println("\n===== ===== ===== =====\n");
	}

	public String getCurso() {
		return curso;
	}

}
