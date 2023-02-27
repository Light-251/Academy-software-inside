package it.softwareinside.eserciziPomeriggio;
/*
 * Data una sequenza che termina con il valore 0 
 * dire se ho un numero multiplo di 3 seguito 
 * da un numero multiplo di 5 
 * 
 * ES 3 5 20 12 --> "OK"
 * ES 3 4 20 --> "NO
 */

import java.util.Scanner;

public class Esercizio6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeroCorrente, cont = 0;
		boolean sequenzaOK = true;
		
		do {
			System.out.print("Inserisci: ");
			numeroCorrente = scanner.nextInt();

			if (cont % 2 == 0) {
				if (numeroCorrente % 3 != 0)
					sequenzaOK = false;

			} else if (numeroCorrente % 5 != 0)
				sequenzaOK = false;

			cont++;
		} while (numeroCorrente != 0);

		scanner.close();

		if (sequenzaOK)
			System.out.println("OK");
		else
			System.out.println("NO");

	}

}
