import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {
		/*
		 * - prendere con la tastiera ingresso un numero e dire se il numero e' pari oppure dispari
		 */
		Scanner scanner = new Scanner(System.in);
		int numero1;
		
		System.out.println("Inserisci un numero");
		numero1 = scanner.nextInt();
		
		scanner.close();
		
		if(numero1%2 == 0)
			System.out.println("Il numero è pari");
		else
			System.out.println("Il numero è dispari");
		
	}

}
