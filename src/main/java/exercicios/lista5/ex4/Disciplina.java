package exercicios.lista5.ex4;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private String nomeDisciplina;
	private List<Aluno> alunos;

	public Disciplina(String nomeDisciplina) {
		super();
		this.nomeDisciplina = nomeDisciplina;
		this.alunos = new ArrayList<Aluno>();
	}

	public Aluno verificarAluno(int ra) {
		for (Aluno aluno : alunos) {
			if (aluno.getRa() == ra) {
				return aluno;
			}
		}
		return null;
	}

	public void matricularAluno(int ra, String nome) {
		Aluno alunoExistente = this.verificarAluno(ra);
		if (alunoExistente == null) {
			Aluno novoAluno = new Aluno(ra, nome);
			this.alunos.add(novoAluno);
			System.out.println("Aluno: " + nome + " cadastrado com sucesso.\n");
		} else {
			System.out.println("Aluno: " + nome + " já está cadastrado.\n");
		}
	}

	public void lancarNota(int ra, double nota) {
		Aluno alunoExistente = this.verificarAluno(ra);
		if (alunoExistente != null) {
			alunoExistente.inserirNota(nota);
		} else {
			System.out.println("Aluno de RA: " + ra + " não está matriculado na disciplina.\n");
		}
	}

	public void finalizarSemestre() {
		double somaMedias = 0.0;

		for (Aluno aluno : alunos) {
			double mediaAluno = aluno.calcularMedia();

			String situacao;
			if (mediaAluno <= 6.0) {
				situacao = "Reprovado";
			} else {
				situacao = "Aprovado";
			}
			System.out.println("===== Relatório Final =====");
			System.out.println("R.A: " + aluno.getRa());
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Média: " + mediaAluno);
			System.out.println("Situação: " + situacao);

			somaMedias += mediaAluno;
		}
		if (!this.alunos.isEmpty()) {
			double mediaGeral = somaMedias / alunos.size();
			System.out.println("\n===== ===== =====");
			System.out.println("Disciplina: " + this.nomeDisciplina);
			System.out.println("Média da disciplina: " + mediaGeral);
		}
	}
}
