import java.util.Scanner;

/*
 * data una stringa dire se è palindroma
 */
public class Palindroma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci parola");
		String parola = scanner.next();

		scanner.close();

		String parolaContrario = "";
		int i = parola.length() - 1;

		while (i >= 0) {
			parolaContrario += parola.charAt(i);

//			System.out.println("i= " + i);
			i--;
		}
//		System.out.println(parolaContrario);
		if(parola.equals(parolaContrario))
			System.out.println("ok");
		else 
			System.out.println("no");
	}

}
