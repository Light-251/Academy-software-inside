package it.softwareinside.ereditarieta;

public class Starter {

	public static void main(String[] args) {
		
		
		System.out.println("lavoratore di default");
		Lavoratore lav = new Lavoratore();
		
		System.out.println(lav);
		
		System.out.println("lavoratore param");
		Lavoratore lav2 = new Lavoratore("Mario", 40, 1500.00);
		
		System.out.println(lav2);
	}

}
