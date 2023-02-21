import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		/*
		 * -prendere con la tastiera 2 stringhe e stampare a video le stringhe concatenate
		 */
		
		String parola1, parola2;
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci le due stringhe");
		parola1 = key.nextLine();
		parola2 = key.nextLine();
		
		key.close();
		
		System.out.println("Le due stringhe sono: " + parola1 + " " + parola2);
	}

}
