package exercicios.lista3.ex5;

public enum Marcha {
	NEUTRO("Neutro"),
	MARCHA1("1ª Marcha"),
	MARCHA2("2ª Marcha"),
	MARCHA3("3ª Marcha"),
	MARCHA4("4ª Marcha"),
	MARCHA5("5ª Marcha");
	
	private String nomeMarcha;

	private Marcha(String nomeMarcha) {
		this.nomeMarcha = nomeMarcha;
	}
	
	public String getnomeMarcha() {
		return nomeMarcha;
	}
}
