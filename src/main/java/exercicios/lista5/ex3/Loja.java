package exercicios.lista5.ex3;

public class Loja {
	private int cnpj;
	private String razaoSocial;

	public Loja(int cnpj, String razaoSocial) {
		super();
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public int getCnpj() {
		return cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

}
