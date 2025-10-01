package aula01.primeiroprograma;

public class ExercicioProdutos {
	public static void main(String[] args) {
		String produto1 = "Notebook";
		String produto2 = "SSD";
		double precoProduto1 = 3500.00;
		double precoProduto2 = 250.00;
		
		//System.out.println("Produtos:\n" + produto1 + " por apenas R$" + precoProduto1);
		//System.out.println(produto2 + "por apenas R$" + precoProduto2);
		
		System.out.printf("Produtos:\n %s por apenas R$%.2f \n %s por apenas R$%.2f",
				produto1, precoProduto1, produto2, precoProduto2);
	}
}
