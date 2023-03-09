package it.softwareinsde.zoo;

public class Leone extends Animale {
	
	public Leone() {
		super();
	}
	public Leone(int eta, String colore, char sesso) {
		super(3,"giallo", 'm');
	}
	
	@Override
	public void saluta() {
		System.out.println("ROARRRRRRRRR");
	}

}
