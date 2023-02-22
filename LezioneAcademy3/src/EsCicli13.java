import java.util.Scanner;

/*
 * inserire una stringa con scanner, il prog restituisce il numero di lettere 'a' nella stringa
 */
public class EsCicli13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci una stringa");
		String parola = scanner.nextLine();

		scanner.close();

		int i = 0, cont = 0;

		// System.out.println("lunghezza stringa: " + parola.length());

		while (i < parola.length()) {
			if (parola.charAt(i) == 'a')
				cont++;
			i++;
		}
		System.out.println("Nella frase '" + parola + "' ci sono " + cont + " 'a'.");

	}

}
