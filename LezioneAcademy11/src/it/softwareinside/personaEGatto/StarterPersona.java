package it.softwareinside.personaEGatto;

public class StarterPersona {

	public static void main(String[] args) {
		
		Gatto gatto = new Gatto("Nuvola", "Grigio", 12);
		
		Persona personaDefault = new Persona();
		Persona persona2 = new Persona("Silvio", 26, gatto);
		
		System.out.println("Persona Default " + personaDefault);
		System.out.println("Persona param " + persona2);
	}

}
