import java.util.Scanner;

public class EserecizioTastiera2 {
	public static void main(String[] args){
//		Scanner tastiera = new Scanner(System.in);
//		
//		int numeroInserito;
//		
//		System.out.println("Isnerisci un numero");
//		numeroInserito = tastiera.nextInt();
//		
//		System.out.println("L'opposto del numero è: " + (numeroInserito*-1));
//		
//		tastiera.close();
		
//		Scanner tastiera = new Scanner(System.in);
//		int numero1, numero2;
//		
//		System.out.println("Inserisci il primo numero");
//		numero1 = tastiera.nextInt();
//		
//		System.out.println("Inserisci il secondo numero");
//		numero2 = tastiera.nextInt();
//		
//		if(numero1>numero2) {
//			System.out.println("Il numero Maggiore è " + numero1);
//		}
//		else {
//			System.out.println("Il numero maggiore è " + numero2);
//		}
		
//		Scanner tastiera = new Scanner(System.in);
//		
//		int numero1, numero2;
//		
//		System.out.println("Inserisci i numeri");
//		numero1 = tastiera.nextInt();
//		numero2 = tastiera.nextInt();
//		
//		if(numero1 == numero2)
//			System.out.println("I numeri sono uguali");
//		else
//			System.out.println("Sono diversi");
//		
//		tastiera.close();
		
		
//		Scanner tastiera = new Scanner(System.in);
//		
//		int numero1, numero2;
//		
//		System.out.println("Inserisci i numeri");
//		numero1 = tastiera.nextInt();
//		numero2 = tastiera.nextInt();
//		
//		if(numero1 % numero2 == 0)
//			System.out.println("ok");
//		else
//			System.out.println("no");
//		
//		tastiera.close();
		
		//Calcolare la media
		
		Scanner tastiera = new Scanner(System.in);
		int numero1, numero2, numero3;
		
		System.out.println("Inserisci i numeri");
		numero1 = tastiera.nextInt();
		numero2 = tastiera.nextInt();
		numero3 = tastiera.nextInt();
		
		int somma = numero1 + numero2 + numero3;
		
		tastiera.close();
		
		System.out.println("La media è " + (somma/3));
		
	}

}
