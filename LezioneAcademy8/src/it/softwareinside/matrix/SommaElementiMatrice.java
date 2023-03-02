/*
 * Fare la somma degli elementi pari della matrice
 */
package it.softwareinside.matrix;

public class SommaElementiMatrice {
	public static void main(String[] args) {
		int[][] matrix = { { 8, 3 }, { 5, 2 } };
		int somma = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				if (matrix[i][j] % 2 == 0)
					somma += matrix[i][j];
		}

		System.out.println("La somma vale: " + somma);

	}
}
