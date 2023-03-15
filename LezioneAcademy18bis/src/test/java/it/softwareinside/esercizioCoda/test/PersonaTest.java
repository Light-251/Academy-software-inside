package it.softwareinside.esercizioCoda.test;

import static org.junit.Assert.*;
import org.junit.Test;
import it.softwareinside.esercizioCoda.Coda;
import it.softwareinside.esercizioCoda.CodaConPriorita;
import it.softwareinside.esercizioCoda.Persona;

public class PersonaTest {

	@Test
	public void test() {
		
		Persona persona = new Persona();
		Persona personaInit = new Persona("Bianchi", 20);
		
		assertNotNull(persona);
		assertNotNull(persona.getCognome());
		assertNotNull(persona.getEta());
		
		assertNotEquals(personaInit.getCognome(), persona.getCognome());
		
	}
	
	@Test
	public void testACoda() {
		Coda coda = new Coda();
		Persona persona = new Persona();
		Coda codaPrior = new CodaConPriorita();
		
		codaPrior.getPersone().add(new Persona("A", 25));
		codaPrior.getPersone().add(new Persona("B", 24));
		codaPrior.getPersone().add(new Persona("C", 25));
		codaPrior.getPersone().add(new Persona("D", 65));
		codaPrior.getPersone().add(new Persona("E", 45));
		
		System.out.println(codaPrior);
		
		
		System.out.println("Ho rimosso: " + codaPrior.restituisciProssimo());
		
		System.out.println(codaPrior);
		
		
		assertNotNull(coda.getPersone());
		coda.aggiungiPersona(persona);
		coda.restituisciProssimo();
		
		
	}

}
