package it.softwareinside.object;

public class EserciziFunzione {

	/*
	 * Creare una funzione che prenda in input due numeri e ritorna la somma di due
	 * numeri
	 * 
	 */

	public int somma(int numero1, int numero2) {

		return numero1 + numero2;
	}

	/*
	 * creare una funzione che prende in input un numero e ritorna il doppio del
	 * numero
	 */

	public int doppioInt(int numero) {
		return numero * 2;
	}

	/*
	 * costruire una funzione che prenda in ingresso un numero ritorna true se il
	 * numero è pari, altrimenti false
	 * 
	 */
	public boolean isEven(int numero) {

		if (numero % 2 == 0)
			return true;
		else
			return false;
	}

	public boolean isEven2(int numero) {
		return numero % 2 == 0;
	}

	/*
	 * creare una funzione che prende in ingresso una stringa e ritorni il numero di
	 * lettere 'a' che contiene la stringa
	 * 
	 * ES: ala ===> 2
	 * 
	 */
	/**
	 * La funzione prende in input una Stringa e ritorna un intero con il numero di
	 * lettere 'a' presenti nella Stringa
	 * 
	 * @param parola
	 * @return
	 */
	public int numeroLettereA(String parola) {
		int contatoreLettere = 0;
		for (int i = 0; i < parola.length(); i++)
			if (parola.charAt(i) == 'a')
				contatoreLettere++;

		return contatoreLettere;
	}

	/*
	 * creare una funzione che prende in ingresso un vettore di interi e restituisce
	 * il vettore di interi dove ogni elemento è moltiplicato per 2
	 */
	
	/**
	 * Prende in ingresso un vettore di interi e raddoppia tutti i valori del
	 * vettore
	 * 
	 * @param vettore
	 * @return
	 */
	public int[] raddoppiaVettore(int[] vettore) {

		int[] vettRis = new int[vettore.length];
		for (int i = 0; i < vettore.length; i++)
			vettRis[i] = vettore[i] * 2;

		return vettRis;
	}

	public void stampaVettore(int[] vettore) {
		for (int i = 0; i < vettore.length; i++) {
			System.out.print(vettore[i] + " ");
		}
	}
}
