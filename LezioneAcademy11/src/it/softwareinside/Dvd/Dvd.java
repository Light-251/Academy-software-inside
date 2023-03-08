package it.softwareinside.Dvd;

import java.text.DecimalFormat;
import java.util.Random;

public class Dvd {
	private String titolo, genere;
	private double costo;
	private boolean isFamilyFriendly;

	public Dvd() {
//		setTitolo("Senza Titolo");
//		setGenere(generaGenere());
//		setCosto(generaCosto());
//		isFamilyFriendly(generaIsFamilyFriendly());
		initDVD();
	}

	public Dvd(String titolo, String genere, double costo, boolean isFamilyFriendly) {
		setTitolo(titolo);
		setGenere(genere);
		setCosto(costo);
		isFamilyFriendly(isFamilyFriendly);
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		String familyOK = isFamilyFriendly ? "Adatto a tutti" : "Vietato ai minori";

		return "DVD [" + " Titolo: " + titolo 
				+ " Genere: " + genere 
				+ " Costo: " + df.format(costo) +"€" 
				+ " Family Friendly: " + familyOK + " ]";
	}

	private void initDVD() {

		Random random = new Random();

		// GENERE 
		String[] generi = { "Horror", "Thriller", "Commedia", "Fantasy" };
		
		String[] titoliFilm = {  "Horror1", "Horror2", "Horror3",
								 "Thriller1", "Thriller2", "Thriller3",
								 "Commedia1", "Commedia2", "Commedia3",
								 "Fantasy1", "Fantasy2", "Fantasy3"
								 };
		String genereCasuale = generi[random.nextInt(0, generi.length)];
		this.genere = genereCasuale;

		// COSTO 
		double costoRandom = random.nextDouble(2.99, 16);
		this.costo = costoRandom;

		
		// FAMILY FRIENDLY E TITOLO
		switch (genereCasuale) {
		case "Horror":
			this.isFamilyFriendly = false;
			this.titolo = titoliFilm[random.nextInt(0,3)];
			break;
		case "Thriller":
			this.isFamilyFriendly = false;
			this.titolo = titoliFilm[random.nextInt(3,6)];
			break;
		case "Commedia":
			this.isFamilyFriendly = true;
			this.titolo = titoliFilm[random.nextInt(6,9)];
			break;
		default:
			this.isFamilyFriendly = random.nextBoolean();
			this.titolo = titoliFilm[random.nextInt(9,12)];
			break;
		}
	}

	public String getTitolo() {
		return titolo;
	}

	public String getGenere() {
		return genere;
	}

	public double getCosto() {
		return costo;
	}

	public boolean isFamilyFriendly() {
		return isFamilyFriendly;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public void setGenere(String genere) {
		this.genere = genere;

	}

	public void setCosto(double costo) {
		this.costo = costo > 2.99 ? costo : 2.99;
	}

	public void isFamilyFriendly(boolean isFamilyFriendly) {
		this.isFamilyFriendly = isFamilyFriendly;
	}
	
	

	/**
	 * Sceglie un genere casuale tra un array di Stringhe
	 * 
	 * @return
	 */
	@SuppressWarnings("unused")
	private String generaGenere() {
		Random random = new Random();
		String[] arrayGeneri = { "Horror", "Thriller", "Commedia", "Fantasy" };
		String genereCasuale = arrayGeneri[random.nextInt(0, arrayGeneri.length)];

		return genereCasuale;
	}

	/**
	 * Genera un costo casuale
	 * 
	 * @return
	 */
	@SuppressWarnings("unused")
	private double generaCosto() {
		Random random = new Random();
		double costoRandom = random.nextDouble(2.99, 16);

		return costoRandom;
	}

	/**
	 * Sceglie casualmente se un DVD è family friendly
	 * 
	 * @return
	 */
	@SuppressWarnings("unused")
	private boolean generaIsFamilyFriendly() {
		Random random = new Random();
		boolean isFamilyFriendlyRandom = random.nextBoolean();

		return isFamilyFriendlyRandom;
	}
	
	
}
