package it.softwareinside.bevanda;

public class Scaffale {
	
	private Bevanda[] bevande;
	
	public Scaffale(Bevanda[] bevande) {
		this.bevande = bevande;
		
	}
	
	public Scaffale(int dimensione) {
		this.bevande = new Bevanda[dimensione];
	}
	
	public Scaffale() {
		this(new Bevanda[5]);
	}
	
	
//	@Override
//	public String toString() {
//		return "Bevande: " + bevande;
//	}
	
	public void stampaBevande() {
		for(Bevanda bevanda : bevande)
			System.out.println(bevanda);
	}
	
	public boolean addBevanda(Bevanda bevanda) {
		for (int i = 0; i < bevande.length; i++) {
			if(bevande[i] == null) {
				bevande[i] = bevanda;
				return true;
			}
			
		}
		return false;
	}
	
	public void setBevande(Bevanda[] bevande) {
		this.bevande = bevande;
	}
	
	public Bevanda[] getBevande() {
		return bevande;
	}

}
