import java.util.Scanner;

/*
 * Inserire un numero e stampare tutti i numeri tra uno e 100 che risultano multipli tra 1 e 100
 */
public class EsCicli11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci un numero");
		int numero = scanner.nextInt(), i = 1, cont = 0;

		scanner.close();

		while (i <= 100) {
			System.out.print(i + " ");

			i += numero;
			cont++;
		}
		System.out.println("\nCicli: " + cont);

	}

}