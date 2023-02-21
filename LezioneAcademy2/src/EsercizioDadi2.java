
		/* Lancia il dado 2 volte, se la somma fa 7 
		 * scrive hai vinto, altrimenti hai perso
		 */

import java.util.Random;

public class EsercizioDadi2 {
	public static void main(String[] args) {
		
		Random random = new Random();
		int sommaLancio = 0;
		
		System.out.println("Lancio i dadi");
		sommaLancio = random.nextInt(1,6);
		
		System.out.println(sommaLancio);
		sommaLancio += random.nextInt(1,6);
		
		System.out.println(sommaLancio);
		
		if(sommaLancio == 7)
			System.out.println("Hai vinto");
		else
			System.out.println("Hai perso");
	}
}
