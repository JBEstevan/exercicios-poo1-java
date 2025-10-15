package exercicios.lista3.ex4;

public class ContaTeste {

	public static void main(String[] args) {
		Conta conta1 = new Conta("3670", "12345678", 3500.00);
		Conta conta2 = new Conta("0001", "10020047", 4600.00);

		boolean saque1 = conta1.sacar(3500.01);
		if (!saque1) {
			System.out.println("Operação não concluída. Não foi possível emitir o comprovante.\n");
		}

		conta1.verificarSaldo();

		boolean saque2 = conta1.sacar(500.00);
		if (saque2) {
			System.out.println("Comprovante de saque emitido.\n");
		}

		conta1.verificarSaldo();

		boolean deposito1 = conta2.depositar(-10.0);
		if (!deposito1) {
			System.out.println("Operação não concluída. Não foi possível emitir o comprovante.\n");
		}

		conta2.verificarSaldo();

		boolean deposito2 = conta2.depositar(5400.0);
		if (deposito2) {
			System.out.println("Comprovante de depósito emitido.\n");
		}

		conta2.verificarSaldo();

	}

}
