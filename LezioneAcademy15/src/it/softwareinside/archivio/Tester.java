package it.softwareinside.archivio;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tester {

	@Test
	public void testDocumento() {

		Documento documento = new Documento("ciao");

		assertEquals(documento.getTesto(), "ciao"); // Ritorna vero se i due oggetti (in questo caso stringhe) sono uguali
		
		
//		assertEquals(documento.calcolaQualita(), (1.0/5), 0.5);
		assertTrue(documento.calcolaQualita() == 1.0 / 5);
	}
	@Test
	public void testDocumentoPrioritario() {
		DocumentoPrioritario documento = new DocumentoPrioritario("ciao", 3);
		
		assertTrue(documento.calcolaQualita() == (1.0/5) + 3); // Ritorna vero se la condizione è vera
	}
	
	@Test
	public void testArchivio() {
		Archivio archivio = new Archivio();
		
		assertNotNull(archivio.getDocumenti()); // Ritorna vero se l'oggetto non è nullo
	}

}
