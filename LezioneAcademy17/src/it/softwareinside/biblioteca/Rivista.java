package it.softwareinside.biblioteca;

public class Rivista extends Libro {
	private int numero;
	
	public Rivista() {
		this("Rivista-Def", 50, 0);
	}
	
	public Rivista(String titolo, int numPagine, int numero) {
		super(titolo, numPagine);
		setNumero(numero);
	}

	@Override
	public String toString() {
		return super.toString() + "; Rivista: Numero: " + this.numero;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
