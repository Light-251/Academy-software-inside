/*
 * Prendere in input 5 caratteri 
 * se tutti i caratteri sono 'a'
 * stampare 'ok' altrimenti 'no'
 */
package it.softwareinside.eserciziPomeriggio;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char carattereCorrente;
		boolean sequenzaOK = true;
		int i=0;
		while(i<5) {
			System.out.print("Inserisci: ");
			carattereCorrente = scanner.next().charAt(0);
			
			if(carattereCorrente != 'a') {
				sequenzaOK = false;
				break;
			}
			
			i++;
		}
		
		scanner.close();
		
		if(sequenzaOK)
			System.out.println("OK");
		else 
			System.out.println("NO");
		
	}

}
