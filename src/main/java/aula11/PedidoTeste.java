package aula11;

public class PedidoTeste {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(111, "15/10/2025", Status.AGURDANDO_PAGAMENTO);
		pedido1.imprimirRelatorio();

		pedido1.alterarStatusPedido(Status.PROCESSANDO);
		pedido1.imprimirRelatorio();
	}

}
