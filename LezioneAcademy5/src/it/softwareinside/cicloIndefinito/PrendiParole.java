/*
 * Scrivere un programma che prende in ingresso un certo numero di stringhe
 * e il programma termina quando si scrive la parola exit
 */
package it.softwareinside.cicloIndefinito;

import java.util.Scanner;

public class PrendiParole {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci parole ");
		String parolaCorrente = scanner.next();
		
		while(!parolaCorrente.equalsIgnoreCase("exit")) {
			System.out.println("Inserisci un'altra parola");
			parolaCorrente = scanner.next();
		}
		scanner.close();
		
		System.out.println("Programma terminato");
		
	}

}
