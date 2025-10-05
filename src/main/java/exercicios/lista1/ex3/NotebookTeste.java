package exercicios.lista1.ex3;

public class NotebookTeste {

	public static void main(String[] args) {
		Notebook notebook1 = new Notebook("Acer", "Nitro V", 15.5, "Intel Core i5", 16, 1000);

		System.out.println(notebook1);

		System.out.println("===== ===== ===== =====");

		notebook1.ligar();
		notebook1.ligar();

		notebook1.conectarInternet();

		notebook1.desligar();

		notebook1.processarInfo();

		notebook1.desligar();

		notebook1.ligar();

		notebook1.processarInfo();

		System.out.println("===== ===== ===== =====");

	}

}