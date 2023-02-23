import java.util.Scanner;

/*
 * data una stringa da tastiera
 * se la stringa contiene più di 1 carattere
 * controllare chela prima lettera si auguale all'ultima
 */
public class EsercizioString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci parola");
		String parolaInserita = scanner.next();
		scanner.close();

		char ultimaLettera = parolaInserita.charAt(parolaInserita.length() - 1);

		if (parolaInserita.length() >= 1) {
			if (parolaInserita.charAt(0) == ultimaLettera)
				System.out.println("ok");
			else 
				System.out.println("no");

		}
//		else {
//			System.out.println("no");
//		}

	}

}
