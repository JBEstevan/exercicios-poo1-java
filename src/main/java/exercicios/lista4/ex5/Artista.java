package exercicios.lista4.ex5;

public class Artista {
	private String nome;
	private String nacionalidade;
	private String biografia;

	public Artista(String nome, String nacionalidade, String biografia) {

		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.biografia = biografia;
	}

	public String getNome() {
		return nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public String getBiografia() {
		return biografia;
	}

	@Override
	public String toString() {
		return "Artista [nome=" + nome + ", nacionalidade=" + nacionalidade + ", biografia=" + biografia + "]";
	}

}
