/*creare una classe gatto farlo miagolare con una funzione
  poi creare uno StarterGatto che contiene il metodo main e ci sarà uno Scanner
  "Quante volte miagola?" se il numero inserito è minore di 0
  richiedere la domanda, altrimenti far miagolare in base al numero inserito
*/
package it.softwareinside.object;

import java.util.Scanner;

public class StarterGatto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Gatto gatto = new Gatto();

		int numeroMiao;
		do {
			System.out.println("Quante volte deve miagolare?");
			numeroMiao = scanner.nextInt();
		} while (numeroMiao <= 0);

		scanner.close();

		for (int i = 0; i < numeroMiao; i++) {
			gatto.mew();
		}
	}

}
