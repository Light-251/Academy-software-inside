import java.util.Scanner;

// Esercizio 2.5: Scrivere un programma Ripetizioni che chiede all’utente di inserire una sequenza di
// caratteri (chiedendo prima quanti caratteri voglia inserire) e li ristampa man mano che vengono inseriti.
// L’intero procedimento (chiedere quanti caratteri voglia inserire, leggere i caratteri e man mano stamparli)
// dovrà essere ripetuto 5 volte. Risolvere questo esercizio senza usare array.
public class EsercizioGruppo5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char carattereCorrente;

		int i = 0, numeroCaratteri;
		while (i < 5) {
			System.out.println(i + 1 + "/5. Quanti caratteri vuoi inserire?");
			numeroCaratteri = scanner.nextInt();

			while (numeroCaratteri > 0) {
				System.out.print("Inserisci: ");
				carattereCorrente = scanner.next().charAt(0);
				System.out.println("Hai inserito: " + carattereCorrente);

				numeroCaratteri--;
			}
			i++;
		}
		scanner.close();
		System.out.println("Fine Programma");
	}

}
