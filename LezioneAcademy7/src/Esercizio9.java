/*
 * Dato un array di N interi scrivere un algoritmo (o programma Java) per trovare l’elemento di valore
 * minimo e l’indice (nell’intervallo da 0 a N-1) della sua posizione.
 */
public class Esercizio9 {

	public static void main(String[] args) {
		int[] vett = new int[] { 2, 3, 4, 5, 6, 7, -50, 8, 12, 23, 34 };
		int minVal = vett[0], i = 0, indiceMin = 0;

		while (i < vett.length) {
			if (minVal > vett[i]) {
				minVal = vett[i];
				indiceMin = i;
			}
			i++;
		}

		System.out.println("il valore più piccolo è " + minVal + " alla posizione " + indiceMin);
	}

}
