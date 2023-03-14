package it.softwareinside.biblioteca.test;

import static org.junit.Assert.*;

import org.junit.Test;

import it.softwareinside.biblioteca.Libro;
import it.softwareinside.biblioteca.Rivista;
import it.softwareinside.biblioteca.Utente;
import it.softwareinside.biblioteca.UtenteAbbonato;

public class UtenteTest {

//	@Test
	public void testUtente() {
		Utente utenteDef = new Utente();
		Utente utenteInit = new Utente("Luca", 350);
		
		
		assertNotNull(utenteDef);
		assertNotNull(utenteInit);
		
		assertTrue(utenteDef.getNome().equals("Utente-Def"));
		assertTrue(utenteInit.getNome().equals("Luca"));
		
		assertTrue(utenteDef.getMaxPagineInPrestito() == 200);
		assertTrue(utenteInit.getMaxPagineInPrestito() == 350);
		
		assertNotNull(utenteDef.getLibriInPrestito());
		assertNotNull(utenteInit.getLibriInPrestito());
		
		// PRENDI IN PRESTITO
		assertTrue(utenteDef.prendiInPrestito(new Libro()));
		assertFalse(utenteInit.prendiInPrestito(new Libro("It", 500)));
		assertTrue(utenteInit.prendiInPrestito(new Libro("Cujo", 60)));
		
		// CONTA PAGINE
		assertEquals(utenteInit.contaPagineInPrestito(), 60);
		
		// RESTITUISCI LIBRO
		assertNotNull(utenteInit.restituisciLibro());
		
		assertNull(utenteInit.restituisciLibro());
		
		System.out.println(utenteDef);
		System.out.println(utenteInit);
		
		
		
		
		
	}
	
	@Test
	public void testUtenteAbbonato() {
		
		UtenteAbbonato abbonato = new UtenteAbbonato();
		
		assertNotNull(abbonato.getLibriInPrestito());
		
		assertEquals(abbonato.getNome(), "Abbonato-Def");
		
		abbonato.prendiInPrestito(new Libro());
		System.out.println();
		abbonato.prendiInPrestito(new Rivista());
		assertTrue(abbonato.prendiInPrestito(new Rivista("a", 800, 5)));
		
		assertFalse(abbonato.prendiInPrestito(new Libro("ddd", 800)));
		System.out.println(abbonato);
		
	}

}
