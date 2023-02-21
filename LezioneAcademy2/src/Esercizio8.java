import java.util.Scanner;

public class Esercizio8 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		int numero1, numero2, numero3;
		
		System.out.println("Inserisci tre numeri");
		numero1 = key.nextInt();
		numero2 = key.nextInt();
		numero3 = key.nextInt();
		
		key.close();
		
		if((numero1 == numero2) && (numero2 == numero3)) 
			System.out.println("Sono uguali");
		else
			System.out.println("Sono diversi");
			
	}

}
