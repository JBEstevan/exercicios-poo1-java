package exercicios.lista3.ex4;

public class ContaTeste {

	public static void main(String[] args) {
		Conta conta1 = new Conta(3670, 12345678, 3500.00);
		Conta conta2 = new Conta(0001, 10020047, 4600.00);

		System.out.println(conta1);

		conta1.sacar(3500.01);
		conta1.sacar(3500.0);

		conta1.sacar(3499.99);
		conta1.sacar(-3499.99);

		conta2.depositar(-4000.00);
		conta2.depositar(5400.00);

		conta2.verificarSaldo();
		conta1.verificarSaldo();

	}

}
