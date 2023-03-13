package it.softwareinside.nave;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNave {

	@Test
	public void testPersona() {
		Persona persona = new Persona();
		Capitano capitano = new Capitano();
		PersonaleDiBordo personaleDiBordo = new PersonaleDiBordo();
		Passeggero passeggero = new Passeggero();
		Nave nave = new Nave();

		assertNotNull(persona);
		assertNotNull(capitano);
		assertNotNull(personaleDiBordo);
		assertNotNull(passeggero);
		assertNotNull(nave.getPersoneABordo());

		Passeggero passeggero2 = new Passeggero("Mario", 3, "A-010");
		assertFalse(nave.addPasseggero(passeggero2));
		

		for (int i = 0; i < 30; i++)
			nave.addPasseggero(new Passeggero());

		assertFalse(nave.addPasseggero(null));
		
		assertFalse(nave.addCapitano(new Capitano("Mario", 25, 1)));
		assertTrue(nave.addCapitano(new Capitano("Luigi", 45, 15)));
		assertTrue(nave.addPersonaleDiBordo(personaleDiBordo));
		assertTrue(nave.addPersonaleDiBordo(new PersonaleDiBordo()));
		assertFalse(nave.addPersonaleDiBordo(new PersonaleDiBordo()));

		System.out.println(nave);
		nave.removeAll();
		System.out.println("____________________");
//		assertEquals(nave.getPersoneABordo().size(), 0);
		System.out.println(nave);
		System.out.println(nave.getPersoneABordo().size());

	}

}
