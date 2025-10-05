package exercicios.lista1.ex2;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Juan", "Masculino", "01233455112", 27, 1.80, 98.80);
		Pessoa pessoa2 = new Pessoa("Paula", "Feminino", "02133144222", 26, 1.64, 60.0);
		Pessoa pessoa3 = new Pessoa("Alessandra", "Feminino", "01433455130", 54, 1.66, 71.00);

		System.out.println(pessoa1);

		pessoa1.andar();

		pessoa2.correr();

		pessoa3.falar();

		pessoa1.dormir();
	}

}
