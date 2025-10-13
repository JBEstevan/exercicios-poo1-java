package exercicios.lista2.ex6;

public class TelevisaoTeste {

	public static void main(String[] args) {
		Televisao televisao1 = new Televisao("Samsung", 50, 3840);
		Televisao televisao2 = new Televisao("LG", 42, 1920);

		System.out.println("===== ===== ===== =====");

		System.out.println(televisao2);

		televisao1.subirVolume();

		televisao1.gerarRelatorio();

		televisao2.desligar();

		televisao1.ligar();

		televisao2.diminuirCanal();

		televisao1.diminuirCanal();

		televisao1.gerarRelatorio();

		televisao1.baixarVolume();

		televisao1.subirVolume();

		televisao1.gerarRelatorio();

	}

}
