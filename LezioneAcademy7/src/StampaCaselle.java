/*
 * Dato un vettore di Stringhe già inizializzato
 * stampare tutte le stringhe che si trovano in una posizione pari del vettore
 */
public class StampaCaselle {

	public static void main(String[] args) {
		String[] vett = new String[] { "ciao", "mario", "rossi", "bello", "prova" };

		int i = 0;

		while (i < vett.length) {
			if (i % 2 == 0)
				System.out.print(vett[i] + ", ");

			i++;
		}

		System.out.println("\n------------------");
		// versione 2  (metà dei cili)
		i = 0;
		while (i < vett.length) {
			System.out.print(vett[i] + ", ");

			i += 2;
		}
	}

}
