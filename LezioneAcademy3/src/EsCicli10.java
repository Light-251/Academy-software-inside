import java.util.Scanner;

/*
 * in input due numeri da tastiera, stampare tutti i numeri tra num1 e num2
 */
public class EsCicli10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci i due numeri");
		int num1 = scanner.nextInt(), num2 = scanner.nextInt();

		scanner.close();

		while (num1 <= num2) {
			System.out.print(num1 + " ");
			num1++;
		}

	}

}
