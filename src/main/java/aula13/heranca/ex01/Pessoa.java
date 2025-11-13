package aula13.heranca.ex01;

public class Pessoa {
	protected String nome;
	protected int idade;

	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public void imprimirDados() {
		System.out.println("\n===== ===== ===== =====\n");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("\n===== ===== ===== =====\n");
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

}
