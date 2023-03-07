package it.softwareinside.squadra;

public class Tester {
	public static void main(String[] args) {
//		Player gioc1 = new Player();
//		Player gioc2 = new Player("Giacomo");
//		Player gioc3 = new Player("Mario", "Portiere", 20);
//		
//		System.out.println(gioc1);
//		System.out.println(gioc2);
//		System.out.println(gioc3);
//		
//		Allenatore allen1 = new Allenatore();
		Allenatore allen2 = new Allenatore("Rob", 10);
//		
//		System.out.println(allen1);
//		System.out.println(allen2);

		Team squadra1 = new Team("SI", 10, allen2);

		squadra1.stampaPlayer();

		System.out.println("-------- Aggiunta Giocatori -------");
		for(int i=0; i<=11; i++)
			squadra1.addPlayer(new Player());
		squadra1.stampaPlayer();
		

		squadra1.removePlayer(5);
		System.out.println("******** Rimozione giocatore pos 5 *************");
		squadra1.stampaPlayer();

	}

}
