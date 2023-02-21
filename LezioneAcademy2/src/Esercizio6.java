import java.util.Scanner;

/*
 * 
 */
public class Esercizio6 {

	public static void main(String[] args) {
		
		int minuti;
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci minuti");
		minuti = key.nextInt();
		
		key.close();
		
		if(minuti <= 0)
			System.out.println("Non posso continuare oltre");
		else
			System.out.println(minuti + " minuti sono " + (minuti*60) + " secondi");
	}

}
