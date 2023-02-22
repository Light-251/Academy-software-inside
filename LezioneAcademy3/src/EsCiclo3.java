// Stampare i numeri pari da 2 a 30
public class EsCiclo3 {

	public static void main(String[] args) {
		int i = 1;
		while(i <= 30) {
			
			if(i % 2 == 0)
				System.out.println(i);
			
			i++;
		}
		
		System.out.println("-------------------");
		// SOLUZIONE 2
		int j = 2;
		while(j<=30) {
			System.out.println(j);
			
			j++;
		}
	}

}
