package it.softwareinside.archivio;

public class DocumentoPrioritario extends Documento {
	private int incremento;

	public DocumentoPrioritario() {
		this("Placeholder", 2);
	}

	public DocumentoPrioritario(String testo, int incremento) {
		super(testo);
		setIncremento(incremento);
	}

	public void setIncremento(int incremento) {
		this.incremento = incremento > 0 ? incremento : -incremento;
	}

	public int getIncremento() {
		return incremento;
	}
	
	/**
	 * Calcola la qualità di un documento 
	 * sapendo che minore è la lunghezza del testo maggiore è la qualità
	 * e aggiunge al risultato la priorità del documento
	 */
	@Override
	public double calcolaQualita() {

		return super.calcolaQualita() + this.incremento;
	}
}
