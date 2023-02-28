/*
 * Stampare un vettore al contrario
 */
public class UReversu {

	public static void main(String[] args) {
		
		int[] vett = { 10, 20, 30, 40 };

		int i = vett.length - 1;

		while (i >= 0) {
			System.out.println(vett[i]);

			i--;
		}
		
	}

}
