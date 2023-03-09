package it.softwareinside.esercizio.veicoli;

public class VeicoliAMotore {
	private int annoImmatricolazione, cilindrata;
	private String marca, tipoAlimentazione;

	public VeicoliAMotore() {
		this(1997, 50, "Suzuki", "benzina");
	}

	public VeicoliAMotore(int annoImmatricolazione, int cilindrata,
			String marca, String tipoAlimentazione) {
		setAnnoImmatricolazione(annoImmatricolazione);
		setCilindrata(cilindrata);
		setMarca(marca);
		setTipoAlimentazione(tipoAlimentazione);
	}
	
	@Override
	public String toString() {
		return "Veicoli: [ Anno di Immatricolazione: " + annoImmatricolazione
				+ ", Cilindrata: " + cilindrata
				+ ", Marca: " + marca
				+ ", Tipo di Alimentazione: " + tipoAlimentazione
				+ " ]";
	}

	public void setAnnoImmatricolazione(int annoImmatricolazione) {
		this.annoImmatricolazione = annoImmatricolazione;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setTipoAlimentazione(String tipoAlimentazione) {
		this.tipoAlimentazione = tipoAlimentazione;
	}

	public int getAnnoImmatricolazione() {
		return this.annoImmatricolazione;
	}

	public int getCilindrata() {
		return this.cilindrata;
	}

	public String getMarca() {
		return this.marca;
	}

	public String getTipoAlimentazione() {
		return this.tipoAlimentazione;
	}

}
