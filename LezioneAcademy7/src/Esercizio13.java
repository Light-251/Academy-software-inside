
/*
 * Dato un vettore di char, stampare tutto il vettore
 */
public class Esercizio13 {

	public static void main(String[] args) {
		char[] vettChar = { 'c', 'i', 'a', 'o' };

		// CICLO FOR
		for (int i = 0; i < vettChar.length; i++) {
			System.out.print(vettChar[i]);
		}
		System.out.println();
		
		// CICLO WHILE
		int i=0;
		while(i<vettChar.length) {
			System.out.print(vettChar[i]);
			i++;
		}
		System.out.println();
		i=0;
		
		// CICLO DO-WHILE
		do {
			System.out.print(vettChar[i]);
			i++;
		}while(i<vettChar.length);
	}

}
