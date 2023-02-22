import java.util.Scanner;

/*
 *  prendere un numero da tastiera, se è negativo il prog termina 
 *  se è >= 0 stampare tutti i num da 1 al numero fornito da tastiera
 */
public class EsCicli9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci un numero");
		int numero = scanner.nextInt();

		scanner.close();

		if (numero >= 0) {
			int i = 1;
			while (i <= numero) {
				System.out.print(i + ", ");
				i++;
			}
		} else {
			System.out.println("Non posso andare avanti");
			System.exit(0);
		}

	}

}
