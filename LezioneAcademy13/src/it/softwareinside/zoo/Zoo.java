package it.softwareinside.zoo;

public class Zoo {
	private String nome;
	private Animale[] animali;

	public Zoo() {
		this("Zoo def", new Animale[10]);
	}

	public Zoo(String nome, Animale[] animali) {
		setNome(nome);
		setAnimale(animali);
	}

	/**
	 * Stampa il vettore animali
	 */
	public void stampaAnimali() {
		for (Animale animale : animali)
			System.out.println(animale);

	}

	@Override
	public String toString() {
		String ris = "";
		for (Animale animale : animali)
			ris += animale + "\n";

		return "Zoo [ Nome: " + nome + ", Animali: \n" + ris + " ]";
	}

	/**
	 * Aggiunge un animale nella prima posizione libera del vettore
	 * @param animale
	 * @return
	 */
	public boolean addAnimale(Animale animale) {
		if (animale == null)
			return false;

		for (int i = 0; i < animali.length; i++)
			if (animali[i] == null) {
				
				if(animale.getSpecie().equals("leone") && animale.getSesso() == 'm' && lionExist())
					return false;
				
				animali[i] = animale;
				return true;
			}

		return false;
	}

	/**
	 * Controlla se nel vettore esiste già un leone maschio
	 * 
	 * @return
	 */
	public boolean lionExist() {
		for (Animale animale : animali) {
			
			if(animale == null)
				continue;
			
			if (animale.getSpecie().equals("leone") && animale.getSesso() == 'm')
				return true;
		}
		return false;
	}

	/**
	 * Rimuove un oggetto Animale nel vettore tramite indice
	 * 
	 * @param index
	 * @return
	 */
	public Animale removeAnimale(int index) {
		if (index < 0 || index >= this.animali.length)
			return null;

		Animale animaleRimosso = this.animali[index];
		this.animali[index] = null;
		return animaleRimosso;

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAnimale(Animale[] animali) {
		this.animali = animali;
	}

	public String getNome() {
		return nome;
	}

	public Animale[] getAnimali() {
		return animali;
	}
}
