package it.softwareinside.zoo;

public class Starter {
	public static void main(String[] args) {
		Zoo zooTester = new Zoo();
		
		System.out.println("Sit. iniziale");
		zooTester.stampaAnimali();
		
		System.out.println("\nAggiunta animali");
		zooTester.addAnimale(new Animale());
		zooTester.addAnimale(new Animale("leone", 4, 'm'));
		zooTester.addAnimale(new Animale());
		zooTester.addAnimale(new Animale());
		
		System.out.println("Inserisco il secondo leone");
		zooTester.addAnimale(new Animale("leone", 6, 'm'));
		
		zooTester.stampaAnimali();
		
		System.out.println("\nRimozione animale pos 2");
		zooTester.removeAnimale(2);
		
		zooTester.stampaAnimali();
		
		System.out.println(zooTester.lionExist());
		
//		System.out.println("\ntoString zoo");
//		System.out.println(zooTester);
	}
	
	

}
