package it.softwareinside.archivio;

public class StarterDocumento {
	public static void main(String[] args) {

		DocumentoPrioritario documentoPrior = new DocumentoPrioritario("docPrioritario", 2);
		Archivio archivio = new Archivio();

		Documento doc = new Documento("docNormale");

		archivio.aggiungiDocumento(documentoPrior);
		archivio.aggiungiDocumento(doc);

		for (int i = 0; i < archivio.getDocumenti().size(); i++) {
			System.out.println(archivio.getDocumenti().get(i));
			System.out.println(archivio.getDocumenti().get(i).calcolaQualita());
		}

		System.out.println(archivio);

		System.out.println("Qualità migliore");
		System.out.println(archivio.trovaMigliore().calcolaQualita());
	}
}
