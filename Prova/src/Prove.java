import java.util.Scanner;

public class Prove {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci un numero");
		int num = scanner.nextInt();
		scanner.close();

		int i = 0, j = 0;
		while (i < num) {
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			j = 0;
		}

	}

}
