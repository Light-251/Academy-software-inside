package it.softwareinside.cinema;

public class Tester {

	public static void main(String[] args) {
		Persona[] persone = new Persona[10];
		Cinema cinema = new Cinema("TEST");
		Film filmTest = new Film();
		
		for (int i = 0; i < persone.length; i++) {
			persone[i] = new Persona("TEST", 18);
			cinema.addPersonaAlFilm(persone[i], filmTest);
			
		}
		
//		cinema.removeTutteLePersone();
		System.out.println(cinema);
		
	}

}
