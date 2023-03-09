package it.softwareinside.ereditarieta;

public class Persona {
	private String nome;
	private int eta;
	
	public Persona() {
		this("N/A", 18);
	}
	
	public Persona(String nome, int eta) {
		setNome(nome);
		setEta(eta);
	}
	
	@Override
	public String toString() {
		return "Persona [ Nome: " + nome + ", Età: " + eta + " ]";
	}
	
	public void saluta() {
		System.out.println("Ciao mi chiamo " + nome + " e ho " + eta + " anni.");
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEta(int eta) {
		this.eta = eta >= 0? eta : -eta;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getEta() {
		return this.eta;
	}
}
