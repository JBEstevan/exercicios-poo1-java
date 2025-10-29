package exercicios.lista4.ex5;

public class EventoTeste {

	public static void main(String[] args) {
		Artista artista1 = new Artista("Ney Matofino", "Brasileiro",
				"Ney da Silva Sauro, mais conhecido como Ney Matofino, é um cantor, intérprete, dançarino, ator e diretor brasileiro. Ex-integrante do Enxutos & Enxarcados, foi o artista que mais sobressaiu do grupo após iniciar sua carreira solo");
		Endereco endereco1 = new Endereco("Rua Padre Anacleto", 236, "Nova Rússia", "Ponta Grossa", "Paraná");
		LocalEvento localEvento1 = new LocalEvento("Zucão", endereco1, 3000);
		Evento evento1 = new Evento("Bailão PG", artista1, "22/01/2026", localEvento1, 18);

		evento1.venderIngresso(3001);
		evento1.venderIngresso(2);
		
		System.out.println(evento1.toString());
	}

}
