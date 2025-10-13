package exercicios.lista2.ex6;

public class Televisao {
	private String marca;
	private int polegada;
	private int resolucao;
	private boolean ligado;
	private int canal;
	private int volume;

	public Televisao(String marca, int polegada, int resolucao) {
		super();
		this.marca = marca;
		this.polegada = polegada;
		this.resolucao = resolucao;
		this.ligado = false;
		this.canal = 1;
		this.volume = 0;
	}

	public void ligar() {
		if (!ligado) {
			ligado = true;
			System.out.println("Ligando a Tv.\n");
		} else {
			System.out.println("A Tv já está ligada.\n");
		}
	}

	public void desligar() {
		if (ligado) {
			ligado = false;
			System.out.println("Desligando a Tv.\n");
		} else {
			System.out.println("A Tv já está desligada.\n");
		}
	}

	public void aumentarCanal() {
		if (ligado) {
			if (this.canal == 99) {
				this.canal = 1;
			} else {
				this.canal++;
			}
		} else {
			System.out.println("A Tv deve estar ligada pra trocar de canal\n");
		}
	}

	public void diminuirCanal() {
		if (ligado) {
			if (this.canal == 1) {
				this.canal = 99;
			} else {
				this.canal--;
			}
		} else {
			System.out.println("A Tv deve estar ligada pra trocar de canal\n");
		}
	}

	public void subirVolume() {
		if (ligado) {
			if (this.volume < 30) {
				this.volume++;
			} else {
				System.out.println("Volume já está no máximo\n");
			}
		} else {
			System.out.println("A Tv deve estar ligada pra ajustar o volume\n");
		}
	}

	public void baixarVolume() {
		if (ligado) {
			if (this.volume > 0) {
				this.volume--;
			} else {
				System.out.println("Volume já está no mínimo\n");
			}
		} else {
			System.out.println("A Tv deve estar ligada pra ajustar o volume\n");
		}
	}

	public void gerarRelatorio() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Televisao [marca=" + marca + ", polegada=" + polegada + ", resolucao=" + resolucao + ", ligado="
				+ ligado + ", canal=" + canal + ", volume=" + volume + "]\n";
	}

	public String getMarca() {
		return this.marca;
	}

	public int getPolegada() {
		return this.polegada;
	}

	public int getResolucao() {
		return this.resolucao;
	}

	public boolean getLigado() {
		return this.ligado;
	}

	public int getCanal() {
		return this.canal;
	}

	public int getVolume() {
		return this.volume;
	}
}
