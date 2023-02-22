// usare un ciclo per stampare la produttoria degli elementi che vanno da 4 a 8 inlcusi
// Produttoria: 4*5*6*7*8
public class EsCicli6 {

	public static void main(String[] args) {
		int i = 4, prodotto = 1;
		
		while(i <= 8) {
			System.out.println("i= " + i);
			prodotto *= i;
			i++;
		}
		System.out.println("Risultato: " + prodotto);
	}

}
