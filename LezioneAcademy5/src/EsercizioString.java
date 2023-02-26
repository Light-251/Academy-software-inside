import java.util.Scanner;

/*
 * Data una stringa in input 
 * stampare una nuova stringa dove al posto della lettera 'a'
 * verrà scritto il simbolo '@'
 */
public class EsercizioString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci una stringa");
		String parolaInserita = scanner.nextLine();

		scanner.close();

		String nuovaStringa = "";
		int i = 0;

		while (i < parolaInserita.length()) {

			nuovaStringa += parolaInserita.toLowerCase().charAt(i) == 'a' ? '@' : parolaInserita.charAt(i);

//			if(parolaInserita.toLowerCase().charAt(i) != 'a')
//				nuovaStringa += parolaInserita.charAt(i);
//			else 
//				nuovaStringa += '@';

			i++;
		}

		System.out.println("Nuova Stringa: " + nuovaStringa);
	}

}
