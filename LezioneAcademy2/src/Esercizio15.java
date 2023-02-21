import java.util.Scanner;

public class Esercizio15 {

	public static void main(String[] args) {

		String parola;
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci la parola");
		parola = key.next();
		
		key.close();
		
		if(parola.length() > 3) {
			System.out.println(parola.substring(1));
		}
		else
			System.out.println("La parola è troppo corta");
	}

}
