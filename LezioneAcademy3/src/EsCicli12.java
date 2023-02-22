import java.util.Scanner;
/*
 * inserire un numero e calcolare la media da 1 al numero inserito
 */
public class EsCicli12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci numero");
		int numeroUtente = scanner.nextInt();

		scanner.close();

		double somma = 0;
		int i=0;
		
		while (i <= numeroUtente) {
			somma += i;
			System.out.println("Somma: " + somma + ", indice : " + i);
			i++;
		}
		System.out.println("La media è: " + (somma / numeroUtente));

	}

}
