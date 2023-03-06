package it.softwareinside.automobile;

public class Engine {
	
	private int numeroCavalli;
	private String alimentazione;
	
	public Engine() {
		setNumeroCavalli(150);
		setAlimentazione("Alimentazione default");
	}
	
	public Engine(int numeroCavalli, String alimentazione) {
		setAlimentazione(alimentazione);
		setNumeroCavalli(numeroCavalli);
		
	}
	
	@Override
	public String toString() {
		return "Engine: [ Numero cavalli: " + numeroCavalli
				+ " Alimentazione: " + alimentazione
				+ " ]";
	}
	
	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}
	public void setNumeroCavalli(int numeroCavalli) {
		this.numeroCavalli = numeroCavalli;
	}
	
	public String getAlimentazione() {
		return alimentazione;
	}
	
	public int getNumeroCavalli() {
		return numeroCavalli;
	}
}
