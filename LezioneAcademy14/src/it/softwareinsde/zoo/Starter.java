package it.softwareinsde.zoo;

public class Starter {

	public static void main(String[] args) {
		Animale animale = new Animale();
		Leone leone = new Leone();
		Pinguino pinguino = new Pinguino();
		Scimmia scimmia = new Scimmia();
		
		Zoo zoo = new Zoo("PROVA");
		
		animale.saluta();
		
		System.out.println();
		
//		leone.saluta();
//		pinguino.saluta();
//		scimmia.saluta();
		
		// Riempimento vettore animali tramite la funzione addAnimale della classe Zoo
		for(int i=0; i<zoo.getAnimali().length; i++) {
			zoo.addAnimale(leone);
			zoo.addAnimale(pinguino);
			zoo.addAnimale(scimmia);
			zoo.addAnimale(null);
		}
		
		zoo.stampaZoo();
		
//		
		System.out.println("\nRimozione animale pos 3");
		zoo.removeAnimale(3);
//		
		zoo.stampaZoo();
//		System.out.println("\n" + zoo.toString());
	}

}
