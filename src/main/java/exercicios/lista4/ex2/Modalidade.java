package exercicios.lista4.ex2;

public enum Modalidade {
	PRESENCIAL("Presencial"),
	A_DISTANCIA("A distância");

	private String nomeModalidade;

	private Modalidade(String nomeModalidade) {
		this.nomeModalidade = nomeModalidade;
	}
	
	public String getNomeModalidade() {
		return this.nomeModalidade;
	}

}
