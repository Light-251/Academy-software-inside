package it.softwreinside.esercizi.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import it.softwreinside.esercizi.Esercizi;

public class EserciziTest {

	@Test
	public void test() {
		Esercizi es = new Esercizi();
		ArrayList<Integer> arrayGiusto = new ArrayList<>();
		ArrayList<Integer> arraySbagliato = new ArrayList<>();
		
		for (int i = 1; i <= 9; i++)
			for (int j = 0; j < 3; j++)
				arrayGiusto.add(i);
		
		for (int i = 1; i <= 9; i++)
			for (int j = 0; j < 3; j++)
				arraySbagliato.add(3);

		assertTrue(es.isSequenzePerfect(arrayGiusto));
		assertFalse(es.isSequenzePerfect(arraySbagliato));
		
		System.out.println(arrayGiusto + " size " + arrayGiusto.size());
		System.out.println("\n " + es.isSequenzePerfect(arrayGiusto));
		
		System.out.println(arraySbagliato + " size " + arraySbagliato.size());
		System.out.println("\n " + es.isSequenzePerfect(arraySbagliato));
	}

}
