import java.util.Scanner;

public class Palindorma2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci parola");
		String parola = scanner.next();

		scanner.close();

		boolean isPalindroma = true;

		int i = 0, j = parola.length() - 1;

		while (i < parola.length() / 2) {
			System.out.println("Confronto tra " + parola.charAt(i) + " " + parola.charAt(j));
			
			if (parola.charAt(i) != parola.charAt(j)) {
				System.out.println("Ho trovato due lettere diverse, uscita dal ciclo");
				isPalindroma = false;
				break;
			}
			i++;
			j--;
		}
		if (isPalindroma)
			System.out.println("è Palindroma");
		else {
			System.out.println("NO");
		}
	}

}
