package exercicios.lista2.ex3;

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

		notebook1.setQtdMemoriaRam(32);
		notebook1.setModeloProcessador("Intel Core i7");
		notebook1.setCapacidadeArmazenamento(2000);

		System.out.println("O Notebook " + notebook1.getModelo() + " recebeu upgrade!\n");
		System.out.println(notebook1);

		notebook1.desligar();

		notebook1.ligar();

		notebook1.processarInfo();

		System.out.println("===== ===== ===== =====");

	}

}