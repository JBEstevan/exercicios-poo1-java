package exercicios.lista1.ex4;

public class Calculadora {
	private String marca;
	private String modelo;
	private String tipo;
	private String memoriaInterna;
	private boolean ligado;

	public Calculadora(String marca, String modelo, String tipo, String memoriaInterna) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.memoriaInterna = memoriaInterna;
		this.ligado = false;
	}

	public void ligar() {
		if (!ligado) {
			ligado = true;
			System.out.println("Ligando a " + modelo + "\n");
		} else {
			System.out.println("A calculadora " + modelo + " já está ligada.\n");
		}
	}

	public void desligar() {
		if (ligado) {
			ligado = false;
			System.out.println("Desligando a " + modelo + "\n");
		} else {
			System.out.println("A calculadora " + modelo + " já está desligada.\n");
		}
	}

	public double calcular(String operacao, double a, double b) {

		if (ligado) {
			switch (operacao) {
			case "+":
				return a + b;
			case "-":
				return a - b;
			case "*":
				return a * b;
			case "/":
				if (b == 0) {
					System.out.println("Não é possível dividir por 0!");
					return 0;
				} else {
					return a / b;
				}
			default:
				System.out.println(
						"Informe um operador válido: \n + para somar \n - para subtrair \n * para multiplicar \n / para dividir\n");
				return 0;
			}
		} else {
			System.out.println("A calculadora está desligada!\n");
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", memoriaInterna="
				+ memoriaInterna + ", ligado=" + ligado + "]\n";
	}

}
