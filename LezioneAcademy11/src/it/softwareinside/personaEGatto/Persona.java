package it.softwareinside.personaEGatto;

public class Persona {
	String nome;
	int eta;
	Gatto gatto;
	
	public Persona() {
		setNome("Mario");
		setEta(26);
		setGatto(new Gatto());
	}
	
	public Persona(String nome, int eta, Gatto gatto) {
		setNome(nome);
		setEta(eta);
		setGatto(gatto);
	}
	
	
	@Override
	public String toString() {
		return "Persona [ Nome: " + nome
				+ " Età: " + eta
				+ " Gatto: " + gatto
				+ " ]";
	}
	
	//set
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public void setGatto(Gatto gatto) {
		this.gatto = gatto;
	}
	//get
	public String getNome() {
		return nome;
	}
	
	public int getEta() {
		return eta;
	}
	
	public Gatto getGatto() {
		return gatto;
	}

}
