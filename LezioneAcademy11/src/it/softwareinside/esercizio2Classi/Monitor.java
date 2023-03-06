package it.softwareinside.esercizio2Classi;

public class Monitor {
	
	private String marca;
	private double pollici, costo;
	
	public Monitor() {
		setMarca("Default");
		setPollici(0.00);
		setCosto(50.00);
	}
	
	public Monitor(String marca, double pollici, 
			       double costo) {
		setMarca(marca);
		setPollici(pollici);
		setCosto(costo);
	}
	
	@Override
	public String toString() {
		return "Monitor [ Marca: " + marca 
				+ " Pollici: " + pollici
				+ " Costo " + costo + "€ ]";
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setPollici(double pollici) {
		this.pollici = pollici;
	}
	
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public double getPollici() {
		return pollici;
	}
	
	public double getCosto() {
		return costo;
	}
	
	

}
