/*
 * Dato un array di N interi scrivere un algoritmo (o programma Java) per contare gli elementi dispari.
 */
public class Esercizio5 {

	public static void main(String[] args) {
		int[] vett = new int[] { 2, 3, 4, 5, 6, 7, 8, 12, 23, 34 };
		int contatoreNumeriDispari = 0, i = 0;

		while (i < vett.length) {
			if (vett[i] % 2 != 0) {
				contatoreNumeriDispari++;
			}

			i++;
		}
		if (contatoreNumeriDispari > 0)
			System.out.println("I numeri dispari sono: " + contatoreNumeriDispari);
		else
			System.out.println("Non ci sono numeri dispari");

	}

}
