import java.util.Scanner;

/*
 * prendere in input 2 stringhe, il programma va avanti solamente se 
 * le 2 stringhe hanno la stessa dimensione
 * 
 * 
 */
public class EsercizioStringeExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Stringa 1: ");
		String primaStringa = scanner.next();

		System.out.print("Stringa 2: ");
		String secondaStringa = scanner.next();

		scanner.close();

		String nuovaStringa = "";

		if (primaStringa.length() == secondaStringa.length()) {
			int i = 0;

			while (nuovaStringa.length() < primaStringa.length()) {

				nuovaStringa += primaStringa.charAt(i);
				nuovaStringa += secondaStringa.charAt(i);

				i++;
			}

		} else {
			System.out.println("Non posso andare avanti");
			System.exit(0);
		}

		System.out.println("Nuova Strigna: " + nuovaStringa);
	}

}
