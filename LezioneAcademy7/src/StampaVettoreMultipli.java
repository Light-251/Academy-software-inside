import java.util.Scanner;

/*
 * Prendere un numero da tastiera
 * stampare tutti gli elementi del vettore 
 * ceh sono multipli dell'elemento inserito
 */
public class StampaVettoreMultipli {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] vett = {6, 8, 10, 3, 12};
		System.out.println("Inserisci");
		int numeroInserito = scanner.nextInt();
		
		scanner.close();
		
		int i=0;
		while(i<vett.length) {
			if(vett[i] % numeroInserito ==0)
				System.out.print(vett[i] + " ");
			
			i++;
		}
		
	}

}
