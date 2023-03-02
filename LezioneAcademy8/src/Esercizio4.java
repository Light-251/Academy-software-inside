import java.util.Scanner;

/*
 * 
 */
public class Esercizio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lato;
		do {
			System.out.println("Inserisci un intero");
			lato = scanner.nextInt();
		} while (lato < 0);
		scanner.close();

		for (int i = 0; i < lato; i++) {
			for (int j = 0; j < lato; j++) {
				if (i == j)
					System.out.print("😎");
				else
					System.out.print("* ");

			}
			System.out.println();
		}
	}
}
