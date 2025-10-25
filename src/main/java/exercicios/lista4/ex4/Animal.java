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
		this.tratamento = tratamento;
	}
	
	public void iniciarTratamento(String descricao, String dataInicio) {
		this.tratamento.getDescricao() = descricao;
		this.tratamento.getDataInicio() = dataInicio;
	}

	public void finalizarTratamento(String dataFim) {
		this.tratamento.getDataFim() = dataFim;
	}
	
	public void exibirRelatorio() {
		System.out.println("===== ===== ANIMAL ===== =====\n");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Sexo: " + this.sexo);
		
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
