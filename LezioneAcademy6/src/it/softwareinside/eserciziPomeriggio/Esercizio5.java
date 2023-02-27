/*
 * Creare un programma che continua a chiedere di inserire un numero
 * se il numero risulta essere negativo o uguale a zero
 * 
 * Usare il numero dell'utente per creare un ciclo di n elementi 
 * dove n è sicuramente maggiore di 0 e inserire con scanner tutti gli n numeri 
 * calcolare la somma
 * 
 * 
 * 
 * 
 */
package it.softwareinside.eserciziPomeriggio;

import java.util.Scanner;

public class Esercizio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroCicli;

		do {
			System.out.println("Quanti numeri?");
			numeroCicli = scanner.nextInt();
		} while (numeroCicli <= 0);

		int i = 0, somma = 0, numeroCorrente;

		while (i < numeroCicli) {
			System.out.print("Inserisci: ");
			numeroCorrente = scanner.nextInt();
			somma += numeroCorrente;

			i++;
		}
		scanner.close();

		System.out.println("La somma vale: " + somma);

	}

}
