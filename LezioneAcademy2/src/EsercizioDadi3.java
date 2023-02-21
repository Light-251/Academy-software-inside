import java.util.Random;
import java.util.Scanner;

public class EsercizioDadi3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int numeroRandom = random.nextInt(1,10);
		System.out.println("Inserisci un numero (" + numeroRandom + ") ");
		int numeroUtente = scanner.nextInt();
		
		scanner.close();
		
		if(numeroUtente == numeroRandom)
			System.out.println("GG EZ");
		else
			System.out.println("GIT GUD");
	}

}
