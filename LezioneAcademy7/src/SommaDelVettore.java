/**
 * 
 * Calcolare la somma totale del vettore
 * 
 * @author silvi
 *
 */
public class SommaDelVettore {
	public static void main(String[] args) {
		int[] vett = { 10, 40, 60, 100 };
		int somma = 0, i = 0;
		
		while(i<vett.length) {
			somma += vett[i];
			
			i++;
		}
		System.out.println("Somma totale: " + somma);

	}

}
