package exercicios.lista3.ex2;

public class Disciplina {
	private String codigo;
	private String nome;
	private Modalidade modalidade;
	private int cargaHoraria;
	private String conteudoProgramatico;

	public Disciplina(String codigo, String nome, Modalidade modalidade, int cargaHoraria,
			String conteudoProgramatico) {
		this.codigo = codigo;
		this.nome = nome;
		this.modalidade = modalidade;
		this.cargaHoraria = cargaHoraria;
		this.conteudoProgramatico = conteudoProgramatico;
	}

	public void gerarRelatorio() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Disciplina [codigo=" + codigo + ", nome=" + nome + ", modalidade=" + modalidade + ", cargaHoraria="
				+ cargaHoraria + " horas, conteudoProgramatico=" + conteudoProgramatico + "]";
	}

	public String getCodigo() {
		return this.codigo;
	}

	public String getNome() {
		return this.nome;
	}

	public Modalidade getModalidade() {
		return this.modalidade;
	}

	public int getCargaHoraria() {
		return this.cargaHoraria;
	}

	public String getConteudoProgramatico() {
		return this.conteudoProgramatico;
	}

	public void setConteudoProgramatico(String novoConteudoProgramatico) {
		this.conteudoProgramatico = novoConteudoProgramatico;
	}
}
