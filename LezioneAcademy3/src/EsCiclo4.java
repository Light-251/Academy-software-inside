// Stampare conto alla rovescia, quando arriva 0 scrive buon anno
public class EsCiclo4 {

	public static void main(String[] args) {
		int i = 10;
		while(i > 0) {
			System.out.print(i + ", ");
			
			i--;
		}
		System.out.println("Buon anno!!");
		
		System.out.println("Seconda soluzione");
		int j = 10;
		while(j >= 0) {
			
			if(j > 0)
				System.out.print(j + " ");
			else 
				System.out.print("Buon anno");
			j--;
				
		}
		
	}

}
