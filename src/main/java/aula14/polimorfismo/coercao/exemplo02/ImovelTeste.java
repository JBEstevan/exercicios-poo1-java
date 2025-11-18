package aula14.polimorfismo.coercao.exemplo02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImovelTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Imovel imovel = null;

		System.out.println("1 - Imóvel Novo");
		System.out.println("2 - Imóvel Usado");
		System.out.println("Opção:");
		int opcao = input.nextInt();

		switch (opcao) {
		case 1:
			// coerção implícita
			imovel = new ImovelNovo("Vicente Machado, 1024", 500000.00, 150000.00);
			break;
		case 2:
			// coerção implícita
			imovel = new ImovelUsado("Balduino Taques, 2048", 500000.00, 50000.00);
			break;

		}
		imovel.imprimirDados();

		System.out.println("===== ===== ===== =====");

		if (imovel instanceof ImovelNovo) {
			// coerção explícita
			ImovelNovo imovelNovo = (ImovelNovo) imovel;
			imovelNovo.imprimirDados();
		}
		ImovelNovo in1 = new ImovelNovo("Vicente Machado, 1024", 500000.00, 150000.00);
		ImovelUsado iu1 = new ImovelUsado("Balduino Taques, 2048", 500000.00, 50000.00);
		
		List<Imovel> listaImovel = new ArrayList<>();
	}

}
