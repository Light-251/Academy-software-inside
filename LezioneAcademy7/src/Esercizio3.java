/*
 * Dato un array di N interi scrivere un algoritmo (o programma Java) per sommare tutti gli elementi
 * che sono contemporaneamente multipli di 2 e di 3.
 */
public class Esercizio3 {

	public static void main(String[] args) {
		int[] vett = new int[] { 2, 3, 4, 5, 6, 7, 8, 12, 23, 34 };
		int i = 0, somma = 0;

		while (i < vett.length) {
			if (vett[i] % 2 == 0 && vett[i] % 3 == 0) { //oppure (vett[i] % 6 == 0)
				System.out.println("sommo: " + somma + " + " + vett[i] + " = " + (somma + vett[i]));
				somma += vett[i];
			}

			i++;
		}
		System.out.println("Somma totale: " + somma);
	}

}
