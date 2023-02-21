import java.util.Scanner;

/*
 * 3 numeri input
 * 
 * 
 * 
 * 
 * vittoria 3 punti
 * sconfitta 0 punti
 * pareggio 1 punto
 */
public class Esercizio7 {

	public static void main(String[] args) {
		
		int vittorie, /*sconfitte,*/ pareggi;
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci vittorie, pareggi e sconfitte.");
		vittorie = key.nextInt();
		pareggi = key.nextInt();
//		sconfitte = key.nextInt();
		
		key.close();
		
		int punteggioTotale = (vittorie * 3) + pareggi;
		
		System.out.println("Il punteggio finale è " + punteggioTotale);

	}

}
