package it.softwareinside.nave;

public class Capitano extends Persona {
	private int experience;
	
	public Capitano() {
		this("CapitanoDefault", 30, 5);
	}
	
	public Capitano(String nome, int eta, int experience) {
		super(nome, eta);
		setExperience(experience);
	}
	
	@Override
	public String toString() {
		return super.toString() + "; Capitano, anni di esperienza: " + experience;
	}
	
	public void setExperience(int experience) {
		this.experience = experience > 0 ? experience : 1;
	}
	
	public int getExperience() {
		return this.experience;
	}
}
