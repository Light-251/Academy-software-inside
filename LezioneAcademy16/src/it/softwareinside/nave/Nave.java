package it.softwareinside.nave;

import java.util.ArrayList;

public class Nave {
	final int POSTI_NAVE = 10;

	private ArrayList<Persona> personeABordo;
	private String nome, codiceImbarco;
	private int numeroExpRichiesta;

	public Nave() {
		this("TITANIC II", "A-000", 4);
	}

	public Nave(String nome, String codiceDiImbarco, int numeroExpRichiesta) {
		setNome(nome);
		setCodiceImbarco(codiceDiImbarco);
		setNumeroExpRichiesta(numeroExpRichiesta);
		this.personeABordo = new ArrayList<>();
	}

	@Override
	public String toString() {
		String ris = "";
		int pos = 0;
		for (Persona persona : personeABordo) {
			ris += pos + " " + persona + "\n";
			pos++;
		}
		return "Nave: Persone a bordo:\n" + ris;
	}

	public void setPersoneABordo(ArrayList<Persona> personeABordo) {
		this.personeABordo = personeABordo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCodiceImbarco(String codiceImbarco) {
		this.codiceImbarco = codiceImbarco;
	}

	public void setNumeroExpRichiesta(int numeroExpRichiesta) {
		this.numeroExpRichiesta = numeroExpRichiesta;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCodiceImbarco() {
		return this.codiceImbarco;
	}

	public int getNumeroExpRichiesta() {
		return this.numeroExpRichiesta;
	}

	public ArrayList<Persona> getPersoneABordo() {
		return this.personeABordo;
	}

	/**
	 * Ritorna vero se c'è gia un capitano sulla nave
	 * 
	 * @return
	 */
	public boolean capitanoABordo() {
		for (Persona persona : personeABordo)
			if (persona instanceof Capitano)
				return true;

		return false;
	}

	/**
	 * Stampa tutti gli attributi della nave
	 */
	public void stampaNave() {
		System.out.println(this.toString());

	}

	/**
	 * Aggiunge un passeggero nell'arraylist se c'è un posto disponibile e se la
	 * persona ha una carta d'imbarco uguale al codice di imbarco della nave
	 * 
	 * @param persona
	 * @return
	 */
	public boolean addPasseggero(Persona persona) {

		if (persona instanceof Passeggero && ((Passeggero) persona).getCartaDiImbarco().equals(getCodiceImbarco())
				&& personeABordo.size() < POSTI_NAVE - 2) {
			personeABordo.add(persona);
			return true;
		}

		return false;
	}

	/**
	 * Aggiunge un Capitano alla nave se non è presente
	 * 
	 * @param capitano
	 * @return
	 */
	public boolean addCapitano(Capitano capitano) {
		if (!capitanoABordo() && personeABordo.size() < POSTI_NAVE
				&& capitano.getExperience() >= getNumeroExpRichiesta()) {
			personeABordo.add(capitano);
			return true;
		}

		return false;

	}

	/**
	 * Aggiunge un PersonaleDiBordo alla nave se c'è un posto libero
	 * 
	 * @param personaleDiBordo
	 * @return
	 */
	public boolean addPersonaleDiBordo(PersonaleDiBordo personaleDiBordo) {
		if (personaleDiBordo == null || personeABordo.size() > POSTI_NAVE)
			return false;

		personeABordo.add(personaleDiBordo);
		return true;
	}

	/**
	 * Rimuove tutte le persone sulla nave
	 * 
	 */
	public void removeAll() {
//		for (int i = 0; i < personeABordo.size(); i++) {
//			personeABordo.remove(i);
//		}
		personeABordo.removeAll(personeABordo);
	}

	/**
	 * Rimuove una persona dall'ArrayList
	 * 
	 * @param personaDaRimuovere
	 * @return
	 */
	public Persona removePersona(Persona personaDaRimuovere) {
		if (personaDaRimuovere == null)
			return null;

		Persona personaTmp;

		for (Persona persona : personeABordo)
			if (persona == personaDaRimuovere) {
				personaTmp = persona;
				personeABordo.remove(persona);
				return personaTmp;
			}
		return null;
	}

	public void removeAllLastCapitano() {
		for (int i = 0; i < personeABordo.size(); i++) {
			if (personeABordo.get(i) instanceof Capitano && personeABordo.size() == 1) {
				System.out.println("Rimosso: " + personeABordo.get(i));
				personeABordo.remove(personeABordo.get(i));
			} else {
				System.out.println("Rimosso: " + personeABordo.get(i));
				personeABordo.remove(personeABordo.get(i));
			}
		}
	}

}
