package exercicios.lista4.ex3;

public class ContaTeste {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua do bobo", 0, "Jd. Pinheiro", "Ponta Fina", "Paraná");
		Titular titular1 = new Titular("001.002.003-12", "12.001.002-1", "Cirilo da Silva Sauro", "05/05/1955",
				"Masculino", 27000.14, endereco1);
		Conta conta1 = new Conta("0001", "04777-1", titular1, 7550.00);

		conta1.emitirSaldo();
		conta1.sacar(-7550.00);
		conta1.emitirSaldo();
		conta1.depositar(10000.00);
		conta1.emitirSaldo();
		conta1.sacar(50000.00);
		conta1.sacar(17550.00);
		conta1.emitirSaldo();
	}
}
