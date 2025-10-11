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
					"Agora o livro " + this.titulo + " está sob sua responsabilidade, lembre-se de devolve-lo.");
		} else {
			System.out.println("O livro " + this.titulo + " já está emprestado.");
		}
	}
}
