package exercicios.lista4.ex3;

public class Titular {
	private String cpf;
	private String rg;
	private String nome;
	private String dataNascimento;
	private String sexo;
	private double rendaMensal;
	private Endereco endereco;

	public Titular(String cpf, String rg, String nome, String dataNascimento, String sexo, double rendaMensal,
			Endereco endereco) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.rendaMensal = rendaMensal;
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

	public String getNome() {
		return nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public double getRendaMensal() {
		return rendaMensal;
	}

	public Endereco getEndereco() {
		return endereco;
	}

}
