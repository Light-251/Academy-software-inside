package it.softwareinside.automobile;

public class Carrozzeria {

	private String colore, vernice, materiale;
	
	
	public Carrozzeria() {
		setColore("N/A");
		setMateriale("N/A");
		setVernice("N/A");
	}
	
	public Carrozzeria(String colore, String vernmice, String materiale) {
		setColore(colore);
		setMateriale(materiale);
		setVernice(materiale);
	}
	
	@Override
	public String toString() {
		return "Carrozzeria [ Colore: " + colore
				+ " Vernice: " + vernice
				+ " Materiale: " + materiale
				+ " ]";
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public void setVernice(String vernice) {
		this.vernice = vernice;
	}
	
	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}
	
	public String getColore () {
		return colore;
	}
	
	public String getVernice() {
		return vernice;
	}
	
	public String getMateriale() {
		return materiale;
	}
}
