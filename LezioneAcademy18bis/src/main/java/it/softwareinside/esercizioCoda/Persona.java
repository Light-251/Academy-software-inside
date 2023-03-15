package it.softwareinside.esercizioCoda;

import lombok.Data;

@Data
public class Persona {
	private String cognome;
	private int eta;
	
	@Override
	public String toString() {
		return "Cognome: " + this.cognome + " Età " + this.eta + ";";
	}

	public Persona() {
		this("Rossi", 40);
	}
	
	public Persona(String cognome, int eta) {
		setCognome(cognome);
		setEta(eta);
	}
}
