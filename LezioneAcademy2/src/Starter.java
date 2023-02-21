import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		String frase;
		
		System.out.println("Inserisci Stringa");
		frase = tastiera.nextLine();
		
		tastiera.close();
		
		System.out.println("La lunghezza è: " + frase.length());
		
	}

}
