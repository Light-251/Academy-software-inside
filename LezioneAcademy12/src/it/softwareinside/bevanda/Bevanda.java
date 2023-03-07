package it.softwareinside.bevanda;

public class Bevanda {
	private String marca;
	private double costo, capienza;
	private boolean isAlcolica;

	public Bevanda(String marca, double costo, double capienza, boolean isAlcolica) {
		setMarca(marca);
		setCosto(costo);
		setCapienza(capienza);
		isAlcolica(isAlcolica);
	}
	
	public Bevanda() {
		this("N/A", 1.50, 0.33, false);
	}
	
	@Override
	public String toString() {
		String ris = isAlcolica ? "Alcolica" : "Analcolica"; 
		
		return "Marca: " + marca
				+" Costo " + costo
				+" Capienza " + capienza
				+" Contenuto alcool: " + ris;
	}
	
	
	public void setCapienza(double capienza) {
		this.capienza = capienza == 0.33 || capienza == 0.66 ? capienza : 0.33;
		
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setCosto(double costo) {
		this.costo = costo > 0 ? costo : -costo;
	}
	
	public void isAlcolica(boolean isAlcolica) {
		this.isAlcolica = isAlcolica;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public double getCosto() {
		return costo;
	}
	
	public double getCapienza() {
		return capienza;
	}
	
	public boolean getIsAlcolica() {
		return isAlcolica;
	}
	
}
