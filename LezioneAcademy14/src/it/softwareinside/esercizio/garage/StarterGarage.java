package it.softwareinside.esercizio.garage;

import java.util.Scanner;

import it.softwareinside.esercizio.veicoli.Automobile;
import it.softwareinside.esercizio.veicoli.Furgone;
import it.softwareinside.esercizio.veicoli.Motocicletta;

public class StarterGarage {

	public static void main(String[] args) {
		Garage garage = new Garage();
		
		Motocicletta moto = new Motocicletta();
		Furgone furgone = new Furgone();
		Automobile automobile = new Automobile();
		
		System.out.println(garage);
		
		for (int i = 0; i < 15; i++) {
			garage.immettiNuovoVeicolo(moto);
			garage.immettiNuovoVeicolo(furgone);
			garage.immettiNuovoVeicolo(automobile);
		}
		
		garage.stampaSituazionePosti();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("_______________________________________________________");
		
		System.out.println("Inserisci la posizione da eliminare");
		int pos = scanner.nextInt();
		scanner.close();
		
		for (int i = 0; i < 34; i++) {
			System.out.println(garage.immettiNuovoVeicolo(automobile));
		}
		

		if(garage.estraiVeicolo(pos) != null) {
			garage.stampaSituazionePosti();
			System.err.println("Il posto è vuoto");
		}
		else 
			System.err.println("OPS! Qualcosa è andato storto!");
		
		
		
	}

}
