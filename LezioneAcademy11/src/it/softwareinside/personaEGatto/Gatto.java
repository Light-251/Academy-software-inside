package it.softwareinside.personaEGatto;

public class Gatto {
	private String nome, colore;
	private int eta;
	
	public Gatto() {
		setNome("Gatto");
		setColore("Nero");
		setEta(0);
		
	}
	
	public Gatto(String nome, String colore, int eta) {
		setNome(nome);
		setColore(colore);
		setEta(eta);
	}
	
	
	// toString
	@Override
	public String toString() {
		return "Gatto [ Nome: " + nome
				+ " Colore: " + colore
				+ " Età: " + eta
				+ " ]";
	}
	
	//set
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public void setEta(int eta) {
		this.eta = eta;
	}
	//get
	
	public String getNome() {
		return nome;
	}
	
	public String getColore() {
		return colore;
	}
	
	public int getEta() {
		return eta;
	}
	
	

}
