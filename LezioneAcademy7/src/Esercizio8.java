/*
 * Dato un array di N interi scrivere un algoritmo (o programma Java) per trovare l’elemento di valore
 * massimo e l’indice (nell’intervallo da 0 a N-1) della sua posizione.
 */
public class Esercizio8 {

	public static void main(String[] args) {
		int[] vett = new int[] { 2, 3, 4, 5, 6, 7, 345, 8, 12, 23, 34 };
		int maxVal = vett[0], i = 1, indiceMax = 0;

		while (i < vett.length) {
			if (maxVal < vett[i]) {
				maxVal = vett[i];
				indiceMax = i;
			}
			i++;
		}

		System.out.println("il valore più grande è " + maxVal + " alla posizione " + indiceMax);
	}

}
