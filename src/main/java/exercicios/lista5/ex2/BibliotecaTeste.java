package exercicios.lista5.ex2;

public class BibliotecaTeste {

	public static void main(String[] args) {
		Biblioteca biblioteca1 = new Biblioteca();

		biblioteca1.cadastrarLivro("O Poderoso Chefão", "Mario Puzo", 2012, "Record", 461);

		biblioteca1.devolverLivroBiblioteca("O Poderoso Chefão", 24);

		biblioteca1.emprestarLivroBiblioteca("O Poderoso Chefão", 05);

		biblioteca1.devolverLivroBiblioteca("O Poderoso Chefão", 24);

	}

}
