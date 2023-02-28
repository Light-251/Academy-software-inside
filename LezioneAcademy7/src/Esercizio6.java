import java.util.Scanner;

/*
 * Dato un array di N interi scrivere un algoritmo (o programma Java) per contare quante volte
compare un determinato valore k
 */
public class Esercizio6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] vett = new int[] { 2, 3, 4, 5, 6, 7, 8, 12, 23, 34, 3, 3, 3, 3, 3 };
		System.out.println("Inserisci un numero");
		int numeroInserito = scanner.nextInt();

		scanner.close();

		int i = 0, contatoreRicorrenze = 0;
		while (i < vett.length) {
			if (numeroInserito == vett[i])
				contatoreRicorrenze++;

			i++;
		}

		System.out.println("Il numero " + numeroInserito + " è presente " + contatoreRicorrenze + " volte.");
	}

}
