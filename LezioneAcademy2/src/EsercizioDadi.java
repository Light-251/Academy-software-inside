import java.util.Random;

/**
 * Silmulare il lancio di un dado a 6 facce da 1 a 6
 * stampare il risultato
 * @author SLP
 *
 */
public class EsercizioDadi {

	public static void main(String[] args) {
		Random random = new Random();
		int numeroDado = random.nextInt(6)+1;
		
		System.out.println("Il risultato è: " + numeroDado);
		
	}

}
