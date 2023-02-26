

import java.util.Scanner;

/*
 * Esercizio 2.1: Scrivere un programma TuttiPositiviPari che chiede all’utente di inserire una se-
 * quenza di interi (chiedendo prima quanti numeri voglia inserire) e poi, al termine dell’inserimento
 * dell’intera sequenza, stampa "Tutti positivi e pari" se i numeri inseriti sono tutti positivi e pari,
 * altrimenti stampa "NO". Risolvere questo esercizio senza usare array.
 */

public class EsercizioGruppo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Quanti numeri vuoi inserire?");
		int contNumeri = scanner.nextInt();

		System.out.print("Inserisci il primo numero:");
		int numeroCorrente = scanner.nextInt();
		
		contNumeri--;

//		boolean tuttiPositivi = true;
		boolean numeriOK = true;

		while (contNumeri > 0) {
			if (numeroCorrente < 0 || numeroCorrente % 2 != 0) {
				numeriOK = false;
			}
			System.out.print("Continua: ");
			numeroCorrente = scanner.nextInt();
			
			contNumeri--;

		}
		scanner.close();
		if(numeriOK)
			System.out.println("OK");
		else {
			System.out.println("NO");
		}

	}

}
