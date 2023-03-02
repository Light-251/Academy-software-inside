/*
 *  Data una matrice fare il prodotto della diagonale principale
 *  e il prodotto della diagonale inferiore
 */
package it.softwareinside.matrix;

public class Esercizio4 {
	public static void main(String[] args) {
		int[][] matrix = { { 5, 2, 1 }, { 1, 3, 3 }, { 5, 4, 2 } };
		int prodDiagPrincipale = 1, prodDiagInferiore = 1;

		// DIAGONALE PRINCIPALE
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j)
					prodDiagPrincipale *= matrix[i][j];
			}
		}

		// DIAGONALE INFERIORE
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = matrix.length - 1; j >= 0; j--) {
//				System.out.println("Considero " + matrix[i][j] + ", i= " + i + ", j= " + j);
//
//				if (i == j)
//					prodDiagInferiore *= matrix[i][j];
//
//			}
//		}
		
		int contScala =1;
		// CORREZIONE DIAGONALE INFERIORE
		for (int i = 0; i < matrix.length; i++) {
			for (int j = matrix.length - 1; j >= 0; j--) {
				
				if(j == matrix[i].length - contScala) {
//					System.out.println("ok ----------> " + matrix[i][j]);
					prodDiagInferiore *= matrix[i][j];
				}
					
			}
			contScala++;

		}

		System.out.println("Principale: " + prodDiagPrincipale);
		System.out.println("Inferiore: " + prodDiagInferiore);
	}
}
