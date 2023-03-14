package it.softwareinside.biblioteca;

public class Libro {
	private String titolo;
	private int numPagine;
	
	public Libro() {
		this("Libro-Def", 150);
	}
	
	public Libro(String titolo, int numPagine) {
		setTitolo(titolo);
		setNumPagine(numPagine);
	}
	
	@Override
	public String toString() {
		return "Libro: Titolo: " + this.titolo + ", Numero Pagine: " + this.numPagine;
	}
	
	public String getTitolo() {
		return this.titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getNumPagine() {
		return this.numPagine;
	}
	public void setNumPagine(int numPagine) {
		this.numPagine = numPagine > 0 ? numPagine : -numPagine;
	}
	
	

}
