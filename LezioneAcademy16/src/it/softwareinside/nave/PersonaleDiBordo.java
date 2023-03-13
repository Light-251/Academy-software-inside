package it.softwareinside.nave;

public class PersonaleDiBordo extends Persona{
	private String mansione;
	
	public PersonaleDiBordo() {
		this("PersonaleDefault", 20, "MansioneDefault");
	}
	
	public PersonaleDiBordo(String nome, int eta, String mansione) {
		super(nome, eta);
		setMansione(mansione);
	}
	
	@Override
	public String toString() {
		return super.toString() + "; Personale di Bordo: Mansione: " + this.mansione;
	}
	
	public void setMansione(String mansione) {
		this.mansione = mansione;
	}
	
	public String getMansione() {
		return this.mansione;
	}
}
