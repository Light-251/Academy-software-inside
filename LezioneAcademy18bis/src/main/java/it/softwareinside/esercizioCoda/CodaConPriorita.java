package it.softwareinside.esercizioCoda;


public class CodaConPriorita extends Coda{
	
	final int ETA_MASSIMA = 60;
	
	@Override
	public Persona restituisciProssimo() {
		if(trovaPersonaOver() != -1) 
			return getPersone().remove(trovaPersonaOver());
		else
			return super.restituisciProssimo();
		
	}
	
	/**
	 * Cerca una persona con un'età maggiore di etaDaCercare
	 * se la trova ritorna la posizione
	 * altrimenti ritorna -1
	 * @return
	 */
	public int trovaPersonaOver() {
		for(int i = 0; i< getPersone().size(); i++)
			if(getPersone().get(i).getEta() >= ETA_MASSIMA)
				return i;
		
		return -1;

	}

}
