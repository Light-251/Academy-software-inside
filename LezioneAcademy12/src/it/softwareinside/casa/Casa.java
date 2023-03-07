package it.softwareinside.casa;

public class Casa {
	private Cucina cucina;
	private Sala sala;
	
	public Casa(Cucina cucina, Sala sala) {
		setCucina(cucina);
		setSala(sala);
	}
	
	public Casa() {
		this(new Cucina(), new Sala());
	}

	public void setCucina(Cucina cucina) {
		this.cucina = cucina;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Cucina getCucina() {
		return cucina;
	}

	public Sala getSala() {
		return sala;
	}
	
	public double calcolaAreaTotale() {
		double areaTotale = cucina.getDimensioni().calcolaArea() + 
							sala.getDimensioni().calcolaArea();
		
		return areaTotale;
	}

}
