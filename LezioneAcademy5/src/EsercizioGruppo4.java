import java.util.Scanner;

// Esercizio 2.4: Scrivere un programma MediaMultipliDiTre che chiede all’utente di inserire una se-
// quenza di interi (chiedendo prima quanti numeri voglia inserire) e poi stampa la media di tutti i numeri
// inseriti che siano divisibili per tre. Per esempio, se si immettono i valori 5, 8, 9, 12, 7, 6 ,1 il
// risultato stampato dovrà essere 9. Risolvere questo esercizio senza usare array.
public class EsercizioGruppo4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Quanti numeri vuoi inserire?");
		int contNumeri = scanner.nextInt();

		int i = 0, numeroCorrente, somma = 0, contDivisione = 0;
		while (i < contNumeri) {
			System.out.print("Inserisci i numeri: ");
			numeroCorrente = scanner.nextInt();

			if (numeroCorrente % 3 == 0) {
				somma += numeroCorrente;
				contDivisione++;
			}

			i++;
		}

		scanner.close();

		double media = somma / contDivisione;

		System.out.println("La media è: " + media);
	}

}
