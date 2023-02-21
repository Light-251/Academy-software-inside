import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {
		
		int  numeroInserito, somma;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il primo numero");
		numeroInserito = input.nextInt();
		somma = numeroInserito;
		
		System.out.println("Inserisci il secondo numero");
		numeroInserito = input.nextInt();
		somma+= numeroInserito;
		
		System.out.println("Inserisci il terzo numero");
		numeroInserito = input.nextInt();
		somma += numeroInserito;
		
		input.close();
		
		System.out.println("La somma è " + somma);
		

		
	}

}
