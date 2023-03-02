/*
 * Esercizio 2:
 *  Dato un numero in input > 0 stampare '*' in modo da creare un triangolo
 *
 *  es n=3 ==> 
 *  *
 *  **
 *  ***
 */

import java.util.Scanner;
public class Esercizio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroUtente;

		do {
			System.out.println("Inserisci un intero");
			numeroUtente = scanner.nextInt();
		} while (numeroUtente < 0);

		scanner.close();

		for (int i = 0; i < numeroUtente; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
