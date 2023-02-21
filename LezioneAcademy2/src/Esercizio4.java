import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {
		/*
		 * prendere in input una stringa
		 * 
		 * stampare a video il primo carattere della stringa
		 * 
		 */
		String parola;
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci la parola");
		parola = key.next();
		
		key.close();
		
		System.out.println(parola.charAt(0));
		}

}
