/*
 * Creare un programme che prenda in ingresso un insieme di char
 * il programma termina quando si scrive il char 'q' 
 * e restituisce un parola che è la concatenazione dei singoli caratteri
 */
package it.softwareinside.cicloIndefinito;

import java.util.Scanner;

public class ScriviCarattere {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Inserisci i caratteri");
		char carattereCorrente = scanner.next().charAt(0);

		String parolaCompleta = "";

		while (carattereCorrente != 'q') {
			parolaCompleta += carattereCorrente;
			System.out.print("Inserisci ancora: ");
			carattereCorrente = scanner.next().charAt(0);
		}

		scanner.close();

		System.out.print("Parola completa: " + parolaCompleta);
	}

}
