import java.util.ArrayList;
import java.util.Scanner;

public class Starter {
	public static void main(String[] args) {
		FunzioneArrayList funzione = new FunzioneArrayList();

		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> myArr = new ArrayList<>();

		// TEST SOMMA MULTIPLI
		for (int i = 0; i < 5; i++) {
			System.out.println("Inersici 5 valori");
			myArr.add(scanner.nextInt());
		}
		System.out.println("Inserisic valore");
		int pos = scanner.nextInt();
		System.out.println("Somma dei valori");
		System.out.println(funzione.sommaMultipliArrayList(myArr, pos));
		scanner.close();
		
		// TEST PRODOTTO 
		ArrayList<Double> arrDouble = new ArrayList<>();
		arrDouble.add(3.0);
		arrDouble.add(34.0);
		
		System.out.println(funzione.prodottoValori(arrDouble));
		
		// TEST PARI
		
		System.out.println(funzione.controlloPari(myArr));
	}
}
