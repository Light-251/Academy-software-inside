/*
 * fino a che l'utente inserisce una vocale il programma prosegue
 * altrimenti termina
 */
package it.softwareinside.cicloIndefinito;

import java.util.Scanner;

public class ChiediVocale {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Inserisci lettera: ");
		char carattereCorrente = scanner.next().charAt(0);

		while (carattereCorrente == 'a' || carattereCorrente == 'e' || carattereCorrente == 'i'
				|| carattereCorrente == 'o' || carattereCorrente == 'u') {

			System.out.print("Inserisci ancora: ");
			carattereCorrente = scanner.next().charAt(0);
		}
		scanner.close();

		System.out.println("Programma terminato");
	}

}
