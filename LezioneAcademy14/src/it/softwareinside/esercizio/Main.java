package it.softwareinside.esercizio;

import java.util.Scanner;

import it.softwareinside.esercizio.garage.Garage;
import it.softwareinside.esercizio.veicoli.Automobile;
import it.softwareinside.esercizio.veicoli.Furgone;
import it.softwareinside.esercizio.veicoli.Motocicletta;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ris, scelta;

		Garage garage = new Garage();

		do {
			System.out.println("Cosa vuoi fare?");
			System.out.println("i per inserire un veicolo, r per rimuoverlo, s per stampare la situazione");
			ris = scanner.next();

			switch (ris) {
			case "i":
				System.out.println("Inserimento veicolo:");
				System.out.println(
						"Che tipo di veicolo vuoi inserire? a Automobile, f Furgone, m Motocicletta, d per tornare indietro ");
				do {
					scelta = scanner.next();
					int pos;
					switch (scelta) {
					case "a":
						pos = garage.immettiNuovoVeicolo(new Automobile());
						System.out.println("Veicolo aggiunto alla posizione: " + pos);
						break;
					case "f":
						pos = garage.immettiNuovoVeicolo(new Furgone());
						System.out.println("Veicolo aggiunto alla posizione: " + pos);
						break;
					case "m":
						pos = garage.immettiNuovoVeicolo(new Motocicletta());
						System.out.println("Veicolo aggiunto alla posizione: " + pos);
						break;
					case "d":
						System.out.println("Torno indietro");
						break;
					default:
						System.out.println("Riprova");
					}
				} while (!scelta.equals("d"));
				break;
			case "r":
				System.out.println("Rimozione veicolo");
				garage.stampaSituazionePosti();
				System.out.println("Inserisci la posizione da rimuovere");
				int pos = scanner.nextInt();

				if (garage.estraiVeicolo(pos) != null) {
					System.out.println("Veicolo rimosso con successo");
				} else {
					System.out.println("OPS, Qualcosa è andato storto");
				}
				break;
			case "s":
				System.out.println("Stampa situazione");
				garage.stampaSituazionePosti();
				break;
			case "q":
				System.out.println("Esco dal programma");
				break;
			default:
				System.out.println("Non riconosciuto, riprova");
			}
		} while (!ris.equals("q"));

		scanner.close();

	}

}
