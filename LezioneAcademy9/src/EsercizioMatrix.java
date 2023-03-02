import java.util.Random;
import java.util.Scanner;

/*
 * prendere in input 2 interi 
 * verificando che tutti e 2 gli interi siano maggiori di 0
 * altrimenti richiedere tutti e due i numeri
 * 
 * il programma crea un a matrice di strinche di 2 righe e 3 colonne
 * 
 * riempire la matrice in modo randomico
 * scegliendo 3 differenti emoji
 */
public class EsercizioMatrix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int numeroRighe;
		int numeroColonne;

		do {
			System.out.println("Numero righe: ");
			numeroRighe = scanner.nextInt();
			System.out.println("Numero colonne: ");
			numeroColonne = scanner.nextInt();
		} while (numeroRighe <= 0 || numeroColonne <= 0);

		scanner.close();

		String[][] matrix = new String[numeroRighe][numeroColonne];
		String piuma = "🪶"; // 0
		String zucca = "🎃"; // 1
		String smile = "😎"; // 2
		int emoji;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				emoji = random.nextInt(3);
				if (emoji == 0)
					matrix[i][j] = piuma;
				else if (emoji == 1)
					matrix[i][j] = zucca;
				else
					matrix[i][j] = smile;

				System.out.print(matrix[i][j] + " ");

			}
			System.out.println();
		}
	}
}
