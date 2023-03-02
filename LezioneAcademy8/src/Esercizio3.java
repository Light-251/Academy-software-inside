import java.util.Scanner;

public class Esercizio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroLato;

		do {
			System.out.println("Inserisci un intero");
			numeroLato = scanner.nextInt();
		} while (numeroLato < 0);

		scanner.close();

		for (int i = 0; i < numeroLato; i++) {
			for (int j = 0; j < numeroLato; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	
}
