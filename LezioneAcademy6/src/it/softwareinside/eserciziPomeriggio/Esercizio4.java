/*
 * Prendere in input una stringa e un carattere
 * dire se il caratere è presente nella stringa
 * Cercare di ottimizzare il codice
 */
package it.softwareinside.eserciziPomeriggio;

import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci una stringa");
		String parolaInserita = scanner.next();

		System.out.println("inserisci un carattere");
		char carattereInserito = scanner.next().charAt(0);

		scanner.close();

		boolean esiste = false;
		int i = 0;
		while (i < parolaInserita.length()) {
			if (carattereInserito == parolaInserita.charAt(i)) {
				esiste = true;
				break;
			}

			i++;
		}

		if (esiste)
			System.out.println("Il carattere è presente");
		else
			System.out.println("Il carattere NON è presente");
	}

}
