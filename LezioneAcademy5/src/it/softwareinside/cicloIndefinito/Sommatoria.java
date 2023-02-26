/*
 *Creare un programma che in grado di svolgere la sommatoria di un numero indefinito
 *di elementi presi da tastiera, il programma termina quando si inserisce il valore 0
 *e al termine stampa la somma finale
 * 
 */
package it.softwareinside.cicloIndefinito;

import java.util.Scanner;

public class Sommatoria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci i numeri: ");
		int numeroCorrente = scanner.nextInt();
		
		int sommatoria =0;
		
		while(numeroCorrente!=0) {
			sommatoria += numeroCorrente;
			System.out.println("Somma parziale: " + sommatoria);
			
			System.out.print("Continua a inserire o inserisci 0 per terminare: ");
			numeroCorrente = scanner.nextInt();
		}
		scanner.close();
		
		System.out.println("Fine, la somma totale è: " + sommatoria);
	}

}
