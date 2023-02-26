import java.util.Scanner;

// Esercizio 2.3: Scrivere un programma PositivoNegativo che chiede all’utente di inserire una sequenza
// di interi terminata quando l’utente immette il valore 0 e poi stampa "OK" se la sequenza contiene un
// valore positivo seguito da uno negativo, altrimenti stampa il messaggio "NO". A vostra scelta, la stampa
// del messaggio "OK" può interrompere o meno l’inserimento dei valori. Risolvere questo esercizio senza
// usare array.
public class EsercizioGruppo3 {

	public static void main(String[] args) {
		Scanner scanenr = new Scanner(System.in);

		System.out.print("Inserisci i valori: ");
		int numeroCorrente = scanenr.nextInt();

		int numeroPrecedente = numeroCorrente;
		boolean numeriOK = false;

		while (numeroCorrente != 0) {
			if (numeroPrecedente > 0 && numeroCorrente < 0) {
				numeriOK = true;
			}
			numeroPrecedente = numeroCorrente;

			System.out.print("Inserisci: ");
			numeroCorrente = scanenr.nextInt();
		}

		scanenr.close();

		if (numeriOK)
			System.out.println("OK");
		else
			System.out.println("NO");

	}

}
