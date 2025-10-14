package aula10;

public class PessoaTeste {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua do bobo", 0, "Jd. Carvalho", "Ponta Grossa", "PR");

		Pessoa pessoa1 = new Pessoa("Juan", "21/01/2005", "Masculino", "j@gmail.com", "Casado", endereco1);

		pessoa1.imprimirDados();
	}

}
