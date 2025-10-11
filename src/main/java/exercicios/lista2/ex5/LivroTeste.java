package exercicios.lista2.ex5;

public class LivroTeste {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Java - Como Programar", "Paul Deitel", "Editora Pearson", 968, 2016);
		Livro livro2 = new Livro("Clean Code", "Robert C. Martin", "Prentice Hall", 464, 2008);
		Livro livro3 = new Livro("Estruturas de Dados e Algoritmos em Java", "Michael T. Goodrich", "Bookman", 736,
				2014);

		System.out.println("===== ===== ===== =====");

		livro1.gerarRelatorio();

		livro2.devolverLivro();
		System.out.println("Título: " + livro2.getTitulo() + "\nAutor: " + livro2.getAutor() + "\n");

		livro3.emprestarLivro();
		livro3.emprestarLivro();

		livro3.devolverLivro();

		System.out.println("===== ===== ===== =====");
	}

}