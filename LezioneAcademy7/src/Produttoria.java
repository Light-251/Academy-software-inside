/*
 * Dato un vettore già init
 * stampare a video la produttoria
 */
public class Produttoria {

	public static void main(String[] args) {
		int[] vett = new int[] {3,2,6};
		int i=0, prodotto=1;
		while(i<vett.length) {
			prodotto*=vett[i];
			
			i++;
		}
		System.out.println("Il prodoto è: " + prodotto);
	}

}
