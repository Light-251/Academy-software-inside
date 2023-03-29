package it.softwareinside;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class FunzioniTest2 {

	@Test
	public void test() {
		Esercizi es = new Esercizi();

		Boolean[] vett = { true, false, false, true };

		assertFalse(es.maggioriTrue(vett));

		Boolean[] vett2 = { true, true, false };

		assertTrue(es.maggioriTrue(vett2));
	}

	@Test
	public void testStringhe() {
		Esercizi es = new Esercizi();

		String s1 = "ceal";
		String s2 = "bilo";

		assertEquals(es.combinaStringhe(s1, s2), "ciao");
		System.out.println(es.combinaStringhe(s1, s2));

		String[] vettString = { "ciao", "miao", "gatto", "carino" };
		System.out.println(Arrays.toString(es.scambiaParole(vettString)));
	}

	@Test
	public void testmatrice() {
		Esercizi es = new Esercizi();

		double[][] matrice = { { 1, 2, 3 }, { 3, 2, 1 }, { 1, 2, 3 } };
		assertTrue(27 == es.produttoriaColonne(matrice));

	}

}
