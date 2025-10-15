package aula11;

public class Pedido {
	private int id;
	private String data;
	private Status status;

	public Pedido(int id, String data, Status status) {
		super();
		this.id = id;
		this.data = data;
		this.status = status;
	}

	public void alterarStatusPedido(Status novoStatus) {
		this.status = novoStatus;
	}

	public void imprimirRelatorio() {
		System.out.println("ID: " + this.id);
		System.out.println("Data: " + this.data);
		System.out.println("Status: " + this.status);
	}
}
