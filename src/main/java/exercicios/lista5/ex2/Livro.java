package exercicios.lista5.ex2;

public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String editora;
	private int totalPaginas;
	private boolean disponivel;
	private int diaEmprestimo;
	private int diaDevolucao;

	public Livro(String titulo, String autor, int anoPublicacao, String editora, int totalPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.editora = editora;
		this.totalPaginas = totalPaginas;
		this.disponivel = true;
		this.diaEmprestimo = 0;
		this.diaDevolucao = 0;
	}

	public void emprestarLivro(int diaEmprestimo) {
		if (disponivel) {
			this.diaEmprestimo = diaEmprestimo;
			disponivel = false;
			System.out.println("Você alugou o livro " + titulo + " por 7 dias a contar de hoje.\n");
			return;
		}
		System.out.println("Desculpe, o livro " + titulo + " não está disponível no momento.\n");
	}

	public void devolverLivro(String titulo, int diaDevolucao) {
		if (!disponivel) {
			this.diaDevolucao = diaDevolucao;

			System.out.println("Obrigado por devolver o livro " + titulo);
			this.verificarMulta();
			disponivel = true;
		} else {
			System.out.println("Desculpe você não está com esse livro: " + titulo);
		}
	}

	public void verificarMulta() {
		int totalDias = diaDevolucao - diaEmprestimo;
		if (totalDias > 7) {
			totalDias -= 7;
			double valorMulta = totalDias * 1.50;
			System.out.printf("Você deve pagar R$ %.2f de multa pelos %d dias de atraso.\n", valorMulta, totalDias);
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public String getEditora() {
		return editora;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public int getDiaEmprestimo() {
		return diaEmprestimo;
	}

	public int getDiaDevolucao() {
		return diaDevolucao;
	}

}
