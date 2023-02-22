import java.util.Scanner;
/*
 * Inserire due numeri da tastiera e stampare il numero maggiore
 */
public class Esercizio4 {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		int numero1, numero2;
		
		System.out.println("Inserisci il primo numero");
		numero1 = tastiera.nextInt();
		
		System.out.println("Inserisci il secondo numero");
		numero2 = tastiera.nextInt();
		
		tastiera.close();
		
		if(numero1>numero2) {
			System.out.println("Il numero Maggiore è " + numero1);
		}
		else {
			System.out.println("Il numero maggiore è " + numero2);
		}
		
	}

}
