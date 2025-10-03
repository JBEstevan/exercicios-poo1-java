package exercicios.lista1.ex1;

public class CarroTeste {

	public static void main(String[] args) {
		Carro carro1 = new Carro("Logan", "Renault", "Vermelho", 2015, 777771212, "ABCDE77712", "ABC-1221");
		Carro carro2 = new Carro("Tiguan", "Volkswagen", "Preta", 2017, 888883434, "FGHI88834", "AEF-4623");
		Carro carro3 = new Carro("Seal", "BYD", "Bright White", 2025, 999994545, "JKLM99956", "AJP-2120");

		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);

		System.out.println("\n===== ===== ===== =====\n");
		carro1.ligar();
		carro1.acelerar();
		carro1.frear();
		carro1.desligar();

		System.out.println("\n===== ===== ===== =====\n");
		carro2.ligar();
		carro2.ligar();
		carro2.acelerar();
		carro2.frear();
		carro2.desligar();

		System.out.println("\n===== ===== ===== =====\n");
		carro3.ligar();
		carro3.desligar();
		carro3.acelerar();
		carro3.frear();
		carro3.desligar();
		System.out.println("\n===== ===== ===== =====\n");

	}

}
