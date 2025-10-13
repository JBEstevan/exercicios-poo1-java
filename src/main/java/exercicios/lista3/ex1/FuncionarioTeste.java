package exercicios.lista3.ex1;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Endereco enderecoJuan = new Endereco("Rua do Bobo", 0, "Jd. Carvalho", "Ponta Grossa", "Paraná");

		Funcionario juan = new Funcionario(1241, "Juan Estevan", "21/07/2005", "Masculino", "T.I", "42 99988-7766",
				enderecoJuan);

		System.out.println(juan);

		System.out.println("===== ===== ===== =====");

		juan.setSetor("Desenvolvimento");

		juan.setTelefone("42 99911 2233");

		System.out.println(juan);

	}

}
