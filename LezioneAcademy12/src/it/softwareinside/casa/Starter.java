package it.softwareinside.casa;

public class Starter {
		public static void main(String[] args) {
			
			Dimensioni dim = new Dimensioni();
			
			Cucina cucinaTester = new Cucina();
			Sala salaTester = new Sala();
			
			Casa casaTester = new Casa();
			
			System.out.println("area cucina " + cucinaTester.getDimensioni().calcolaArea());
			System.out.println("area sala " + salaTester.getDimensioni().calcolaArea());
			
			System.out.println("area totale " + casaTester.calcolaAreaTotale());
			
			// Prova cambio dimensioni Cucina
			dim.setLarghezza(6);
			dim.setLunghezza(7);
			
			cucinaTester.setDimensioni(dim);
			casaTester.setCucina(cucinaTester);
			
			System.out.println("area cucina 2: " + cucinaTester.getDimensioni().calcolaArea());
			System.out.println("area totale " + casaTester.calcolaAreaTotale());

			
		}
	
	

}
