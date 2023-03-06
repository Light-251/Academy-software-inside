package it.softwareinside.Dvd;

import java.util.Scanner;

public class StarterDvd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Dvd[] arrayDvd = new Dvd[20];
		for (int i = 0; i < arrayDvd.length; i++) {
			arrayDvd[i] = new Dvd();
		}

		System.out.println("Stampa Array:");
		for (Dvd dvd : arrayDvd) {
			System.out.println(dvd);
		}

		System.out.println("-------------------");

		String titoloDaCercare;
		do {
		System.out.println("Inserisci genere da cercare");
		titoloDaCercare = scanner.next();
		}while( !( titoloDaCercare.equalsIgnoreCase("Horror")
				|| titoloDaCercare.equalsIgnoreCase("Thriller")
				|| titoloDaCercare.equalsIgnoreCase("Commedia")
				|| titoloDaCercare.equalsIgnoreCase("Fantasy"))
				);
		
		double prezzoDaCercare;
		do {
		System.out.println("Inserisci il prezzo da cercare (min: 2,99 max 15,00)");
		prezzoDaCercare = scanner.nextDouble();
		}while(prezzoDaCercare < 2.99 || prezzoDaCercare > 15.00);
		
		scanner.close();

		for (Dvd dvd : arrayDvd) {
			if (dvd.getGenere().equalsIgnoreCase(titoloDaCercare))
				if (dvd.getCosto() <= prezzoDaCercare)
					System.out.println(dvd);
		}

	}

}
