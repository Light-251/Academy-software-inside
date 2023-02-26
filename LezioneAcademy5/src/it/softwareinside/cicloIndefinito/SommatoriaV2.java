/*
 * Creare una sequenza di numeri che termina con il valore 0
 * il programma farà la somma dei soli elementi che sono pari
 */
package it.softwareinside.cicloIndefinito;

import java.util.Scanner;

public class SommatoriaV2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci i numeri");
		int numeroCorrente = scanner.nextInt();

		int somma = 0;

		while (numeroCorrente != 0) {
			if (numeroCorrente % 2 == 0)
				somma += numeroCorrente;
			System.out.println("somma parziale: " + somma);
			System.out.print("Inserisci: ");
			numeroCorrente = scanner.nextInt();
		}
		scanner.close();

		System.out.println("Somma totale: " + somma);
	}

}
