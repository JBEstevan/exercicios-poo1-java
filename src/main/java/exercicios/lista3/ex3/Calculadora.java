package exercicios.lista3.ex3;

public class Calculadora {
	private String marca;
	private String modelo;
	private Tipo tipo;
	private int memoriaInternaMB;

	public Calculadora(String marca, String modelo, Tipo tipo, int memoriaInternaMB) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.memoriaInternaMB = memoriaInternaMB;
	}

	public double somar(double a, double b) {
		return a + b;
	}

	public double subtrair(double a, double b) {
		return a - b;
	}

	public double multiplicar(double a, double b) {
		return a * b;
	}

	public double dividir(double a, double b) {
		if (b == 0) {
			System.out.println("O divisor não pode ser igual a zero!");
			return 0.0;
		} else {
			return a / b;
		}
	}

	public String getMarca() {
		return this.marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public Tipo getTipo() {
		return this.tipo;
	}

	public int getMemoriaInternaMB() {
		return this.memoriaInternaMB;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", memoriaInternaMB="
				+ memoriaInternaMB + "]\n";
	}

}
