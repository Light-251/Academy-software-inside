import java.util.Scanner;

/*
 * Inserire da tastiera una stringa e stampare a video 'si' se sono presenti almeno 2 vocali
 */
public class DueVocali {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci una parola");
		String parolaInserita = scanner.next().toLowerCase();

		scanner.close();

		int i = 0, contatoreVocali = 0, contatoreCicli = 0;

		while (i < parolaInserita.length()) {
			contatoreCicli++;
			char letteraCorrente = parolaInserita.charAt(i);

			if (letteraCorrente == 'a' || letteraCorrente == 'e' || letteraCorrente == 'i' || letteraCorrente == 'o'
					|| letteraCorrente == 'u') {
				contatoreVocali++;

			}
			if (contatoreVocali >= 2)
				break;

			i++;
		}

		if (contatoreVocali >= 2)
			System.out.println("si");
		else {
			System.out.println("no");
		}
		System.out.println("Numero Cicli: " + contatoreCicli);

	}

}
