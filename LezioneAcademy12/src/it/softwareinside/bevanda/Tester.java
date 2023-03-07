package it.softwareinside.bevanda;

public class Tester {
	public static void main(String[] args) {
		Bevanda bevanda = new Bevanda();
		Bevanda bevanda2 = new Bevanda("Coke", 1.5, 0.66, false);
		
		System.out.println(bevanda);
		System.out.println(bevanda2);
		
		System.out.println("---------------------");
		
		Scaffale scaffalerTester = new Scaffale();
		Scaffale scaffaleParam = new Scaffale(10);
		
		
		System.out.println(scaffalerTester);
		
		scaffaleParam.addBevanda(bevanda2);
		scaffaleParam.addBevanda(bevanda);
		
		System.out.println("----------------");
		
		System.out.println("scaffale param");
		scaffaleParam.stampaBevande();
		
		System.out.println("scaffale default");
		scaffalerTester.stampaBevande();

	}
	
	
	

}
