import java.util.Scanner;

public class Esercizio4b {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lato;

		do {
			System.out.println("inser");
			lato = scanner.nextInt();
		} while (lato < 0);

		scanner.close();

		for (int i = 0; i < lato; i++) {
			for (int j = 0; j < lato; j++) {
				if (i == j)
					System.out.print("- ");
				else if (i < j)
					System.out.print("T ");
				else
					System.out.print("O ");

			}
			System.out.println();
		}
	}
}
