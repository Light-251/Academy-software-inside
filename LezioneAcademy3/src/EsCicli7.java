import java.util.Scanner;

/*
 * Prendere da tastiera un unmero intero e calcolare il fattoriale
 */
public class EsCicli7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci il numero");
		int numero = scanner.nextInt();

		scanner.close();

		int i = 1, prodotto = 1;

		while (i <= numero) {
			prodotto *= i;

			i++;
		}

		System.out.println("Il fattoriale di " + numero + " è: " + prodotto);
	}

}
