import java.util.Scanner;

public class EserciziRush {

	public static void main(String[] args) {
		/*
		 * Creare un programma che prende da tastiera un carattere e stampa vero se il 
		 * carattere e' una vocale ... nota : usate next() usate il charAt(0) e confrontate
		 * potreste anche utilizzare l'operatore or || .
		 */
		
		Scanner key = new Scanner(System.in);

		
		String lettera;
		System.out.println("Inserisci una lettera");
		lettera = key.next();
		
		if((lettera.charAt(0)== 'a') || (lettera.charAt(0)== 'e') || (lettera.charAt(0)== 'i') || (lettera.charAt(0)== 'o' || (lettera.charAt(0)== 'u')))
			System.out.println("La lettera è una vocale");
		else
			System.out.println("Non hai inserito una vocale");
		
		key.close();

	}

}
