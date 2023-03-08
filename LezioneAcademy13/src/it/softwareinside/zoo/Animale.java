package it.softwareinside.zoo;

public class Animale {
	private String specie;
	private int eta;
	private char sesso;
	
	public Animale() {
		this("Placeholder", 0, 'm');
	}

	public Animale(String specie, int eta, char sesso) {
		setSpecie(specie);
		setEta(eta);
		setSesso(sesso);
	}
	
	@Override
	public String toString() {
		return "Animale [ Specie: " + specie
				+ " Età: " + eta
				+ " Sesso: " + sesso
				+ " ]";
	}
	
	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public void setEta(int eta) {
		this.eta = eta > 0 ? eta : 1;
	}

	public void setSesso(char sesso) {
		this.sesso = sesso == 'f' || sesso == 'm' ? sesso : 'm';
	}

	public String getSpecie() {
		return specie;
	}

	public int getEta() {
		return eta;
	}
	
	public char getSesso() {
		return sesso;
	}

}
