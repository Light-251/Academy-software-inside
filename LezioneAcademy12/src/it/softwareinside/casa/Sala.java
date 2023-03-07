package it.softwareinside.casa;

public class Sala {
	private Televisore televisore;
	private Dimensioni dimensioni;
	
	public Sala(Televisore televisore, Dimensioni dimensioni) {
		setTelevisore(televisore);
		setDimensioni(dimensioni);
	}
	
	public String toString() {
		return "Sala [ Televisore: " + televisore
				+ " Dimensioni: " + dimensioni
				+ " ]";
	}
	
	public Sala() {
		this(new Televisore(), new Dimensioni());
	}
	
	public void setTelevisore(Televisore televisore) {
		this.televisore = televisore;
	}
	
	public Televisore getTelevisore() {
		return televisore;
	}
	
	public void setDimensioni(Dimensioni dimensioni) {
		this.dimensioni = dimensioni;
	}
	
	public Dimensioni getDimensioni() {
		return dimensioni;
	}

	
}
