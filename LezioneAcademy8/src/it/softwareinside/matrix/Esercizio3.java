/*
 * Prendere in input un numero e dire se è presente nella matrice
 * se possibile ottimizzare il codice
 */
package it.softwareinside.matrix;

import java.util.Scanner;

public class Esercizio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[][] matrix = { { 5, 7, 2 }, { 1, 3, 2 }, { 55, 66, 99 } };
		System.out.println("Inserisci numero");
		int numeroInserito = scanner.nextInt();

		scanner.close();

		boolean isFound = false;

		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				if (numeroInserito == matrix[i][j]) {
					isFound = true;
					break;
				}

			}
			if (isFound)
				break;
		}

		if (isFound)
			System.out.println("Il numero è presente");
		else
			System.out.println("Il numero non è presente");
	}
}
