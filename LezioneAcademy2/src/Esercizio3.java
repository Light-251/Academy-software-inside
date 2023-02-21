import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		//Esercizio : prendere 3 numeri e dire se tutti e 3 sono diversi..
		Scanner key = new Scanner(System.in);
		int numero1, numero2, numero3;
		
		System.out.println("Inserisci i tre numeri");
		numero1 = key.nextInt();
		numero2 = key.nextInt();
		numero3 = key.nextInt();
		
		key.close();
		
		if((numero1 != numero2) && (numero1 != numero3) && (numero2 != numero3) )
			System.out.println("I numeri sono tutti diversi");
		else
			System.out.println("Non tutti i numeri sono diversi");
	}

}
