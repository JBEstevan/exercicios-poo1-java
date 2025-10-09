package exercicios.lista2.ex2;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Juan", "Masculino", "01233455112", 27, 1.80, 98.80);
		Pessoa pessoa2 = new Pessoa("Paula", "Feminino", "02133144222", 26, 1.64, 60.0);
		Pessoa pessoa3 = new Pessoa("Alessandra", "Feminino", "01433455130", 54, 1.66, 71.00);

		System.out.println(pessoa1);

		pessoa1.andar();

		pessoa1.setNome("Raimundo");

		pessoa2.correr();

		pessoa2.setPeso(59.1);

		pessoa3.falar();

		pessoa3.setNome("Alessandra Brandão");
		System.out.println("O novo nome é: " + pessoa3.getNome() + "\n");

		pessoa1.dormir();

		System.out.println(pessoa1);
	}

}
