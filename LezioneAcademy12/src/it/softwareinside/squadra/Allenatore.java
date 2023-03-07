package it.softwareinside.squadra;

public class Allenatore {

	private String nome;
	private int anniExp;

	public Allenatore(String nome, int anniExp) {
		setNome(nome);
		setAnniExp(anniExp);
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " Anni di eseperienza: " + anniExp;
	}

	public Allenatore() {
		this("Nome default", 10);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAnniExp(int anniExp) {
		this.anniExp = anniExp > 0 ? anniExp : 0;
	}

	public String getNome() {
		return nome;
	}

	public int getAnniExp() {
		return anniExp;
	}

}
