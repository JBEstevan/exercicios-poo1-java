package exercicios.lista5.ex4;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private int ra;
	private String nome;
	private List<Double> notas;

	public Aluno(int ra, String nome) {
		super();
		this.ra = ra;
		this.nome = nome;
		this.notas = new ArrayList<Double>();
	}

	public void inserirNota(double nota) {
		this.notas.add(nota);
		System.out.println("Nota " + nota + " inserida para o aluno " + this.nome);
	}

	public double calcularMedia() {
		if (this.notas.isEmpty()) {
			return 0.0;
		}
		double soma = 0.0;
		for (double nota : notas) {
			soma += nota;
		}
		return soma / this.notas.size();
	}

	public int getRa() {
		return ra;
	}

	public String getNome() {
		return nome;
	}

	public List<Double> getNotas() {
		return notas;
	}

}
