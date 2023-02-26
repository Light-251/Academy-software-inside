/*
 * 
 * 
 * Creare un programma che chieda e stampa a video una sequenza di numeri 
 * fino a che l'utente non inserisce il valore 0
 * 
 */
package it.softwareinside.cicloIndefinito;

import java.util.Scanner;

public class ContinuaFino {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Inserisci un numero: ");
		int numeroUtente = scanner.nextInt();

		while (numeroUtente != 0) {
			System.out.println(numeroUtente);
			System.out.print("Inserisci: ");
			numeroUtente = scanner.nextInt();
		}
		scanner.close();

		System.out.println("Fine");
	}

}
