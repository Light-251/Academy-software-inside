import java.util.Scanner;

public class NumeroPrimoOttimizzato {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci un numero");
		int numeroInserito = scanner.nextInt();

		scanner.close();

		boolean isPrimeNumber = true;
		int i = numeroInserito / 2;

		while (i > 1) {
			System.out.println("Prendo in considerazione " + i);
			if (numeroInserito % i == 0) {
				isPrimeNumber = false;
				break;
			}
			i--;
		}
		
		if(isPrimeNumber)
			System.out.println("Primo");
		else 
			System.out.println("Non Primo");
	}

}
