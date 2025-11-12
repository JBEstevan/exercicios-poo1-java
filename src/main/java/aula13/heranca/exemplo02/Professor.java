package aula13.heranca.exemplo02;

public class Professor {
	protected int numeroRegistro;
	protected String nome;
	protected String dataNomeacao;
	protected Double salario;

	public Professor(int numeroRegistro, String nome, String dataNomeacao, Double salario) {
		super();
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
		this.dataNomeacao = dataNomeacao;
		this.salario = salario;
	}

	public void lancarFrequencia() {
		System.out.println(this.nome + " lançando frequência.\n");
	}

	public void aplicarAvaliacao() {
		System.out.println(this.nome + " aplicando avaliação.\n");
	}

	public void imprimirDados() {
		System.out.println("Registro: " + this.numeroRegistro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data Nomeação: " + this.dataNomeacao);
		System.out.println("Salário: " + this.salario);
	}
}
