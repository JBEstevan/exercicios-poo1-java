package exercicios.lista4.ex4;

public class Animal {
	private String nome;
	private int idade;
	private String sexo;
	private Dono dono;
	private Tratamento tratamento;

	public Animal(String nome, int idade, String sexo, Dono dono) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.dono = dono;
		this.tratamento = null;
	}

	public void iniciarTratamento(String descricao, String dataInicio) {
		if (this.tratamento == null) {
			this.tratamento = new Tratamento(descricao, dataInicio);
			System.out.println("\nTratamento de '" + descricao + "' iniciado para o(a) " + this.nome + ".\n");
		} else {
			System.out.println(this.nome + " já está em tratamento!\n");
		}
	}

	public void finalizarTratamento(String dataFim) {
		if (this.tratamento != null) {
			this.tratamento.setDataFim(dataFim);
			System.out.println("\nTratamento do(a) " + this.nome + " finalizado.\n");
		} else {
			System.out.println("Erro: " + this.nome + " não possui um tratamento ativo para finalizar!\n");
		}
	}

	public void exibirRelatorio() {
		System.out.println("===== ===== ANIMAL ===== =====\n");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("\n===== ===== DONO ===== =====\n");
		System.out.println("CPF: " + this.dono.getCpf());
		System.out.println("Nome: " + this.dono.getNome());
		System.out.println("Telefone: " + this.dono.getTelefone());
		System.out.println("Email: " + this.dono.getEmail());
		System.out.println("\n===== ===== ENDEREÇO ===== =====\n");
		System.out.println("Logradouro: " + this.dono.getEndereco().getLogradouro());
		System.out.println("Número: " + this.dono.getEndereco().getNumero());
		System.out.println("Bairro: " + this.dono.getEndereco().getBairro());
		System.out.println("Cidade: " + this.dono.getEndereco().getCidade());
		System.out.println("Unidade Federativa: " + this.dono.getEndereco().getUnidadeFederativa());
		System.out.println("\n===== ===== TRATAMENTO ===== =====\n");
		if (this.tratamento != null) {
			System.out.println("Descrição: " + this.tratamento.getDescricao());
			System.out.println("Data de início: " + this.tratamento.getDataInicio());
			if (this.tratamento.getDataFim() != null) {
				System.out.println("Data de fim: " + this.tratamento.getDataFim());

			} else {
				System.out.println("Data de fim: (Tratamento em andamento)");

			}
		} else {
			System.out.println("Nenhum tratamento registrado para esse animal.");
		}
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

	public Dono getDono() {
		return dono;
	}

	public Tratamento getTratamento() {
		return tratamento;
	}

}
