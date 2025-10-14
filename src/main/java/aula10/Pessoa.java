package aula10;

public class Pessoa {
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String email;
	private String estadoCivil;
	private Endereco endereco;

	public Pessoa(String nome, String dataNascimento, String sexo, String email, String estadoCivil,
			Endereco endereco) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.email = email;
		this.estadoCivil = estadoCivil;
		this.endereco = endereco;
	}

	public void imprimirDados() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", email=" + email
				+ ", estadoCivil=" + estadoCivil + ", endereco=" + endereco + "]";
	}

}
