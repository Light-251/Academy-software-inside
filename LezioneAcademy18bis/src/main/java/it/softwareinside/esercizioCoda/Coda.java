package it.softwareinside.esercizioCoda;

import java.util.ArrayList;
import lombok.Data;

@Data
public class Coda {
	private ArrayList<Persona> persone;
	
	public Coda() {
		persone = new ArrayList<Persona>();
	}

	@Override
	public String toString() {
		String ris = "";
		for(Persona persona : persone)
			ris += persona + " ";
		
		return "Coda: Persone: " + ris;
	}
	
	/** 
	 * Metodo restituisciProssimo : Persona
	 * restituisce l'ultima persona nella coda
	 * e la elimina dalla stessa coda
	 * 
	 */
	public Persona restituisciProssimo() {
		Persona personaTmp = persone.get(0);
		
		if(persone.size() == 0)
			return null;
		persone.remove(0);
		return personaTmp;
	}
	
	/**
	 * Aggiunge una persona in fondo alla coda
	 * 
	 */
	public void aggiungiPersona(Persona persona) {
		if(persona != null)
			persone.add(persona);
	}
}
