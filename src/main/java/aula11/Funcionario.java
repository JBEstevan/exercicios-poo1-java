package aula11;

public class Funcionario {
	private int registro;
	private String nome;
	private DiaSemana folga;

	public Funcionario(int registro, String nome, DiaSemana folga) {
		super();
		this.registro = registro;
		this.nome = nome;
		this.folga = folga;
	}

	public void alterarDiaFolga(DiaSemana novaFolga) {
		this.folga = novaFolga;
	}

	public void imprimirRelatorio() {
		System.out.println("Registro: " + this.registro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Dia Semana: " + this.folga.getDiaSemanaNumerico());
		System.out.println("Dia folga: " + this.folga.getDiaSemanaExtenso());
		System.out.println("===== ===== ===== =====\n");
	}
}
