package exercicios.lista4.ex5;

public class Evento {
	private String nome;
	private Artista artista;
	private String data;
	private LocalEvento localEvento;
	private int classificacaoEtaria;

	public Evento(String nome, Artista artista, String data, LocalEvento localEvento, int classificacaoEtaria) {
		super();
		this.nome = nome;
		this.artista = artista;
		this.data = data;
		this.localEvento = localEvento;
		this.classificacaoEtaria = classificacaoEtaria;
	}

	public void venderIngresso(int quantidadeIngresso) {
		if (quantidadeIngresso <= 0) {
			System.out.println("Quantidade inválida.\n");
			return;
		}

		int ingressosAtuais = this.localEvento.getIngressosDisponiveis();

		if (ingressosAtuais >= quantidadeIngresso) {
			int novaQuantidade = ingressosAtuais - quantidadeIngresso;
			this.localEvento.setIngressosDisponiveis(novaQuantidade);
			System.out.println("Venda de " + quantidadeIngresso + " ingresso(s) realizada com sucesso!\n");
			System.out.println("Ingressos restantes: " + novaQuantidade + "\n");
		} else {
			System.out.println("Venda não realizada. Não existem mais ingressos suficientes para essa compra. (Existem "
					+ ingressosAtuais + " ingressos disponíveis)\n");
		}
	}

	@Override
	public String toString() {
		return "Evento [nome=" + nome + ", artista=" + artista + ", data=" + data + ", localEvento=" + localEvento
				+ ", classificacaoEtaria=" + classificacaoEtaria + "]";
	}

}
