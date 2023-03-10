package it.softwareinside.archivio;

import java.util.ArrayList;

public class Archivio {

	private ArrayList<Documento> documenti;
	
	
	public Archivio() {
		documenti = new ArrayList<>();
	}

	public void setDocumenti(ArrayList<Documento> documenti) {
		this.documenti = documenti;
	}

	public ArrayList<Documento> getDocumenti() {
		return this.documenti;
	}
	
	@Override
	public String toString() {
		return "Archivio : Documenti: " + this.documenti;
	}

	/**
	 * Aggiunge un documento in un ArrayList
	 * se il documento passato come parametro è null
	 * esce dal metodo
	 * 
	 * @param documento
	 */
	public void aggiungiDocumento(Documento documento) {
		if(documento == null)
			return; // Esce dal metodo anche se è void
		
		documenti.add(documento);
		
	}

	/**
	 * Trova il documento con la qualità maggiore invocando il metodo calcolaQualita
	 * di tutti gli elementi presenti.
	 * 
	 * @return
	 */
	public Documento trovaMigliore() {
		Documento maxQual = documenti.get(0);
		for(int i=1; i < documenti.size(); i++) 
			if(maxQual.calcolaQualita() < documenti.get(i).calcolaQualita())
				maxQual = documenti.get(i);
		
		return maxQual;
	}
}
