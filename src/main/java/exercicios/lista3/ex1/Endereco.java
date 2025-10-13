package exercicios.lista3.ex1;

public class Endereco {
	private String nomeRua;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;

	public Endereco(String nomeRua, int numero, String bairro, String cidade, String estado) {
		super();
		this.nomeRua = nomeRua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getNomeRua() {
		return this.nomeRua;
	}

	public int getNumero() {
		return this.numero;
	}

	public String getBairro() {
		return this.bairro;
	}

	public String getCidade() {
		return this.cidade;
	}

	public String getEstado() {
		return this.estado;
	}

	@Override
	public String toString() {
		return "Endereco [nomeRua=" + nomeRua + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", estado=" + estado + "]";
	}

}
