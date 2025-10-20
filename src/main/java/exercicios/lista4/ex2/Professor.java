package exercicios.lista4.ex2;

public class Professor {
	private int registro;
	private String nome;
	private String dataNascimento;
	private double salario;

	public Professor(int registro, String nome, String dataNascimento, double salario) {
		super();
		this.registro = registro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}

	public int getRegistro() {
		return registro;
	}

	public String getNome() {
		return nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public double getSalario() {
		return salario;
	}

}
