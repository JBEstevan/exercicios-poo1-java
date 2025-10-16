package aula11;

public enum UnidadeFederativa {
	RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS", "Porto Alegre"),
	SANTA_CATARINA("Santa Catarina", "SC", "Florianópolis"), PARANA("Paraná", "PR", "Curitiba"),
	SAO_PAULO("São Paulo", "SP", "São Paulo"), MINAS_GERAIS("Minas Gerais", "MG", "Belo Horizonte"),
	RIO_DE_JANEIRO("Rio de Janeiro", "RJ", "Rio de Janeiro"), ESPIRITO_SANTO("Espírito Santo", "ES", "Vitória");

	private String nomeEstado;
	private String siglaEstado;
	private String capitalEstado;

	private UnidadeFederativa(String nomeEstado, String siglaEstado, String capitalEstado) {
		this.nomeEstado = nomeEstado;
		this.siglaEstado = siglaEstado;
		this.capitalEstado = capitalEstado;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	public String getCapitalEstado() {
		return capitalEstado;
	}

}
