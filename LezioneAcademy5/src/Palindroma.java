import java.util.Scanner;

/*
 * data una stringa dire se è palindroma
 */
public class Palindroma {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci ");
		String parolaInserita = scanner.next();

		scanner.close();

		StringBuilder sb = new StringBuilder(parolaInserita);
		String parolaReversed = sb.reverse().toString();

		if (parolaInserita.equals(parolaReversed))
			System.out.println("ok");
		else
			System.out.println("no");
	}
}
