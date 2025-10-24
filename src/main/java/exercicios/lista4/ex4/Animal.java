package exercicios.lista4.ex4;

public class Animal {
	private String nome;
	private int idade;
	private String sexo;
	private Dono dono;

	public Animal(String nome, int idade, String sexo, Dono dono) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.dono = dono;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getSexo() {
		return sexo;
	}

}
