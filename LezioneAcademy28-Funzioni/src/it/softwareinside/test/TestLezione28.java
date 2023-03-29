package it.softwareinside.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Test;

import it.softwareinside.Funzioni;

public class TestLezione28 {

	@Test
	public void testFunzione1() {
		Funzioni f = new Funzioni();
		String parola1 = "ciao";
		String parola2 = "ciaoc";

		assertFalse(f.lastEqualsFirst(parola1));
		assertTrue(f.lastEqualsFirst(parola2));
	}

	@Test
	public void testFunzione2() {
		Funzioni f = new Funzioni();
		String parola = "ciao";
		System.out.print("Funzione 2 -> ");
		System.out.println(f.moltiplicaStringa(parola, 4));
	}

	@Test
	public void testFunzione3() {
		Funzioni f = new Funzioni();
		int[] vett = { 10, 2, 5, 4 };

		int[] ris = f.sottraiAggiungi(vett, 4);
		System.out.print("Funzione 3 -> ");
		System.out.println(Arrays.toString(ris));
	}

	@Test
	public void testFunzione4() {
		Funzioni f = new Funzioni();
		System.out.print("Funzione 4 -> ");
		System.out.println(f.approssimazioneDiStirling(5));
	}

	@Test
	public void testFunzione5() {
		Funzioni f = new Funzioni();
		
		String parola = "abcd";
		assertFalse(f.equalLetters(parola));
		
		parola = "abacada";
		assertTrue(f.equalLetters(parola));
	}

}
