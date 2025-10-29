package exercicios.lista4.ex5;

public class LocalEvento {
	private String nomeLocal;
	private Endereco endereco;
	private int capacidadeMax;
	private int ingressosDisponiveis;

	public LocalEvento(String nomeLocal, Endereco endereco, int capacidadeMax) {
		super();
		this.nomeLocal = nomeLocal;
		this.endereco = endereco;
		this.capacidadeMax = capacidadeMax;
		this.ingressosDisponiveis = capacidadeMax;
	}

	public String getNomeLocal() {
		return nomeLocal;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public int getCapacidadeMax() {
		return capacidadeMax;
	}

	public int getIngressosDisponiveis() {
		return ingressosDisponiveis;
	}

	public void setIngressosDisponiveis(int ingressosDisponiveis) {
		this.ingressosDisponiveis = ingressosDisponiveis;
	}

	@Override
	public String toString() {
		return "LocalEvento [nomeLocal=" + nomeLocal + ", endereco=" + endereco + ", capacidadeMax=" + capacidadeMax
				+ ", ingressosDisponiveis=" + ingressosDisponiveis + "]";
	}

}
