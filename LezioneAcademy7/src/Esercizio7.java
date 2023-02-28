/*
 * Dato un array di N interi scrivere un algoritmo (o programma Java) per stampare i valori degli
 *  elementi in posizione pari.
*/
public class Esercizio7 {

	public static void main(String[] args) {
		int[] vett = new int[] { 2, 3, 4, 5, 6, 7, 8, 12, 23, 34 };
		int i = 0;
		while (i < vett.length) {
			System.out.print(vett[i] + " ");

			i += 2;
		}
	}

}
