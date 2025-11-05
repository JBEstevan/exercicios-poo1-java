package exercicios.lista5.ex2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Livro> livros;

	public Biblioteca() {
		this.livros = new ArrayList<Livro>();
	}

	public Livro buscarLivroPorTitulo(String titulo) {
		for (Livro livro : this.livros) {
			if (livro.getTitulo().equals(titulo)) {
				return livro;
			}
		}
		return null;
	}

	public void cadastrarLivro(String titulo, String autor, int anoPublicacao, String editora, int totalPaginas) {
		if (this.buscarLivroPorTitulo(titulo) != null) {
			System.out.println("O livro já existe.\n");
		}
		Livro livro = new Livro(titulo, autor, anoPublicacao, editora, totalPaginas);
		this.livros.add(livro);
		System.out.println("Livro criado com sucesso!\n");
	}

	public void emprestarLivroBiblioteca(String titulo, int diaEmprestimo) {
		Livro livro = this.buscarLivroPorTitulo(titulo);
		if (livro != null) {
			livro.emprestarLivro(diaEmprestimo);
			return;
		}
		System.out.println("Livro indisponível.\n");
	}

	public void devolverLivroBiblioteca(String titulo, int diaDevolucao) {
		Livro livro = this.buscarLivroPorTitulo(titulo);
		if (livro != null) {
			livro.devolverLivro(titulo, diaDevolucao);
			return;
		}
		System.out.println("Desculpe, você não está com esse livro: " + titulo);
	}

}
