package aula11;

public class ClienteTeste {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(111, "Batoré", "20/05/1995", EstadoCivil.SOLTEIRO);

		cliente1.gerarRelatorio();

		System.out.println("===== ===== ===== =====");

		cliente1.alterarEstadoCivil(EstadoCivil.CASADO);

		cliente1.gerarRelatorio();
	}

}
