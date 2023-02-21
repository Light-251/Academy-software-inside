import java.util.Scanner;

/*
 * 
 * dati 3 numeri dire se sono crescenti
 * 
 */
public class Esercizio12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero1, numero2, numero3;
		
		System.out.println("Inseisci i numeri");
		numero1 = scanner.nextInt();
		numero2 = scanner.nextInt();
		numero3 = scanner.nextInt();
		
		scanner.close();
		
		if(numero1 < numero2 && numero2 < numero3)
			System.out.println("ok");
		else
			System.out.println("no");
	}

}
