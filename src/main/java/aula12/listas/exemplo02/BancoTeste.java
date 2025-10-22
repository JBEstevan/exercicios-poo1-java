package aula12.listas.exemplo02;

public class BancoTeste {

	public static void main(String[] args) {
		Banco banco = new Banco(123456, "UTFBank");
		banco.adicionarNovaConta(111, "João da Silva");
		banco.adicionarNovaConta(222, "Maria Oliveira");
		banco.adicionarNovaConta(333, "Ricardo Carvalho");
	}

}
