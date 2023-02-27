/*
 * Data una stringa in input 
 * dire se la stringa contiene almeno due lettere b
 */
package it.softwareinside.eserciziPomeriggio;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci Stringa");
		String parolaInserita = scanner.next();

		int i = 0, cont = 0;
		while (i < parolaInserita.length()) {

			if (parolaInserita.charAt(i) == 'b')
				cont++;

			i++;
		}
		
		scanner.close();
		
		if(cont>=2)
			System.out.println("OK");
		else 
			System.out.println("NO");
		
	}

}
