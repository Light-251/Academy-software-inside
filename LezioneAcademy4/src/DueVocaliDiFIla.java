import java.util.Scanner;

/*
 * Una stringa in input e dire se contiene due vocali di fila
 */
public class DueVocaliDiFIla {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci una parola");
		String parolaInserita = scanner.next().toLowerCase();

		scanner.close();

		boolean vocaliConsecutive = false;

		int i = 0;
		while (i < parolaInserita.length()) {
			char primaLettera = parolaInserita.charAt(i), secondaLettera;

			if (i >= parolaInserita.length() - 1)
				break;
			else
				secondaLettera = parolaInserita.charAt(i + 1);

			if (primaLettera == 'a' || 
				primaLettera == 'e' ||
				primaLettera == 'i' ||
				primaLettera == 'o' ||
				primaLettera == 'u')
				if (secondaLettera == 'a' || 
				    secondaLettera == 'e' || 
				    secondaLettera == 'i' || 
				    secondaLettera == 'o' ||
				    secondaLettera == 'u') {
					vocaliConsecutive = true;
					break;
				}

			i++;
		}

		if (vocaliConsecutive)
			System.out.println("ok");
		else
			System.out.println("no");

	}

}
