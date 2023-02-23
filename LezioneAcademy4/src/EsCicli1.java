import java.util.Scanner;

/*
 * Prendere in ingresso una stringa e stampare a video 
 * solamente le posizioni pari della stringa
 */
public class EsCicli1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci una parola");
		String parola = scanner.next();

		scanner.close();

		int i = 0;

		while (i < parola.length()) {
			if (i % 2 == 0)
				System.out.print(parola.charAt(i));

			i++;
		}

	}

}
