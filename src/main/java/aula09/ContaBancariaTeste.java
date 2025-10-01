package aula09;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		
		ContaBancaria contaBancaria1 = new ContaBancaria(111, "Juan");
		contaBancaria1.imprimirSaldo();
		
		
		contaBancaria1.setTitular("João");
		
		System.out.println("Numero da Conta: " + contaBancaria1.getNumero());
		System.out.println("Nome do Titular: " + contaBancaria1.getTitular());
		
		System.out.println("===============================");
		
		System.out.println(contaBancaria1);
	}

}
