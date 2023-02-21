import java.util.Scanner;

public class Esercizio9 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String parola1, parola2;
		
		System.out.println("Inserisci le due parole");
		parola1 = key.next();
		parola2 = key.next();
		
		key.close();
		
		if(parola1.length() == parola2.length())
			System.out.println("ok");
		else
			System.out.println("no");
	}

}
