import java.util.Scanner;

/*
 * Prendere in ingresso una parola e un char
 * il programma stampa a video se esiste il carattere all'interno della parola
 */
public class RicercaDiUnaLettera {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci una parola");
		String parolaInserita = scanner.next();

		System.out.println("Inserisci una lettera");
		char letteraInserita = scanner.next().charAt(0);

		scanner.close();

		boolean esiste = false;

//		int contatoreCicli = 0;

		int i = 0;

		while (i < parolaInserita.length()) {
//			contatoreCicli++;
			if (parolaInserita.charAt(i) == letteraInserita) {
				esiste = true;
				break;
			}
			i++;
		}
		if (esiste)
			System.out.println("La lettera è presente");
		else
			System.out.println("La lettera non è presente");

//		System.out.println("Numero Cicli: " + contatoreCicli);

	}

}
