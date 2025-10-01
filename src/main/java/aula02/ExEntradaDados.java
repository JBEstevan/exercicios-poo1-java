package aula02;
import java.util.Scanner;
public class ExEntradaDados {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Informe seu nome completo:");
		String nome = entradaTeclado.nextLine();
		
		System.out.println("Informe seu sexo:");
		String sexo = entradaTeclado.nextLine();
		
		System.out.println("Informe seu estado civil:");
		String estadoCivil = entradaTeclado.nextLine();
		
		System.out.println("Informe a quantidade de filhos:");
		int qtdFilhos = entradaTeclado.nextInt();
		
		entradaTeclado.nextLine(); // limpar buffer
		
		System.out.println("Informe sua escolaridade:");
		String escolaridade = entradaTeclado.nextLine();
		
		System.out.println("Informe sua renda mensal:");
		double renda = entradaTeclado.nextDouble();
		
		System.out.println("----------------------------");
		
		System.out.printf("Nome completo: %s.\nSexo: %s\nEstado civil: %s\nNr de filhos: %d\nEscolaridade: %s\nRenda: %.2f",
				nome, sexo, estadoCivil, qtdFilhos, escolaridade, renda);
		
	}
}
