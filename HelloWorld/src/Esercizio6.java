import java.util.Scanner;
/*
 * Inserire due numeri e definire se il primo numero è
 * multiplo del secondo
 */

public class Esercizio6 {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);

		int numero1, numero2;

		System.out.println("Inserisci due numeri");
		numero1 = tastiera.nextInt();
		numero2 = tastiera.nextInt();

		if (numero1 % numero2 == 0)
			System.out.println("ok");
		else
			System.out.println("no");

		tastiera.close();

	}

}
