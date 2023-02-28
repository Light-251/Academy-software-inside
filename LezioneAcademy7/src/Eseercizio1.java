/*
 * Dato un array di N interi scrivere un algoritmo (o programma Java) per sommare tutti gli elementi
 * che sono multipli di 3.
 */
public class Eseercizio1 {

	public static void main(String[] args) {
		int[] vett = new int[] { 2, 3, 4, 5, 6, 7, 8, 12, 23, 34 };
		int somma = 0, i = 0;

		while (i < vett.length) {
			if (vett[i] % 3 == 0) {
				System.out.println("sommo " + somma + " + " + vett[i]);
				somma += vett[i];
			}

			i++;
		}
		System.out.println("La somma vale " + somma);
	}

}
