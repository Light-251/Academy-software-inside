package it.softwareinside.biblioteca.test;

import static org.junit.Assert.*;

import org.junit.Test;

import it.softwareinside.biblioteca.Libro;
import it.softwareinside.biblioteca.Rivista;

public class LibroTest {

	@Test
	public void testLibro() {
		
		Libro libro = new Libro();
		Libro libroInit = new Libro("Guerra e Pace", -1000);
		
		assertNotNull(libro);
		assertNotNull(libroInit);
		
		assertTrue(libro.getTitolo().equals("Libro-Def"));
		assertTrue(libroInit.getTitolo().equals("Guerra e Pace"));
		
		assertTrue(libro.getNumPagine() == 150);
		assertTrue(libroInit.getNumPagine() == 1000);
		
		System.out.println(libro.toString());
		System.out.println(libroInit.toString());
		
	}
	@Test
	public void testRivista() {
		
		Rivista rivistaDef = new Rivista();
		Rivista rivistaInit = new Rivista("Magazine", 60, 5);
		
		assertNotNull(rivistaDef);
		assertNotNull(rivistaInit);
		
		assertTrue(rivistaDef.getTitolo().equals("Rivista-Def"));
		assertTrue(rivistaInit.getTitolo().equals("Magazine"));
		
		assertTrue(rivistaDef.getNumPagine() == 50);
		assertTrue(rivistaInit.getNumPagine() == 60);
		
		System.out.println(rivistaDef.toString());
		System.out.println(rivistaInit.toString());
		
	}

}
