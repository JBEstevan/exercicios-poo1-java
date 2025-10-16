package aula11;

public class Cliente {
	private int codigo;
	private String nome;
	private String dataNascimento;
	private EstadoCivil estadoCivil;

	public Cliente(int codigo, String nome, String dataNascimento, EstadoCivil estadoCivil) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivil;
	}

	public void alterarEstadoCivil(EstadoCivil novoEstadoCivil) {
		this.estadoCivil = novoEstadoCivil;
	}

	public void gerarRelatorio() {
		System.out.println("Código: " + this.codigo);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("Estado civil: " + this.estadoCivil);
	}
}
