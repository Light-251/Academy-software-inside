package it.softwareinside.phone;

import java.util.Random;

public class StarterSmartphone {

	public static void main(String[] args) {
		Random random = new Random();
		Smartphone[] telefono = new Smartphone[10];

		for (int i = 0; i < telefono.length; i++) {
			telefono[i] = new Smartphone();
			telefono[i].setPrezzo(random.nextDouble(1201));
			System.out.println(i + " : " + telefono[i].getPrezzo());
		}
		
		Smartphone telMinimo = prezzoMinimo(telefono);


		System.out.println("Il prezzo minore è " + telMinimo.toString());
	}
	
	static Smartphone prezzoMinimo(Smartphone[] vettTelefono) {
		Smartphone telMinimo = vettTelefono[0];
		for (int i = 0; i < vettTelefono.length; i++) {
			
			
			if (telMinimo.getPrezzo() > vettTelefono[i].getPrezzo())
				telMinimo.setPrezzo(vettTelefono[i].getPrezzo());
		}
		return telMinimo;
	}

}
