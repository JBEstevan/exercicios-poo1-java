package aula13.heranca.ex02;

public class Pessoa {
	protected String nome;
	protected int idade;
	protected Endereco endereco;

	public Pessoa(String nome, int idade, Endereco endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}

	protected void imprimirDadosBasicos() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
	}

	protected void imprimirEndereco() {
		System.out.println("\n===== ===== Endereço ===== =====\n");
		System.out.println("Logradouro: " + this.endereco.getLogradouro());
		System.out.println("Número: " + this.endereco.getNumero());
		System.out.println("Bairro: " + this.endereco.getBairro());
		System.out.println("Cidade: " + this.endereco.getCidade());
		System.out.println("Estado: " + this.endereco.getUnidadeFederativa());
	}

	public void imprimirDados() {
		System.out.println("\n===== ===== Pessoa ===== =====\n");
		this.imprimirDadosBasicos();
		this.imprimirEndereco();
		System.out.println("\n===== ===== ===== =====\n");
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

}
