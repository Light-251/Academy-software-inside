package it.softwareinside.libro;

public class Libro {
	private String titolo;
	private String autore;
	private String genere;
	private int numeroPagine;
	private double prezzo;

	@Override
	public String toString() {
		return "Titolo: " + this.titolo
				+ ", Autore: " + this.autore
				+ ", Genere: " + this.genere
				+ ", Numero Pagine: " + this.numeroPagine
				+ ", Prezzo: " + this.prezzo;
	}
	
	// SETTER
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public void setNumeroPagine(int numeroPagine) {
		if (numeroPagine > 0)
			this.numeroPagine = numeroPagine;
		else
			this.numeroPagine = - numeroPagine;
		//this.numeroPagine = numeroPagine > 0 ? numeroPagine : - numeroPagine;
	}

	public void setPrezzo(double prezzo) {
		if (prezzo > 10)
			this.prezzo = prezzo;
		else
			this.prezzo = 10;
		//this.prezzo = prezzo > 10 ? prezzo : 10;
	}

	// GETTER
	public String getTitolo() {
		return this.titolo;
	}

	public String getAutore() {
		return this.autore;
	}

	public String getGenere() {
		return this.genere;
	}

	public int getNumeroPagine() {
		return this.numeroPagine;
	}

	public double getPrezzo() {
		return this.prezzo;
	}
}
