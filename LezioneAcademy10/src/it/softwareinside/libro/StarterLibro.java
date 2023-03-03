package it.softwareinside.libro;

public class StarterLibro {
	public static void main(String[] args) {
		Libro libro1 = new Libro();
		Libro libro2 = new Libro();
		Libro libro3 = new Libro();

		libro1.setTitolo("Cose Preziose");
		libro1.setAutore("Stephen King");
		libro1.setGenere("Horror");
		libro1.setNumeroPagine(350);
		libro1.setPrezzo(19.90);

		libro2.setTitolo("Divina Commedia");
		libro2.setAutore("Dante");
		libro2.setGenere("Classico");
		libro2.setNumeroPagine(500);
		libro2.setPrezzo(34.90);

		libro3.setTitolo("Il gioco dei Troni");
		libro3.setAutore("Georige RR Martin");
		libro3.setGenere("Fantasy");
		libro3.setNumeroPagine(650);
		libro3.setPrezzo(25.90);

//		System.out.println("Libro 1: Titolo: " + libro1.getTitolo() + ", Autore: " + libro1.getAutore());
//		System.out.println("Libro 2: Titolo: " + libro2.getTitolo() + ", Autore: " + libro2.getAutore());
//		System.out.println("Libro 3: Titolo: " + libro3.getTitolo() + ", Autore: " + libro3.getAutore());
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		System.out.println(libro3.toString());
		
		
		System.out.println("--------------");

		System.out.println("il libro con il prezzo più alto è: \n");
		if (libro1.getPrezzo() > libro2.getPrezzo() && libro1.getPrezzo() > libro3.getPrezzo())
			System.out.println(libro1);
		else if (libro2.getPrezzo() > libro3.getPrezzo())
			System.out.println(libro2);
		else
			System.out.println(libro3);

	}
}
