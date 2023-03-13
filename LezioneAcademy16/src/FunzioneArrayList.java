import java.util.ArrayList;

public class FunzioneArrayList {

	/*
	 * creare una funzione che prende in ingresso un arraylist di interi e un numero
	 * e restituisce la somma di tutti gli elementi che sono multipli dell'elemento
	 * inserito
	 */
	public int sommaMultipliArrayList(ArrayList<Integer> array, int valore) {
		int somma = 0;

		for (Integer elemento : array)
			if (elemento % valore == 0)
				somma += elemento;
		return somma;
	}

	/*
	 * creare una funzione che prenda in ingresso un arratlist di double e ritorna
	 * il prodotto in double di tutti gli elementi dell'arraylist
	 */
	public double prodottoValori(ArrayList<Double> array) {
		double prodotto = 1;

		for (Double elemento : array)
			prodotto *= elemento;

		return prodotto;
	}

	/*
	 * prendere in input un AL di interi e ritornare un valore booleano; t se tutti
	 * gli elementi sono pari, altrimenti f
	 */
	public boolean controlloPari(ArrayList<Integer> array) {

		for (Integer elemento : array)
			if (elemento % 2 != 0)
				return false;

		return true;

	}

	/*
	 * prendere in ingresso un AL di double e un double compreso tra 0 e 1 se il
	 * numero non è compreso nel range indicato il programma ritorna null altrimenti
	 * ritorna un AL dove ogni elemento viene moltiplicato per il valore inserito
	 * 
	 */
	public ArrayList<Double> moltiplicaPerDouble(ArrayList<Double> array, double valore) {
		if (valore < 0 || valore > 1)
			return null;

		ArrayList<Double> arrayRis = new ArrayList<>();

		for (int i = 0; i < array.size(); i++)
			arrayRis.add(array.get(i) * valore);

		return arrayRis;

	}

	/*
	 * prendere in ingresso un AL di interi e ritorna true se il vettore è formato
	 * da soli elementi primi
	 * 
	 * ES di numero primo 1,3,5,7 un numero primo ha al massimo 2 divisori
	 */
	public boolean isPrimeNumber(int numeroDaControllare) {
		int contDivisori = 0;

		for (int i = 1; i < numeroDaControllare /2 ; i++) {
			if (numeroDaControllare % i == 0)
				contDivisori++;

			if (contDivisori > 2)
				return false;
		}

		return true;

	}

	public boolean controlloVettorePrimo(ArrayList<Integer> array) {
		for (Integer elemento : array)
			if (!(isPrimeNumber(elemento)))
				return false;

		return true;
	}

}
