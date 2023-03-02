package it.softwareinside.object;

public class StarterFunzione {

	public static void main(String[] args) {

		EserciziFunzione obj = new EserciziFunzione();
		int ris;

		// SOMMA
		ris = obj.somma(3, 5);
		System.out.println("Somma:" + ris);

		// DOPPIO
		ris = obj.doppioInt(5);
		System.out.println("Doppio:" + ris);

		// PARI
		System.out.println("NuemeroPari:");
		boolean numeroPari = obj.isEven(8);
		System.out.println(numeroPari);

		numeroPari = obj.isEven2(7);
		System.out.println(numeroPari);

		String parolaInserita = "ala";
		int numeroLettere = obj.numeroLettereA(parolaInserita);
		System.out.println(numeroLettere);

		System.out.println("Vettore Doppio:");
		// RADDOPPIA VETTORE
		int[] vettEsempio = { 2, 4, 7 };
		int[] vettDoppio = obj.raddoppiaVettore(vettEsempio);

		for (int i = 0; i < vettEsempio.length; i++) {
			System.out.print(vettEsempio[i] + " ");
		}
		System.out.println();
		
		obj.stampaVettore(vettDoppio);
		
//		for (int i = 0; i < vettDoppio.length; i++) {
//			System.out.print(vettDoppio[i] + " ");
//		}

	}

}
