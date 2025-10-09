package exercicios.lista2.ex4;

public class Aluno {
	private int ra;
	private String nome;
	private String curso;
	private String turno;
	private int periodo;
	private double coeficiente;
	private String situacao;

	public Aluno(int ra, String nome, String curso, String turno, int periodo, double coeficiente, String situacao) {
		super();
		this.ra = ra;
		this.nome = nome;
		this.curso = curso;
		this.turno = turno;
		this.periodo = periodo;
		this.coeficiente = coeficiente;
		this.situacao = situacao;
	}

	public void responderChamada() {
		System.out.println(this.nome + " está respondendo a chamada.\n");
	}

	public void fazerAvaliacao() {
		System.out.println(this.nome + " está fazendo avaliação.\n");
	}

	public void imprimirRelatorio() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Aluno [ra=" + ra + ", nome=" + nome + ", curso=" + curso + ", turno=" + turno + ", periodo=" + periodo
				+ ", coeficiente=" + coeficiente + ", situacao=" + situacao + "]";
	}

	public int getRa() {
		return this.ra;
	}

	public double getCoeficiente() {
		return this.coeficiente;
	}

	public String getSituacao() {
		return this.situacao;
	}

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	public void setPeriodo(int novoPeriodo) {
		this.periodo = novoPeriodo;
	}
}
