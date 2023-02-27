/*
 * Prendere una sequenza di caratteri e verificare al termine della sequenza
 * se una vocale è seguita da una lettera
 * La sequenza termina quando viene inserito un valore speciale chiamato 'q'
 */
package it.softwareinside.eserciziPomeriggio;

import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int cont = 0;
		char carattereCorrente;
		boolean sequenzaOK = true;

		System.out.print("Inserisci la prima lettera: ");
		carattereCorrente = scanner.next().charAt(0);

		while (carattereCorrente != 'q') {

			if (cont % 2 == 0) {
				if (carattereCorrente != 'a' && carattereCorrente != 'e' && carattereCorrente != 'i'
						&& carattereCorrente != 'o' && carattereCorrente != 'u') {
					System.err.println("La sequenza non va bene (riga 27)");
					sequenzaOK = false;
				}
			} else /*if (cont % 2 == 1)*/ {
				if (carattereCorrente == 'a' || carattereCorrente == 'e' || carattereCorrente == 'i'
						|| carattereCorrente == 'o' || carattereCorrente == 'u') {
					System.err.println("La sequenza non va bene (riga 33)");
					sequenzaOK = false;
				}
			}
			System.out.print("Inserisci: ");
			carattereCorrente = scanner.next().charAt(0);

			cont++;

		}
		scanner.close();

		System.out.println("\n#############################\n\n");

		if (sequenzaOK)
			System.out.println("OK");
		else
			System.err.println("NO");

	}

}
