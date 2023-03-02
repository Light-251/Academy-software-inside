/*
 * svolgere prima l'esercizio usando un vettore di grandezza 8
 * 
 * data una matrice 2*2 
 * usare la classe Random per riempire in modo casuale gli elementi della matrice
 * con valori compresi tra 1 e 10 inclusi
 * e stampare la matrice
 */
package it.softwareinside.matrix;

import java.util.Random;

public class MatrixExample {
	public static void main(String[] args) {
		Random random = new Random();

		int[] vett = new int[8];

		// RIEMPIMENTO VETTORE
		for (int i = 0; i < vett.length; i++) {
			vett[i] = random.nextInt(1, 11);
		}
		System.out.println("Stampa Vettore");
		// STAMPA VETTORE
		for (int i = 0; i < vett.length; i++) {
			System.out.print(vett[i] + " ");
		}

		int[][] matrix = new int[2][2];
		// RIEMPIMENTO MATRICE
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = random.nextInt(1, 11);
		}

		System.out.println("\n------------------\n");
		System.out.println("Stampa Matrice");

		// STAMPA MATRICE
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				System.out.print(matrix[i][j] + " ");

			System.out.println();
		}

	}
}
