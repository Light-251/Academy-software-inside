import java.util.Scanner;

/*
 * in input due numeri da tastiera, stampare tutti i numeri tra num1 e num2
 * anche se num2 è più piccolo di num1
 */
public class EsCicli10b {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci i due numeri");
		int num1 = scanner.nextInt(), num2 = scanner.nextInt();

		scanner.close();
		/*
		 * SOLUZIONE 1
		 * 
		 * if (num1 < num2) {
		 * while (num1 <= num2) {
		 * System.out.print(num1 + " ");
		 * num1++;
		 * }
		 * 
		 * } else {
		 * while (num2 <= num1) {
		 * System.out.print(num2 + " ");
		 * num2++;
		 * }
		 * }
		 */
		// ------Operatore Ternario--------
		int max = num1 > num2 ? num1 : num2;
		int min = num1 < num2 ? num1 : num2;

		while (min <= max) {
			System.out.print(min + " ");
			min++;
		}

	}
}
