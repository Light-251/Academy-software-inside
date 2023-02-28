/*
 * Dato un array di N interi scrivere un algoritmo (o programma Java) per trovare la media dei suoi
 * valori e contare i valori sopra la media.
*/
public class Esercizio10 {

	public static void main(String[] args) {

		int[] vett = new int[] { 2, 3, 4, 5, 6, 7, 8, 12, 23, 34 };
		int i = 0, numeroElementi = vett.length, contatoreVal = 0, somma = 0;

		while (i < vett.length) {
			somma += vett[i];

			i++;
		}
		double media = somma / numeroElementi;

		i = 0;
		while (i < vett.length) {
			if (vett[i] > media)
				contatoreVal++;

			i++;
		}

		System.out.println("La media vale: " + media + ", i valori che superano la media sono: " + contatoreVal);
	}
}
