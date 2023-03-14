package it.softwreinside.esercizi;

import java.util.ArrayList;

public class Esercizi {
	public boolean isSequenzePerfect(ArrayList<Integer> array) {

		if (array.size() != 27)
			return false;

		for (int i = 1; i <= 9; i++)
			if (!isNumberRepeated(i, array))
				return false;

		return true;

	}

	public boolean isNumberRepeated(int numero, ArrayList<Integer> array) {
		int cont = 0;
		for (int i = 0; i < array.size(); i++)
			if (array.get(i) == numero)
				cont++;

		if (cont == 3)
			return true;
		else {
			return false;
		}

	}

}
