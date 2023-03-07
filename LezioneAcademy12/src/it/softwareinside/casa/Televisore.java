package it.softwareinside.casa;

public class Televisore {
	private String marca;
	private double costo, pollici;
	
	public Televisore(String marca, double costo, double pollici) {
		setMarca(marca);
		setCosto(costo);
		setPollici(pollici);
	}
	
	public String toString() {
		return "Televisore [ Marca " + marca
				+ " Costo: " + costo
				+ " Pollici: " + pollici
				+ " ]";
	}
	
	public Televisore() {
		this("LG", 200.00, 32.00);
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setCosto(double costo) {
		this.costo = costo > 0 ? costo : -costo;
	}
	
	public void setPollici(double pollici) {
		this.pollici = pollici;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public double getCosto() {
		return costo;
	}
	
	public double getPollici() {
		return pollici;
	}

}
