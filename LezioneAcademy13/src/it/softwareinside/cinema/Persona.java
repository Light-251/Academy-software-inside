package it.softwareinside.cinema;


public class Persona {
	private String nome;
	private int eta;
	
	public Persona() {
		this("Placeholder", 15);
	}
	
	
	public Persona(String nome, int eta) {
		setNome(nome);
		setEta(eta);
	}
	
	public String toString() {
		return "Persona [ Nome: " + nome
				+ " Età: " + eta + " ]";
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getEta() {
		return this.eta;
	}

}
