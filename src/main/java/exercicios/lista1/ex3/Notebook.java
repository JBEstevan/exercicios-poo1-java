package exercicios.lista1.ex3;

public class Notebook {
	private String marca;
	private String modelo;
	private double polegadaTela;
	private String modeloProcessador;
	private int qtdMemoriaRam;
	private int capacidadeArmazenamento;
	private boolean ligado;

	public Notebook(String marca, String modelo, double polegadaTela, String modeloProcessador, int qtdMemoriaRam,
			int capacidadeArmazenamento) {
		this.marca = marca;
		this.modelo = modelo;
		this.polegadaTela = polegadaTela;
		this.modeloProcessador = modeloProcessador;
		this.qtdMemoriaRam = qtdMemoriaRam;
		this.capacidadeArmazenamento = capacidadeArmazenamento;
		this.ligado = false;
	}

	public void ligar() {
		if (ligado == false) {
			ligado = true;
			System.out.println("O notebook " + modelo + " está ligando.\n");
		} else {
			System.out.println("O notebook " + modelo + " já está ligado.\n");
		}
	}

	public void desligar() {
		if (ligado == true) {
			ligado = false;
			System.out.println("O notebook " + modelo + " está desligando.\n");
		} else {
			System.out.println("O notebook " + modelo + " já está desligado.\n");
		}
	}

	public void processarInfo() {
		if (ligado == true) {
			System.out.println("O notebook " + modelo + " está processando informações.\n");
		} else {
			System.out.println("Não é possível processar informações pois o notebook " + modelo + " está desligado!\n");
		}
	}

	public void conectarInternet() {
		if (ligado == true) {
			System.out.println("O notebook " + modelo + " está conectando à Internet.\n");
		} else {
			System.out
					.println("Não é possível conectar-se à Internet pois o notebook " + modelo + " está desligado!\n");
		}
	}

	@Override
	public String toString() {
		return "Notebook [marca=" + marca + ", modelo=" + modelo + ", polegadaTela=" + polegadaTela
				+ ", modeloProcessador=" + modeloProcessador + ", qtdMemoriaRam=" + qtdMemoriaRam
				+ ", capacidadeArmazenamento=" + capacidadeArmazenamento + ", ligado=" + ligado + "]";
	}

}
