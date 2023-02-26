import java.util.Scanner;

/*
 * prendere da tastiera un numero intero il programma stampa se il numero è primo o no
 * 
 * significato numero primo:
 * un numero primo ha solo due divisori che sono chiamati "divisori banali" e sono 1 e il numero stesso;
 */
public class NumeroPrimo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci un numero");
		int numeroInserito = scanner.nextInt();

		scanner.close();

		int contatoreDivisori = 0, i = 1;

		while (i <= numeroInserito) {

			if (numeroInserito % i == 0) {
				contatoreDivisori++;
				System.out.println("Incremento contat= " + contatoreDivisori);
			}

			if (contatoreDivisori >= 3) {
				System.out.println("Uscita ciclo i= " + i + " contat= " + contatoreDivisori);
				 break;
			}

//			System.out.println("i vale= " + i);
			i++;
		}

		System.out.println("Numero Cicli: " + i);

		if (contatoreDivisori > 2)
			System.out.println("numero NON primo");
		else {
			System.out.println("numero PRIMO");
		}

	}

}
