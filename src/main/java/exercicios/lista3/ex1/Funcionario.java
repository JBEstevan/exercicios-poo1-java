package exercicios.lista3.ex1;

public class Funcionario {
	private int numeroRegistro;
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String setor;
	private String telefone;
	private Endereco endereco;

	public Funcionario(int numeroRegistro, String nome, String dataNascimento, String sexo, String setor,
			String telefone, Endereco endereco) {
		super();
		this.numeroRegistro = numeroRegistro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.setor = setor;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public void gerarRelatorio() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Funcionario [numeroRegistro=" + numeroRegistro + ", nome=" + nome + ", dataNascimento=" + dataNascimento
				+ ", sexo=" + sexo + ", setor=" + setor + ", telefone=" + telefone + ", endereco=" + endereco + "]";
	}

	public int getNumeroRegistro() {
		return this.numeroRegistro;
	}

	public String getNome() {
		return this.nome;
	}

	public String getDataNascimento() {
		return this.dataNascimento;
	}

	public String getSexo() {
		return this.sexo;
	}

	public String getSetor() {
		return this.setor;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setSetor(String novoSetor) {
		this.setor = novoSetor;
	}

	public void setTelefone(String novoTelefone) {
		this.telefone = novoTelefone;
	}

}
