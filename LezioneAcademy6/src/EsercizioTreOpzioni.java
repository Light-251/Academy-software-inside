import java.util.Scanner;

/*
 * Prendere in input una sequenza di interi che termina con 0 
 * il programma stampa 'si' se la sequenza è formata da un pari seguito da un dispari seguito da un multiplo di 5
 * 
 * ES 10 3 5  0 "ok"
 * ES 10 4 50 0 "no"
 */
public class EsercizioTreOpzioni {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numeroCorrente, cont = 0;
		boolean sequenzaOK = true;
		do {
			System.out.print("Inserisci: ");
			numeroCorrente = scanner.nextInt();

			if (numeroCorrente == 0)
				break;

			if (cont == 0) {
				if (numeroCorrente % 2 != 0) {
					sequenzaOK = false;
//					System.err.println("primo else if sequenza cambiata: " + sequenzaOK);

				}

			} else if (cont == 1) {
				if (numeroCorrente % 2 == 0) {
					sequenzaOK = false;
//					System.err.println("secondo else if sequenza cambiata: " + sequenzaOK);

				}

			} else if (cont == 2) {
				if (numeroCorrente % 5 != 0) {
					sequenzaOK = false;
//					System.err.println("ultimo else if sequenza cambiata: " + sequenzaOK);
				}
			}
//			System.err.println("cont: " + cont);
			cont++;
			if (cont > 2) {
				cont = 0;
			}
		} while (numeroCorrente != 0);

		scanner.close();

		if (sequenzaOK)
			System.out.println("ok");
		else
			System.out.println("no");

	}

}
