package it.softwareinside.squadra;

public class Player {

	private String nome, ruolo;
	private int eta;

	public Player(String nome, String ruolo, int eta) {
		setNome(nome);
		setRuolo(ruolo);
		setEta(eta);
	}
	
	public Player(String nome) {
		this(nome, "Riserva", 12);
	}
	
	public Player() {
		this("Nome", "Riserva", 18);
	}

	public String toString() {
		return "Nome: " + nome + " Ruolo: " + ruolo + " Età: " + eta;
	}

	public String getNome() {
		return nome;
	}

	public String getRuolo() {
		return ruolo;
	}

	public int getEta() {
		return eta;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public void setEta(int eta) {
		this.eta = eta > 12 ? eta : 12;
	}

}
