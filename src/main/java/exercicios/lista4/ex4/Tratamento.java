package exercicios.lista4.ex4;

public class Tratamento {
	private String descricao;
	private String dataInicio;
	private String dataFim;

	public Tratamento(String descricao, String dataInicio) {
		super();
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataFim = null;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

}
