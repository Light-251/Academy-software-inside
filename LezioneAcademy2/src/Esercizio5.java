/*
 * Prendere in ingresso un numero intero che rappresenta l'età 
 * e una stringa che rappresenta il nome  e stampare se
 * la persona può prendere la patente
 */


import java.util.Scanner;

public class Esercizio5 {

	public static void main(String[] args) {
		String nome;
		int eta;
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci il nome");
		nome = key.next();
		
		System.out.println("Inserisci l'età");
		eta = key.nextInt();
		
		key.close();
		
		if(eta >= 18)
			System.out.println("ok " + nome + " puoi prendere la patente");
		else
			System.out.println("no " + nome + " non puoi prendere la patente");
		
		

	}

}
