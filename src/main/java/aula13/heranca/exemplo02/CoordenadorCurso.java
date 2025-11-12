package aula13.heranca.exemplo02;

public class CoordenadorCurso extends Professor {
	private double adicionalSalario;

	public CoordenadorCurso(int numeroRegistro, String nome, String dataNomeacao, Double salario,
			double adicionalSalario) {
		super(numeroRegistro, nome, dataNomeacao, salario);
		this.adicionalSalario = adicionalSalario;
	}

	public void analisarPedidoSegundaChamada() {
		System.out.println(this.nome + " analisando pedido de 2ª chamada.\n");
	}

	public void analisarPedidoSuficiencia() {
		System.out.println(this.nome + " analisando pedido de suficiência.\n");
	}

	public void participarReunioesDirecao() {
		System.out.println(this.nome + " participando de reuniões da direção.\n");
	}

	public void imprimirDadosCoordenador() {
		super.imprimirDados();
		System.out.println("Salário Adicional: R$" + this.adicionalSalario);
		System.out.println("Salário Total: R$" + this.calcularSalario());
	}

	public double calcularSalario() {
		return this.salario + this.adicionalSalario;
	}
}
