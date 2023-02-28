/*
 * Dato un array di N interi scrivere un algoritmo (o programma Java) per contare gli elementi pari.
 */
public class Esercizio4 {

	public static void main(String[] args) {
		int[] vett = new int[] { 2, 3, 4, 5, 6, 7, 8, 12, 23, 34 };
		int contatoreNumeriPari = 0, i = 0;

		while (i < vett.length) {
			if (vett[i] % 2 == 0) {
				contatoreNumeriPari++;
			}

			i++;
		}

		System.out.println("I numeri pari sono: " + contatoreNumeriPari);
	}

}
