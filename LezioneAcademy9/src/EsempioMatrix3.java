import java.util.Random;
import java.util.Scanner;

/*
 * dati in input 2 numeri row e col
 * costruire una matrice 
 * 
 * verificando che siano maggiori di 0
 * 
 * creare una matrice di valori bool  
 * che rappresenta i posti liberi/occupati di un cinema
 * con classe random riempire tutta la matrice con valori casuali
 * 
 * chiedere all'utente di inserire una posizione 
 * per la posizione serviranno 2 numeri
 * 
 * se il posto è libero modificare il posto andando a modificare il valore
 * che passa da libero a occupato
 * se il posto è occupato il programma richiede 2 nuove coordinate
 * 
 */
public class EsempioMatrix3 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int row, col;
		do {
			System.out.println("Inserisci righe");
			row = scanner.nextInt();
			System.out.println("Inserisci colonne");
			col = scanner.nextInt();

			if (row <= 0 || col <= 0)
				System.out.println("Inserisci due valori maggiori di 0");
		} while (row <= 0 || col <= 0);
		boolean[][] matrix = new boolean[row][col];

		// RIEMPIMENTO MATRICE
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextBoolean();
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();

		}
		// SCELTA POSTO
		int rowPostoScelto, colPostoScelto;

		boolean postoLibero;
		do {
			do {
				System.out.println("Inserisci coordinate posto (riga-colonna)");
				rowPostoScelto = scanner.nextInt();
				colPostoScelto = scanner.nextInt();

//				if (rowPostoScelto <= 0 || colPostoScelto <= 0)
//					System.out.println("Inserisci due valori maggiori di 0");

			} while (rowPostoScelto >= row || colPostoScelto >= col);

			if (matrix[rowPostoScelto][colPostoScelto] == false) {
				System.out.println("Il posto è occupato, riprova");
				postoLibero = false;
			} else {
				System.out.println("Il posto è libero");
				postoLibero = true;
				matrix[rowPostoScelto][colPostoScelto] = false;
				System.out.println("Il posto è ora occupato");
			}

		} while (!postoLibero);

		// STAMPA NUOVA MATRICE
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();

		}

		scanner.close();
	}
}
