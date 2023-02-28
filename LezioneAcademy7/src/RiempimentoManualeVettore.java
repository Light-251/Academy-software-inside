import java.util.Scanner;

/*
 * Dato un numero in input che rappresenta la grandezza del vettore,
 * il numero deve essere > 0 altimenti richiedere.
 * 
 * usare ul numero per creare un vettore di n elementi e con un ciclo riempire il vettore
 * usando sempre scanner stampare tutti gli elementi del vettore usando un ciclo
 * 
 */
public class RiempimentoManualeVettore {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dimensioneVettore;

		do {
			System.out.println("Inserisci la grandezza del vettore");
			dimensioneVettore = scanner.nextInt();

		} while (dimensioneVettore <= 0);

		System.out.println("Creo un vettore di " + dimensioneVettore + " elementi");

		int[] vettInteri = new int[dimensioneVettore];
		int i = 0;

		// RIEMPIMENTO VETTORE
		while (i < vettInteri.length) {
			System.out.print("Inserisci: ");
			vettInteri[i] = scanner.nextInt();

			i++;
		}

		scanner.close();
		i = 0;

		System.out.println("Stampo: ");
		// STAMPA VETTORE
		while (i < vettInteri.length) {
			System.out.print(vettInteri[i] + " ");

			i++;
		}

	}

}
