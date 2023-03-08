package it.softwareinside.cinema;


public class Cinema {
	private String nome;
	private Film[] pellicole;
	private Persona[] clienti;

	public Cinema() {
		this("Cinema Standard");
	}

	public Cinema(String nome) {
		setNome(nome);
		pellicole = new Film[5];
		clienti = new Persona[10];
	}

	@Override
	public String toString() {
		String risFilm = "", risPersona = "";

		for (Film Pellicola : pellicole)
			risFilm += Pellicola + "\n";
		for (Persona cliente : clienti)
			risPersona += cliente + "\n";

		return "Cinema [ Nome: " + nome + " Film: \n" + risFilm + " Clienti: \n" + risPersona + " ]";
	}

	public boolean addPersonaAlFilm(Persona persona, Film film) {
		if (persona != null && film != null && persona.getEta() >= film.getEtaMinima()) {
			addPersona(persona);
			return true;
		}
		return false;

	}

	/**
	 * Aggiunge un film al vettore nel primo posto libero
	 * 
	 * @param film
	 * @return
	 */
	public boolean addFilm(Film film) {
		if (film == null)
			return false;

		for (int i = 0; i < pellicole.length; i++)
			if (pellicole[i] == null) {
				pellicole[i] = film;
				return true;
			}

		return false;
	}

	public boolean addPersona(Persona persona) {
		if (persona == null)
			return false;
		for (int i = 0; i < clienti.length; i++) {
			if (clienti[i] == null) {
				clienti[i] = persona;
				return true;
			}
		}

		return false;
	}

	/**
	 * Rimuove un film dal vettore specificando l'indice
	 * 
	 * @param index
	 * @return
	 */
	public Film removeFilm(int index) {
		if (index < 0 || index >= pellicole.length)
			return null;

		Film filmDaRimuovere = pellicole[index];
		pellicole[index] = null;
		return filmDaRimuovere;
	}

	/**
	 * Rimuove tutte le persone dal vettore
	 */
	public void removeTutteLePersone() {
		for (int i = 0; i < clienti.length; i++) {
			clienti[i] = null;

		}
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setFilms(Film[] pellicole) {
		this.pellicole = pellicole;
	}

	public void setClienti(Persona[] clienti) {
		this.clienti = clienti;
	}

	public String getNome() {
		return this.nome;
	}

	public Film[] getPellicole() {
		return this.pellicole;
	}

	public Persona[] getClienti() {
		return this.clienti;
	}

}
