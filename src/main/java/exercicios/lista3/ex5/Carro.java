package exercicios.lista3.ex5;

public class Carro {
	private int velocidade;
	private Marcha marcha;

	public Carro() {
		this.velocidade = 0;
		this.marcha = Marcha.NEUTRO;
	}

	private void mudarMarcha() {
		if (this.velocidade == 0) {
			this.marcha = Marcha.NEUTRO;
		} else if (this.velocidade <= 19) {
			this.marcha = Marcha.MARCHA1;
		} else if (this.velocidade <= 39) {
			this.marcha = Marcha.MARCHA2;
		} else if (this.velocidade <= 59) {
			this.marcha = Marcha.MARCHA3;
		} else if (this.velocidade <= 89) {
			this.marcha = Marcha.MARCHA4;
		} else {
			this.marcha = Marcha.MARCHA5;
		}
	}

	public void acelerar() {
		if (this.velocidade < 130) {
			velocidade += 5;
			mudarMarcha();
		} else {
			System.out.println("Velocidade máxima atingida, 130 km/h.\n");
		}
	}

	public void frear() {
		if (this.velocidade > 0) {
			velocidade -= 5;
			mudarMarcha();
		} else {
			System.out.println("O carro já está parado.\n");
		}
	}

	public void mostrarInfo() {
		System.out.println("Marcha: " + this.marcha.getnomeMarcha());
		System.out.println("Velocidade: " + this.velocidade);
		System.out.println("===== ===== ===== =====\n");
	}

	public int getVelocidade() {
		return velocidade;
	}

}
