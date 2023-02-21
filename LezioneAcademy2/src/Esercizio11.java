import java.util.Scanner;

public class Esercizio11 {

	public static void main(String[] args) {
		/* Esercizio : Dato in ingresso un prezzo e uno sconto , 
		 * il  programam stampa a video il nuovo prezzo
		 * 
		 */
		Scanner key = new Scanner(System.in);
		double prezzo, sconto;
		
		System.out.println("Inserisci il prezzo e lo sconto");
		prezzo = key.nextDouble();
		sconto = key.nextDouble();
		
		key.close();
		
		double prezzoFinale = (prezzo * sconto) /100;
		
		System.out.println("Prezzo finale " + prezzoFinale);
	}

}
