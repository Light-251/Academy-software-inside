package it.softwareinside.casa;

public class Frigorifero {
	private char classeEnergetica;
	private double costo;
	private boolean isAntiFroz;
	private String marca;

	public Frigorifero(char classeEnergetica, double costo, boolean isAntiFroz, String marca) {
		setClasseEnergetica(classeEnergetica);
		setCosto(costo);
		setAntiFroz(isAntiFroz);
		setMarca(marca);
	}
	
	@Override
	public String toString() {
		
		String ris = isAntiFroz ? "Ha l'anti-frost" : "Non ha l'anti-frost";
		
		return "Frigorifero [ Classe energetica: " + classeEnergetica
				+ " Costo: " + costo
				+ " Anti Froz: " + ris
				+ " Marca: " + marca
				+ " ]";
	}

	public Frigorifero() {
		this('A', 150.00, false, "Samsung");
	}

	public void setClasseEnergetica(char classeEnergetica) {
		switch(classeEnergetica) {
		case 'a':
			this.classeEnergetica = 'a';
			break;
		case 'b':
			this.classeEnergetica = 'b';
			break;
		case 'c':
			this.classeEnergetica = 'c';
			break;
		case 'd':
			this.classeEnergetica = 'd';
			break;
		default:
			this.classeEnergetica = 'c';
		}
	}

	public void setCosto(double costo) {
		this.costo = costo > 0 ? costo : -costo;
	}

	public void setAntiFroz(boolean isAntiFroz) {
		this.isAntiFroz = isAntiFroz;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public char getClasseEnergetica() {
		return classeEnergetica;
	}

	public double getCosto() {
		return costo;
	}

	public boolean isAntiFroz() {
		return isAntiFroz;
	}

	public String getMarca() {
		return marca;
	}

}
