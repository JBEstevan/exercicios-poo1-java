package aula11;

public class EmpresaTeste {

	public static void main(String[] args) {
		Empresa empresa1 = new Empresa("Universidade Tecnológica Federal do Paraná - PG", "75.101.873/0005-13",
				UnidadeFederativa.PARANA);
		Empresa empresa2 = new Empresa("Inteli - Instituto de Tecnologia e Liderança", "28.226.170/0001-08",
				UnidadeFederativa.SAO_PAULO);

		empresa1.imprimirRelatorio();
		empresa2.imprimirRelatorio();

	}

}
