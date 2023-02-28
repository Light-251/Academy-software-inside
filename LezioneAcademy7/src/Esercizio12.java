/*
 * Dato un vettore stampare si se contiene almeno due elementi uguali
 */
public class Esercizio12 {
	public static void main(String[] args) {
		int[] vett = { 1,2,8,5,6,7,8};
		int cont = 0;

		int contatoreCicli=0;
		
		for (int i = 0; i < vett.length; i++) {
			contatoreCicli++;
			
			for (int j = i+1; j < vett.length; j++) {
				contatoreCicli++;
				
				if (vett[i] == vett[j] /*&& i != j*/) {
					cont++;
					break; // uscita solo dal ciclo interno
				}
			}
			if(cont >= 1)
				break;// uscita dal ciclo esterno
		}
		if (cont >= 1)
			System.out.println("si");
		else
			System.out.println("no");
		
		System.out.println("Numero cicli: " + contatoreCicli);
	}

}
