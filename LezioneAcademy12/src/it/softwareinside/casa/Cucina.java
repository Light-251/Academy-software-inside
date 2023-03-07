package it.softwareinside.casa;

public class Cucina {
	private Frigorifero frigorifero;
	private Dimensioni dimensioni;

	public Cucina(Frigorifero frigorifero, Dimensioni dimensioni) {
		setDimensioni(dimensioni);
		setFrigorifero(frigorifero);
	}
	
	public String toString() {
		return "Cucina [ Frigorifero: " + frigorifero
				+ " Dimensioni: " + dimensioni
				+ " ]";
	}

	public Cucina() {
		this(new Frigorifero(), new Dimensioni());
	}

	public void setFrigorifero(Frigorifero frigorifero) {
		this.frigorifero = frigorifero;
	}

	public void setDimensioni(Dimensioni dimensioni) {
		this.dimensioni = dimensioni;
	}

	public Frigorifero getFrigorifero() {
		return frigorifero;
	}

	public Dimensioni getDimensioni() {
		return dimensioni;
	}

}
