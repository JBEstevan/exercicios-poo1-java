package exercicios.lista4.ex4;

public class AnimalTeste {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua Calicute", 0, "Vila Pindorama", "Ponta Fina", "Paraná");
		Dono dono1 = new Dono("001.002.003-11", "Pero Vaz de Caminha", "4002-8922", "perocaminha@bol.com", endereco1);
		Animal animal1 = new Animal("Filó", 12, "Feminino", dono1);

		animal1.finalizarTratamento("26/10/2025");
		animal1.exibirRelatorio();
		animal1.iniciarTratamento("Filó está com dor de barriga", "25/10/2025");
		animal1.exibirRelatorio();
		animal1.finalizarTratamento("26/10/2025");
		animal1.exibirRelatorio();
	}
}