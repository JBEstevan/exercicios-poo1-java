package exercicios.lista2.ex5;

public class Livro {
	private String titulo;
	private String autor;
	private String editora;
	private int numeroPaginas;
	private int anoPublicacao;
	private boolean disponivel;

	public Livro(String titulo, String autor, String editora, int numeroPaginas, int anoPublicacao) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.numeroPaginas = numeroPaginas;
		this.anoPublicacao = anoPublicacao;
		this.disponivel = true;
	}

	public void emprestarLivro() {
		if (disponivel) {
			this.disponivel = false;
			System.out.println(
					"Agora o livro " + this.titulo + " está sob sua responsabilidade, lembre-se de devolve-lo.\n");
		} else {
			System.out.println("O livro " + this.titulo + " já está emprestado.\n");
		}
	}

	public void devolverLivro() {
		if (!disponivel) {
			this.disponivel = true;
			System.out.println("Obrigado por devolver o livro " + this.titulo + ", até o próximo livro!\n");
		} else {
			System.out.println("Desculpe, você não está com esse livro, talvez tenha se confundido.\n");
		}
	}

	public void gerarRelatorio() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		String status = this.disponivel ? "Disponível para empréstimo." : "Indisponível (emprestado)";
		return "\n" + titulo + ", " + autor + ", " + editora + ", " + numeroPaginas + " páginas, " + anoPublicacao
				+ ", " + status + "\n";
	}

	public String getTitulo() {
		return this.titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public String getEditora() {
		return this.editora;
	}

	public int getNumeroPaginas() {
		return this.numeroPaginas;
	}

	public int getAnoPublicacao() {
		return this.anoPublicacao;
	}

	public boolean isDisponivel() { // convenção para boolean é colocar o is em vez do get
		return this.disponivel;
	}
}
