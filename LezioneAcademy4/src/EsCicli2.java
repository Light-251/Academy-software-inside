import java.util.Scanner;

/*Inserire  un intero e una stringa
 * il programma prosegue solo se il numero è compreso tra 0 e la lunghezza -1
 * 
 * il programma stampa la stringa che va dal numero alla fine della stringa
 * 
 */
public class EsCicli2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("inserisci una stringa");
		String parolaInserita = scanner.next();

		System.out.println("Inserisci un intero");
		int numeroInserito = scanner.nextInt();

		scanner.close();

//		String parolaTagliata = "";

		if (numeroInserito > 0 && numeroInserito < parolaInserita.length()) {
			while(numeroInserito<parolaInserita.length()) {
				System.out.print(parolaInserita.charAt(numeroInserito));
//				parolaTagliata+=parola.charAt(numeroInserito);
				numeroInserito++;
			}

		}
		else {
			System.out.println("Non posso andare avanti");
			System.exit(0);
		}
	}

}
