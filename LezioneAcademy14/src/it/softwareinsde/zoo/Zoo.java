package it.softwareinsde.zoo;

public class Zoo {
	private final static int NUMERO_MASSIMO_ANIMALI = 10;

	private String nome;
	private Animale[] animali;

	public Zoo() {
		this("Zoo default");

	}

	public Zoo(String nome) {
		setNome(nome);
		setAnimale(new Animale[NUMERO_MASSIMO_ANIMALI]);
	}

	/**
	 * Stampa i versi di tutti gli animali presenti nel vettore
	 */
	public void stampaZoo() {
		
		for (Animale animale : this.animali) {
			if (animale != null) {
				animale.saluta();
			}
//			System.out.println();
		}
	}

	/**
	 * Rimuove un animale dal vettore specificando l'indice di un vettore se
	 * l'indice non rientra nella banda del vettore ritorna null
	 * 
	 * @param index
	 * @return
	 */
	public Animale removeAnimale(int index) {
		if (index < 0 || index >= this.animali.length)
			return null;

		Animale animaleDaRimuovere = this.animali[index];
		this.animali[index] = null;
		return animaleDaRimuovere;
	}

	/**
	 * 
	 * Aggiunge un animale nel primo posto libero nel vettore, altrimenti ritorna
	 * falso
	 * 
	 * @param animale
	 * @return
	 */
	public boolean addAnimale(Animale animale) {
		if (animale == null)
			return false;

		for (int i = 0; i < animali.length; i++) {
			if (animali[i] == null) {
				animali[i] = animale;
				return true;
			}
		}
		return false;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAnimale(Animale[] animali) {
		this.animali = animali;
	}

	public String getNome() {
		return this.nome;
	}

	public Animale[] getAnimali() {
		return this.animali;
	}
}
