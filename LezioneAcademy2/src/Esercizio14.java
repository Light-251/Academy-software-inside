import java.util.Scanner;

public class Esercizio14 {

	public static void main(String[] args) {
		
		/* 
		 *  in input due stringhe stampare a video la stringa con più caratteri
		 *  se sono uguali stampare la prima
		 */
		 
				
		Scanner key = new Scanner(System.in);
				
		String parola1, parola2;
				
		System.out.println("Inserisci la prima parola");
		parola1 = key.next();
		System.out.println("Inserisci la seconda parola");
		parola2 = key.next();
				
		if(parola1.length() >= parola2.length())
			System.out.println("La parola più lunga è: " + parola1);
		else
			System.out.println("La parola più lunga è " + parola2);
				
		key.close();
	}

}
