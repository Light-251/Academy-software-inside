import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestFunzioni {

	@Test
	public void testMoltiplicaPerDouble() {
		FunzioneArrayList funzione = new FunzioneArrayList();
		
		ArrayList<Double> arrayTest = new ArrayList<>();
		arrayTest.add(10.0);
		arrayTest.add(20.0);
		arrayTest.add(50.10);
		
		assertNotNull(funzione.moltiplicaPerDouble(arrayTest, 0.5));
		
//		System.out.println(funzione.moltiplicaPerDouble(arrayTest, 0.5));
		
		assertNull(funzione.moltiplicaPerDouble(arrayTest, 1.1));		
	}
	
	@Test
	public void testArrayPrimo() {
		FunzioneArrayList funzione = new FunzioneArrayList();
		
		ArrayList<Integer> arrayTest = new ArrayList<>();
		arrayTest.add(1);
		arrayTest.add(3);
		arrayTest.add(4);
		
		assertTrue(funzione.isPrimeNumber(4));
		
		assertTrue(funzione.controlloVettorePrimo(arrayTest));
	}

}
