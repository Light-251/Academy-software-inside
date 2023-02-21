import java.util.Scanner;

public class Esercizio10 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Inserisci i tre numeri");
		numero1 = key.nextInt();
		numero2 = key.nextInt();
		numero3 = key.nextInt();
		
		key.close();
		
		if(numero1%5==0 && numero2%5==0 && numero3%5==0)
			System.out.println("ok");
		else
			System.out.println("no");

	}

}
