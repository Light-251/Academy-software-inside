package it.softwareinside;

public class Esercizi {
	/*
	 * prendere in ingresso un vett di booleani wrapper ritorna t se il numero di
	 * true > false
	 */
	public boolean maggioriTrue(Boolean[] vett) {
		int cont = 0;

		for (Boolean boolean1 : vett) {
			if (boolean1)
				cont++;

		}
		return cont > (vett.length / 2) ? true : false;
	}

	/**
	 * Prendere in ingresso un vett di String e una stringa Ritorna il numero di
	 * ricorrenze della stringa nel vettore
	 * 
	 * @param vett
	 * @param parola
	 * @return
	 */
	public int contaRicorrenze(String[] vett, String parola) {
		int cont = 0;
		for (String elemento : vett) {
			if (elemento.equals(parola))
				cont++;
		}
		return cont;
	}

	/**
	 * due vett double ingresso ritornare il vett di double che contiene la
	 * produttoria più alta
	 */
	public double[] produttoriaMax(double[] vett1, double[] vett2) {
		double prodVett1 = produttoria(vett1);
		double prodVett2 = produttoria(vett2);

		return prodVett1 > prodVett2 ? vett1 : vett2;
	}

	public double produttoria(double[] vett) {
		double prod = 1;
		for (double d : vett) {
			prod *= d;
		}
		return prod;
	}

	/*
	 * in inp un vettore di char e un int, torna true se nel vett sono presenti un
	 * numero di vocali >= del numero inserito
	 */
	public boolean isVocalsMore(int numero, char[] vett) {
		int cont = 0;
		for (char elemento : vett) {
			if (isVocal(elemento))
				cont++;
		}
		if (cont >= numero)
			return true;
		return false;
	}

	public boolean isVocal(char lettera) {
		if (lettera == 'a' || lettera == 'e' || lettera == 'i' || lettera == 'o' || lettera == 'u')
			return true;
		return false;
	}

	/*
	 * prendere in ingresso due str e ritornare una stringa che è nel seguente modo:
	 * -> ciao -> bell -> ceal
	 * 
	 * se non hanno la stessa dimensione lanciare un'eccezione
	 * 
	 */
	public String combinaStringhe(String parola1, String parola2) throws IllegalArgumentException {
		if (parola1.length() != parola2.length())
			throw new IllegalArgumentException();

		String ris = "";
		for (int i = 0; i < parola1.length(); i++)
			if (i % 2 == 0)
				ris += parola1.charAt(i);
			else
				ris += parola2.charAt(i);

		return ris;
	}

	/*
	 * vett di string in inrgesso, ritorna un vett di stringhe scambiando quello che
	 * era in posizione pari con le pos dispari
	 * 
	 * ciao, miao, gatto, carino --> miao, ciao, carino, gatto
	 */
	public String[] scambiaParole(String[] vett) {
		String[] ris = new String[vett.length];

		for (int i = 0; i < vett.length; i++) {
			if (i % 2 == 0)
				ris[i] = vett[i + 1];
			else
				ris[i] = vett[i - 1];
		}

		return ris;
	}

	/*
	 * Data una matrice fare la produttoria solo delle colonne
	 */
	public double produttoriaColonne(double[][] matrix) {
		double prod = 1;

		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				if (j % 2 == 0)
					prod *= matrix[i][j];

		return prod;
	}
}
