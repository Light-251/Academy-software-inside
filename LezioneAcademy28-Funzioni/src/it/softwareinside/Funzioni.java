package it.softwareinside;

public class Funzioni {
	/**
	 * 1- Creare una funzione che prende in ingresso una stringa e ritorna true se
	 * il primo carattere è uguale all'ultimo.
	 * 
	 */
	public boolean lastEqualsFirst(String parola) {
		if (parola.charAt(0) == parola.charAt(parola.length() - 1))
			return true;

		return false;
	}

	/**
	 * 2- creare una funzione che prende in ingresso una stringa e un numero e
	 * ritorna la stringa moltiplicata per il numero nel seguente modo:
	 * 
	 * input("ciao" , 3 ) =======> ciao ciao ciao
	 */
	public String moltiplicaStringa(String parola, int molt) {
		String ris = "";
		for (int i = 0; i < molt; i++)
			ris += parola + " ";

		return ris;
	}

	/**
	 * 3- creare una funzione che prenda in ingresso un vettore e un numero intero
	 * -ritorna un vettore aggiundendo o sottraendo elemento per elemento.
	 * 
	 * ( [ 10 , 2 , 5, 4 ] , 3 ) ========> [7 , 5 , 8 , 7]
	 */
	public int[] sottraiAggiungi(int[] vett, int valore) {
		for (int i = 0; i < vett.length; i++) {
			if (i % 2 == 0)
				vett[i] -= valore;
			else {
				vett[i] += valore;
			}

		}
		return vett;
	}

	/**
	 * 4- dato in ingresso un numero ritornare un numero che svolga il calcolo della
	 * formula di stirling
	 * 
	 * https://it.wikipedia.org/wiki/Approssimazione_di_Stirling Guardare la formula
	 * con scritto n! ( questa formula serve per calcolare il fattore il modo
	 * approssimato)
	 * 
	 * @return
	 */
	public double approssimazioneDiStirling(int n) {
		// parte a destra
		double parteDestra = Math.pow((n / Math.E), n);
		// parte a sinistra
		double parteSinistra = Math.sqrt(2 * Math.PI * n);

		return parteSinistra * parteDestra;

	}

	/**
	 * 5- Creare una funzione che prenda in ingresso una stringa e ritorna true se
	 * la stringa contiene 3 lettere uguali, in qualsiasi posizione.
	 */
	public boolean equalLetters(String parola) {
		int cont = 0;
		for (int i = 0; i < parola.length(); i++) {
			for (int j = 0; j < parola.length(); j++) {
				if (i == j)
					continue;
				if (parola.charAt(i) == parola.charAt(j))
					cont++;
				if(cont == 3)
					return true;
			}
			cont = 0;
		}
		return false;
	}

}
