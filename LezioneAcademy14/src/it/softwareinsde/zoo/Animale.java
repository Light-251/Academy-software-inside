package it.softwareinsde.zoo;

public class Animale {
	private int eta;
	private String colore;
	private char sesso;

	public Animale() {
		this(0, "bianco", 'm');
	}

	public Animale(int eta, String colore, char sesso) {
		setEta(eta);
		setColore(colore);
		setSesso(sesso);
	}

	/**
	 * Stampa a video un saluto
	 */
	public void saluta() {
		System.out.println("Ciao sono un animale");
	}

	@Override
	public String toString() {
		return "Animale [ Età: " + this.eta + ", Colore: " + this.colore + ", Sesso: " + this.sesso + " ]";
	}

	public void setEta(int eta) {
		this.eta = eta >= 0 ? eta : -eta;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public void setSesso(char sesso) {
		this.sesso = sesso == 'm' || sesso == 'f' ? sesso : 'm';
	}

	public int getEta() {
		return this.eta;
	}

	public String getColore() {
		return this.colore;
	}

	public char getSesso() {
		return this.sesso;
	}

}
