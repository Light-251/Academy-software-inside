package it.softwareinside.biblioteca.test;

import static org.junit.Assert.*;

import it.softwareinside.biblioteca.Libro;
import it.softwareinside.biblioteca.Rivista;
import it.softwareinside.biblioteca.Utente;

public class Test {

	@org.junit.Test
	public void test() {
		Utente utente = new Utente("Mario Rossi", 600);
		Libro libro1 = new Libro("1", 150);
		Libro libro2 = new Libro("2", 170);
		Libro libro3 = new Libro("3", 250);
		Rivista rivista = new Rivista("riv", 180,3);
		
		assertTrue(utente.prendiInPrestito(libro1));
		assertTrue(utente.prendiInPrestito(libro2));
		assertTrue(utente.prendiInPrestito(libro3));
		
		assertFalse(utente.prendiInPrestito(rivista));
	}

}
