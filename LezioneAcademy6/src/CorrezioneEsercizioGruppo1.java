import java.util.Scanner;

/*
 * Esercizio 2.1: Scrivere un programma TuttiPositiviPari che chiede all’utente di inserire una se-
 * quenza di interi (chiedendo prima quanti numeri voglia inserire) e poi, al termine dell’inserimento
 * dell’intera sequenza, stampa "Tutti positivi e pari" se i numeri inseriti sono tutti positivi e pari,
 * altrimenti stampa "NO". Risolvere questo esercizio senza usare array.
 */
public class CorrezioneEsercizioGruppo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroDiElementi;

		do {
			System.out.println("Inserisci n > 0");
			numeroDiElementi = scanner.nextInt();
		} while (numeroDiElementi < 0);

		System.out.println("Ok creo un ciclo di " + numeroDiElementi);

		boolean isAllNumbersEven = true;
		int i = 0;
		int elementoCorrente;

		do {

			System.out.println("Inserisci");
			elementoCorrente = scanner.nextInt();

			if (elementoCorrente < 0 || elementoCorrente % 2 != 0)
				isAllNumbersEven = false;

			i++;

		} while (i < elementoCorrente);

		if (isAllNumbersEven)
			System.out.println("OK");
		else
			System.out.println("NO");

		scanner.close();
	}

}
