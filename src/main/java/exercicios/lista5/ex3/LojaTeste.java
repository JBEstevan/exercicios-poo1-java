package exercicios.lista5.ex3;

public class LojaTeste {

	public static void main(String[] args) {
		Loja loja1 = new Loja("76.483.817/0001-20", "SmartTec");

		loja1.cadastrarProduto(111, "Celular", "Poco", "X7 Pro", 15, 2300.00);

		loja1.imprimirRelatorio();

		loja1.cadastrarProduto(111, "Celular", "Poco", "X7 Pro", 4, 2300.00);

		loja1.reporEstoque(111, 1);

		loja1.imprimirRelatorio();

		loja1.efetuarVenda(111, 7);

		loja1.imprimirRelatorio();

		loja1.reporEstoque(111, 2);

		loja1.imprimirRelatorio();
	}

}
