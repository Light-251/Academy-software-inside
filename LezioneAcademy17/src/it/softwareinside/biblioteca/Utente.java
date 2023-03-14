package it.softwareinside.biblioteca;

import java.util.ArrayList;

public class Utente {
	private String nome;
	private int maxPagineInPrestito;
	private ArrayList<Libro> libriInPrestito;

	public Utente() {
		this("Utente-Def", 200);
	}

	public Utente(String nome, int maxPagineInPrestito) {
		setNome(nome);
		setMaxPagineInPrestito(maxPagineInPrestito);
		libriInPrestito = new ArrayList<>();
	}

	public ArrayList<Libro> getLibriInPrestito() {
		return libriInPrestito;
	}

	public void setLibriInPrestito(ArrayList<Libro> libriInPrestito) {
		this.libriInPrestito = libriInPrestito;
	}

	@Override
	public String toString() {
		String ris = "";
		int cont = 0;
		
		for(Libro libro : libriInPrestito) {
			ris += cont + " - " + libro + "\n";
			cont++;
		}

		return "Utente: Nome: " + this.nome + ", Max Pagine:" + this.maxPagineInPrestito + 
				", Libri presi in prestito:\n" + ris;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMaxPagineInPrestito(int maxPagineInPrestito) {
		this.maxPagineInPrestito = maxPagineInPrestito;
	}

	public String getNome() {
		return this.nome;
	}

	public int getMaxPagineInPrestito() {
		return this.maxPagineInPrestito;
	}

	/**
	 * Aggiunge un libro nell'AL se il numero di pagine non supera il numero massimo
	 * di pagine che l'utente può prendere in prestito
	 * 
	 * @param libro
	 * @return
	 */
	public boolean prendiInPrestito(Libro libro) {
		if (libro == null || libro.getNumPagine() + contaPagineInPrestito() > maxPagineInPrestito)
			return false;

		this.libriInPrestito.add(libro);
		return true;
	}

	/**
	 * Conta quante pagine ha già preso in prestito l'utente
	 * 
	 * @return
	 */
	public int contaPagineInPrestito() {
		int pagineTotali = 0;

		for (int i = 0; i < libriInPrestito.size(); i++)
			pagineTotali += libriInPrestito.get(i).getNumPagine();

		return pagineTotali;

	}
	
	/**
	 * Rimuove il Libro alla posizione 0 dell'AL
	 * Se non ci sono Libri ritorna null
	 * 
	 * @return
	 */
	public Libro restituisciLibro() {
		if(libriInPrestito.size() == 0) // this.libriInPrestito.isEmpty() 
			return null;
		
		Libro libroTmp = libriInPrestito.get(0);
		libriInPrestito.remove(0);
		return libroTmp;
	}

}
