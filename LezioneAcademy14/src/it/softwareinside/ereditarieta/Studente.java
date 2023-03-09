package it.softwareinside.ereditarieta;

public class Studente extends Persona{
	private String materiaStudiata;
	
	public Studente() {
		this("Studente default", 16, "materia");
	}
	
	public Studente(String nome, int eta, String materiaStudiata) {
		super("Studente default", 16);
		setMateriaStudiata(materiaStudiata);
	}
	
	@Override
	public String toString() {
		return super.toString() + "Studente [ " + materiaStudiata + " ]";
	}
	
	@Override
	public void saluta() {
		super.saluta();
		System.out.println("Studio " + materiaStudiata);
	}
	
	public void setMateriaStudiata(String materiaStudiata) {
		this.materiaStudiata = materiaStudiata;
	}
	
	public String getMateriaStudiata() {
		return materiaStudiata;
	}

}
