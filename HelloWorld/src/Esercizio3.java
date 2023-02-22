import java.util.Scanner;
/*
 * Inserire un numero da tastiera e restituire l'opposto
 */
public class Esercizio3 {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);

		int numeroInserito;

		System.out.println("Isnerisci un numero");
		numeroInserito = tastiera.nextInt();

		tastiera.close();
		
		System.out.println("L'opposto del numero è: " + (numeroInserito * -1));

	}

}
