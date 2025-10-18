package exercicios.lista4.ex1;

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

	public void emitirRelatorio() {
		System.out.println("===== ===== Funcionário ===== =====\n");
		System.out.println("Nº Registro: " + this.numeroRegistro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Setor: " + this.setor);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("\n===== ===== Endereço ===== =====\n");
		System.out.println("Logradouro: " + this.endereco.getLogradouro());
		System.out.println("Número: " + this.endereco.getNumero());
		System.out.println("Bairro: " + this.endereco.getBairro());
		System.out.println("Cidade: " + this.endereco.getCidade());
		System.out.println("Unidade Federativa: " + this.endereco.getUnidadeFederativa());
	}

	public int getNumeroRegistro() {
		return numeroRegistro;
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

	public String getSetor() {
		return setor;
	}

	public String getTelefone() {
		return telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

}
