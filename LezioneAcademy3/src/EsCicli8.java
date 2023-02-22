import java.util.Scanner;

/*
 * Prendere 2 numeri int da tastiera che sono la base e l'esponente e calcolare la potenza
 */
public class EsCicli8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci la base e l'esponente");
		int base = scanner.nextInt();
		int esponente = scanner.nextInt();
		int risultato = 1;

		scanner.close();

		while (esponente >= 1) {
			risultato *= base;

			esponente--;
		}

		System.out.println("Risultato: " + risultato);

	}

}
