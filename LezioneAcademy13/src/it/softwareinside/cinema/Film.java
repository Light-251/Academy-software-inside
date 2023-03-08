package it.softwareinside.cinema;

public class Film {
	private String nome, genere;
	private int etaMinima;

	public Film() {
		this("Film default", "N/A", 30);
	}

	public Film(String nome, String genere, int etaMinima) {
		setNome(nome);
		setGenere(genere);
		setEtaMinima(etaMinima);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public void setEtaMinima(int etaMinima) {
		this.etaMinima = etaMinima;
	}

	public String getNome() {
		return this.nome;
	}

	public String getGenere() {
		return this.genere;
	}

	public int getEtaMinima() {
		return this.etaMinima;
	}

}
