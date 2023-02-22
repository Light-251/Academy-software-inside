import java.util.Scanner;
/*
 * Inserire due numeri da tastiera e definire se sono uguali
 * oppure diversi
 */

public class Esercizio5 {
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);

		int numero1, numero2;

		System.out.println("Inserisci i numeri");
		numero1 = tastiera.nextInt();
		numero2 = tastiera.nextInt();

		if (numero1 == numero2)
			System.out.println("I numeri sono uguali");
		else
			System.out.println("Sono diversi");

		tastiera.close();
	}
}
