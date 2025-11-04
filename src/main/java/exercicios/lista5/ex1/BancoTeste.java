package exercicios.lista5.ex1;

public class BancoTeste {

	public static void main(String[] args) {
		Banco banco1 = new Banco();

		banco1.criarConta(111, "Juan Estevan", "111.222.333.12");
		banco1.criarConta(222, "Anakin Skywalker", "002.555.777.48");

		banco1.criarConta(111, "Juan Teste", "111.222.333.12");

		banco1.sacarConta(333, 500.00);
		banco1.sacarConta(222, 500.00);

		banco1.depositarConta(111, 7000.00);
		banco1.sacarConta(111, 7001.00);

		banco1.verificarSaldo(111);
		banco1.verificarSaldo(222);

	}
}