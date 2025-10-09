package exercicios.lista2.ex2;

public class Pessoa {

	private String nome;
	private String sexo;
	private String cpf;
	private int idade;
	private double altura;
	private double peso;

	public Pessoa(String nome, String sexo, String cpf, int idade, double altura, double peso) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}

	public void andar() {
		System.out.println(this.nome + " andou.\n");
	}

	public void correr() {
		System.out.println(this.nome + " correu!\n");
	}

	public void falar() {
		System.out.println(this.nome
				+ " falou: 'Se você é imune ao tédio, literalmente não há nada que você não possa alcançar'\n");
	}

	public void dormir() {
		System.out.println(this.nome + " dormiu: ZzzZzzzZZzzzZz\n");
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", cpf=" + cpf + ", idade=" + idade + ", altura=" + altura
				+ ", peso=" + peso + "]\n";
	}

	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	public void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}

	public void setPeso(double novoPeso) {
		this.peso = novoPeso;
	}
}