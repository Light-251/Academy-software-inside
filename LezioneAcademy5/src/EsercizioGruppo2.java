import java.util.Scanner;

/*
 * Esercizio 2.2: Scrivere un programma ContinuaFino che chiede all’utente di inserire una sequenza di
 *interi. Il programma continua a chiedere all’utente di inserire valori fintanto che i valori inseriti soddisfano
 *almeno una delle seguenti condizioni:
 • è negativo e divisibile per 2
 • è positivo e divisibile per 3
  Al termine il programma stampa la somma di tutti i valori inseriti escluso quello ha violato le condizioni.
  Risolvere questo esercizio senza usare array.
 */

public class EsercizioGruppo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci valori:");
		int valoreCorrente = scanner.nextInt();

		int somma = 0;

		while (valoreCorrente < 0 && valoreCorrente % 2 == 0 || valoreCorrente > 0 && valoreCorrente % 3 == 0) {
			somma += valoreCorrente;
			System.out.print("Continua: ");
			valoreCorrente = scanner.nextInt();
		}
		
		scanner.close();
		
		System.out.println("Somma: " + somma);
	}

}
