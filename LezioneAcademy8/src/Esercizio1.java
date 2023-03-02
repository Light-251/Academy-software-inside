
/*
 * Inserire da tastiera un numero 0
 * 
 * Stampare il carattere '*' in base al numero inserito
 */
import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroInserito;
		int contErrori = 0;
		do {
			System.out.println("Inserisci un numero maggiore di 0");
			numeroInserito = scanner.nextInt();

			if (contErrori >= 3) {
				System.out.println("");
				System.exit(0);
			}
			contErrori++;

		} while (numeroInserito <= 0);

		scanner.close();

		for (int i = 0; i < numeroInserito; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
