//Sommatoria degli elementi da 1 a 10
public class EsCicli5 {

	public static void main(String[] args) {
		int i = 0, somma = 0;

		while (i <= 10) {
			System.out.println(somma + " + " + i);

			somma += i;
			i++;
		}
		System.out.println("Somma totale: " + somma);
	}

}
