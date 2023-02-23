import java.util.Scanner;

/*
 * Prendere in ingresso una stringa e stampare la metà della stringa
 */
public class EsCicli3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci una stringa");
		String parolaInserita = scanner.next();

		scanner.close();

		int i = 0;

		while (i < (parolaInserita.length() / 2)) {
			System.out.print(parolaInserita.charAt(i));

			i++;
		}
	}

}
