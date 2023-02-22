import java.util.Scanner;

public class Eserecizio2 {
	public static void main(String[] args) {
		// Calcolare la media tra 3 numeri

		Scanner tastiera = new Scanner(System.in);
		int numero1, numero2, numero3;

		System.out.println("Inserisci i numeri");
		numero1 = tastiera.nextInt();
		numero2 = tastiera.nextInt();
		numero3 = tastiera.nextInt();

		int somma = numero1 + numero2 + numero3;

		tastiera.close();

		System.out.println("La media è " + (somma / 3));

	}

}
