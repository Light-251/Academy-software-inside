package it.softwareinside.esercizio.garage;

import it.softwareinside.esercizio.veicoli.VeicoliAMotore;

public class Garage {

	private final int CAPACITA_GARAGE = 15;

	private VeicoliAMotore[] veicoli;

	public Garage() {
		setVeicoli(new VeicoliAMotore[CAPACITA_GARAGE]);
	}
	
	/**
	 * Rimuove un veicolo dal vettore specificando la posizione
	 * Se la rimozione fallisce ritorna null
	 * 
	 * @param index
	 * @return
	 */
	public VeicoliAMotore estraiVeicolo(int index) {
		if(index < 0 || index >= veicoli.length)
			return null;
		
		VeicoliAMotore veicoloTmp = veicoli[index];
		veicoli[index] = null;
		return veicoloTmp;
	}
	
	/**
	 * Inserisce un veicolo nel vettore nella prima posizione disponibile
	 * se l'inserimento fallisce ritorna il valore -1
	 * 
	 * @param veicolo
	 * @return
	 */
	public int immettiNuovoVeicolo(VeicoliAMotore veicolo) {
		if(veicolo == null)
			return -1;
		
		for (int i = 0; i < veicoli.length; i++) {
			if(veicoli[i] == null) {
				veicoli[i] = veicolo; 
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Stampa tutti i veicoli nel vettore
	 * 
	 */
	public void stampaSituazionePosti() {
		for(VeicoliAMotore veicolo : this.veicoli)
			System.out.println(veicolo);
	}
	
	@Override
	public String toString() {
		return "Garage: [ Veicoli: " + this.veicoli + " ]";
	}

	public void setVeicoli(VeicoliAMotore[] veicoli) {
		this.veicoli = veicoli;
	}

	public VeicoliAMotore[] getVeicoli() {
		return veicoli;
	}

}
