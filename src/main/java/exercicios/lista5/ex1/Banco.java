package exercicios.lista5.ex1;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Conta> contas;

	public Banco() {
		this.contas = new ArrayList<Conta>();
	}
	
	private boolean verificarConta(int numeroConta) {
		for(Conta conta : contas) {
			if(conta.getNumeroConta() == numeroConta) {
				return true;
			}
		}
		return false;
	}
	
	public void criarConta(int numeroConta, String nome, String cpf) {
		if(this.verificarConta(numeroConta)) {
			System.out.println("Já existe uma conta de número " + numeroConta);
			return;
		}
		Cliente novoCliente = new Cliente(nome, cpf);
		Conta conta = new Conta(numeroConta, novoCliente);
		
		this.contas.add(conta);
	}
	
	public void sacarConta(int numeroConta, double valor) {
		for(Conta conta : contas) {
			if(conta.getNumeroConta() == numeroConta) {
				conta.sacar(valor);
				return;
			}
		}
		System.out.println("Conta inexistente.\n");
	}
	
	/*Neste sistema o banco pode criar novas contas que deverão ser armazenadas.
	Para isto, é necessário receber o número da nova conta, nome e cpf do titular. Para cada nova conta
	criada, o saldo será 0 (zero) reais*/

}
