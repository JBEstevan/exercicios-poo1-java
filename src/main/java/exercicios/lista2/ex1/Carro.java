package exercicios.lista2.ex1;

public class Carro {
	private String modelo;
	private String marca;
	private String cor;
	private int ano;
	private int renavam;
	private String chassi;
	private String placa;
	private boolean ligado;

	public Carro(String modelo, String marca, String cor, int ano, int renavam, String chassi, String placa) {
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.ano = ano;
		this.renavam = renavam;
		this.chassi = chassi;
		this.placa = placa;
		ligado = false;
	}

	public void ligar() {
		if (!ligado) {
			ligado = true;
			System.out.println(this.modelo + " ligou.");
		} else {
			System.out.println(this.modelo + " já está ligado");
		}
	}

	public void desligar() {
		if (ligado) {
			ligado = false;
			System.out.println(this.modelo + " desligou.");
		} else {
			System.out.println(this.modelo + " já está desligado.");
		}
	}

	public void acelerar() {
		if (ligado) {
			System.out.println(this.modelo + " acelerou.");
		} else {
			System.out.println("Não é possível acelerar com o carro desligado!");
		}
	}

	public void frear() {
		if (ligado) {
			System.out.println(this.modelo + " freou.");
		} else {
			System.out.println("Não é possível frear com o carro desligado!");
		}
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", renavam=" + renavam
				+ ", chassi=" + chassi + ", placa=" + placa + ", ligado=" + ligado + "]";
	}

	public String getPlaca() {
		return this.placa;
	}

	public String getModelo() {
		return this.modelo;
	}

	public String getMarca() {
		return this.marca;
	}

	public String getCor() {
		return this.cor;
	}

	public int getAno() {
		return this.ano;
	}

	public int getRenavam() {
		return this.renavam;
	}

	public String getChassi() {
		return this.chassi;
	}

	public void setCor(String novaCor) {
		System.out.println("O carro modelo " + this.modelo + " está sendo pintado da cor " + novaCor + ".\n");
		this.cor = novaCor;
	}
}
