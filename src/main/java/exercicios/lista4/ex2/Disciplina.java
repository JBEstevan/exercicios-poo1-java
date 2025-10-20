package exercicios.lista4.ex2;

public class Disciplina {
	private int codigo;
	private String nome;
	private Modalidade modalidade;
	private int cargaHoraria;
	private Professor professor;

	public Disciplina(int codigo, String nome, Modalidade modalidade, int cargaHoraria, Professor professor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.modalidade = modalidade;
		this.cargaHoraria = cargaHoraria;
		this.professor = professor;
	}

	public void emitirRelatorio() {
		System.out.println("===== ===== Disciplina ===== =====\n");
		System.out.println("Código: " + this.codigo);
		System.out.println("Nome: " + this.nome);
		System.out.println("Modalidade: " + this.modalidade.getNomeModalidade());
		System.out.println("Carga horária: " + this.cargaHoraria);
		System.out.println("\n===== ===== Professor ===== =====\n");
		System.out.println("Registro: " + this.professor.getRegistro());
		System.out.println("Nome: " + this.professor.getNome());
		System.out.println("Data de nascimento: " + this.professor.getDataNascimento());
		System.out.println("Salário: " + this.professor.getSalario());
		System.out.println("\n===== ===== ===== =====\n");
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public Professor getProfessor() {
		return professor;
	}

}
