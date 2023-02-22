import java.util.Scanner;

/*
 * predere una stringa da tastiera e stamparla al contrario
 */
public class EsercizioReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("inserisci parola");
		String parola = scanner.nextLine();

		int i = parola.length() - 1;

		while (i >= 0) {
			System.out.print(parola.charAt(i));

			i--;
		}

		scanner.close();
	}

}
