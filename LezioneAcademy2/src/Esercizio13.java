import java.util.Scanner;

public class Esercizio13 {

	public static void main(String[] args) {
		/*
		 *  Esercizio Hai vinto una multa :  prende con la tastiera una velocità e un limite ,
		 *   se la velocità e' maggiore
		 * 	del limite stampa a video "hai vinto una multa" altrimenti non fa nulla...
		 */
		
		Scanner key = new Scanner(System.in);
		
		int velocita, limite;
		System.out.println("Inserisci velocità e limite");
		velocita = key.nextInt();
		limite = key.nextInt();
		
		key.close();
		
		if(velocita > limite)
			System.out.println("Hai vinto una multa");
	}

}
