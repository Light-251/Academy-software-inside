package it.softwareinside.archivio;

public class Documento {

	private String testo;

	public Documento() {
		this("Lorem ipsum");
	}

	public Documento(String unTesto) {
		setTesto(unTesto);
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	public String getTesto() {
		return this.testo;
	}
	
	@Override
	public String toString() {
		return "Documento : Testo: " + this.testo + "\n";
	}
	
	/**
	 * Calcola la qualità di un documento 
	 * sapendo che minore è la lunghezza del testo maggiore è la qualità
	 * 
	 * @return
	 */
	public double calcolaQualita() {
		double qualita = 1 / (1 + (double)this.testo.length());
		return qualita;
	}

}
