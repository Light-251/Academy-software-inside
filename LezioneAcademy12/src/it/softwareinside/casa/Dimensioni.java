package it.softwareinside.casa;

public class Dimensioni {
	private double larghezza, lunghezza;
	
	public Dimensioni(double larghezza, double lunghezza) {
		setLarghezza(larghezza);
		setLunghezza(lunghezza);
	}
	
	public String toString() {
		return "Dimensioni [ Larghezza: " + larghezza
				+ " Lunghezza: " + lunghezza
				+ " ]";
	}
	
	public Dimensioni() {
		this(5.00, 5.00);
	}

	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza > 0 ? larghezza : -larghezza;
	}

	public void setLunghezza(double lunghezza) {
		this.lunghezza = lunghezza > 0 ? lunghezza : -lunghezza;
	}
	
	public double getLarghezza() {
		return larghezza;
	}
	
	public double getLunghezza() {
		return lunghezza;
	}
	
	public double calcolaArea() {
		return larghezza * lunghezza;
	}

}
