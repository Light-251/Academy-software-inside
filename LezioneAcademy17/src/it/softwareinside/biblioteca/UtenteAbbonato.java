package it.softwareinside.biblioteca;

public class UtenteAbbonato extends Utente {

	public UtenteAbbonato() {
		this("Abbonato-Def", 700);
	}

	public UtenteAbbonato(String nome, int maxPagineInPrestito) {
		super(nome, maxPagineInPrestito);
	}

	@Override
	public String toString() {
		return super.toString() + " Abbonato.";
	}

	/**
	 * Ignora il limite delle pagine solo per le riviste
	 */
	@Override
	public boolean prendiInPrestito(Libro libro) {
		if (libro == null)
			return false;

		if (!(libro instanceof Rivista))
			return super.prendiInPrestito(libro);

		this.getLibriInPrestito().add(libro);
		return true;
	}

	/*
	 * Contatore delle pagine che ignora le pagine delle riviste
	 * 
	 */
	@Override
	public int contaPagineInPrestito() {
		int pagineTotali = 0;

		for (Libro libro : super.getLibriInPrestito())
			if (!(libro instanceof Rivista))
				pagineTotali += libro.getNumPagine();

		return pagineTotali;

	}

}
