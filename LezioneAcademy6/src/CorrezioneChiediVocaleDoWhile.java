import java.util.Scanner;

public class CorrezioneChiediVocaleDoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char myCharInput;
		
		do {
			
			System.out.println("Inserisci: ");
			myCharInput = scanner.next().charAt(0);
			
		} while (myCharInput == 'a' || 
				myCharInput == 'e' || 
				myCharInput == 'i' ||
				myCharInput == 'o' ||
				myCharInput == 'u' );
		
		scanner.close();
		System.out.println("Fine");
	}

}
