package exercicios.lista4.ex1;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua do Bobo", 0, "Jd. Carvalho", "Ponta Fina", "PR");

		Funcionario funcionario1 = new Funcionario(15888, "Davi Scheiffer", "15/09/1985", "Masculino", "Manutenção",
				"42 4002 8922", endereco1);

		funcionario1.emitirRelatorio();
	}

}
