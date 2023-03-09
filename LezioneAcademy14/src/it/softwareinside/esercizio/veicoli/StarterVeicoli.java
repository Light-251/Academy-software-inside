package it.softwareinside.esercizio.veicoli;

public class StarterVeicoli {

	public static void main(String[] args) {
		Furgone furgone = new Furgone();
		Automobile automobile = new Automobile();
		Motocicletta motocicletta = new Motocicletta();
		
		System.out.println(furgone);
		System.out.println(automobile);
		System.out.println(motocicletta);
		
		System.out.println("________________________________");
		
		Furgone furgone2 = new Furgone(2003, 3, "Fiorino", "elettrica", 250);
		Automobile automobile2 = new Automobile(2017, 300, "Lambo", "Elettreica", 3);
		Motocicletta motocicletta2 = new Motocicletta(2020, 2, "Volkswagen", "ibrida", "Moto da Cross", 60);
		
		System.out.println(furgone2);
		System.out.println(automobile2);
		System.out.println(motocicletta2);
		
		System.out.println("_________________________________");
	}

}
