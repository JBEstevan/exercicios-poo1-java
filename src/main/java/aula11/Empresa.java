package aula11;

public class Empresa {
	private String razaoSocial;
	private String cnpj;
	private UnidadeFederativa unidadeFederativa;

	public Empresa(String razaoSocial, String cnpj, UnidadeFederativa unidadeFederativa) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.unidadeFederativa = unidadeFederativa;
	}

	public void imprimirRelatorio() {
		System.out.println("Razão social: " + this.razaoSocial);
		System.out.println("CNPJ: " + this.cnpj);
		System.out.println("Estado: " + this.unidadeFederativa.getNomeEstado());
		System.out.println("Sigla: " + this.unidadeFederativa.getSiglaEstado());
		System.out.println("Capital: " + this.unidadeFederativa.getCapitalEstado());
		System.out.println("===== ===== ===== =====\n");
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public UnidadeFederativa getUnidadeFederativa() {
		return unidadeFederativa;
	}

}
