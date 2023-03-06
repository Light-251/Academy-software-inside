package it.softwareinside.esercizio2Classi;

public class StarterPC {

	public static void main(String[] args) {
		Monitor monitorObject = new Monitor("HP", 27.00, 120);
		PC pcObject = new PC("Lenovo", 1700, monitorObject);
		
		System.out.println("Monitor: " + monitorObject);
		System.out.println("PC " + pcObject);
	}

}
