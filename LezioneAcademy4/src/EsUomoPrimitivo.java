import java.util.Scanner;

/*
 * data una stringa inserita in input
 * dire se la striga contiene tutte vocali
 * 
 * ES: 
 */
public class EsUomoPrimitivo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Isnerisci parola");
		String parolaInserita = scanner.next();

		scanner.close();

		boolean soloVocali = true;
		int i = 0;

		while (i < parolaInserita.length()) {
			char letteraCorrente = parolaInserita.charAt(i); // Creare una variabile char è meno dispendioso di risorse in questo caso
			if (letteraCorrente != 'a' && letteraCorrente != 'e' && letteraCorrente != 'i'
					&& letteraCorrente != 'o' && letteraCorrente != 'u') {
				soloVocali = false;
				break;
			}

			i++;
		}

		if (soloVocali) {
			System.out.println("tu essere uomo primitivo");
		} else {
			System.out.println("ok tu essere uomo che conosce lettera");
		}

	}

}
