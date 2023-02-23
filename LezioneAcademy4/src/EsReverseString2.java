import java.util.Scanner;
/*
 * predere una stringa da tastiera e stamparla al contrario v2.0
 */
public class EsReverseString2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci parola");
		String parola = scanner.next();
		
		scanner.close();

		String parolaRevesed = "";

		int i = parola.length() - 1;

		while (i >= 0) {
			parolaRevesed += parola.charAt(i);
			
			i--;
		}
		
		System.out.println(parolaRevesed.toUpperCase());
		
		
	}

}
