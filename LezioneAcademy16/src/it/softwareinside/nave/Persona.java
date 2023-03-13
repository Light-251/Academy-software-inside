package it.softwareinside.nave;

public class Persona {
	private int eta;
	private String nome;
	
	public Persona() {
		this("PersonaDefault", 18);
	}
	
	public Persona(String nome, int eta) {
		setNome(nome);
		setEta(eta);
	}
	
	@Override
	public String toString() {
		return "Persona, Nome: " + this.nome + " Età: " + this.eta;
	}

	public void setEta(int eta) {
		this.eta = eta > 0 ? eta : -eta;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEta() {
		return this.eta;
	}

	public String getNome() {
		return this.nome;
	}
}
