package it.softwareinside.esercizio.veicoli;

public class Motocicletta extends VeicoliAMotore {
	private String tipologia;
	private int numTempiMotore;

	public Motocicletta() {
		this(2006, 250, "Kawasaki", "benzina", "Scooter", 40);
	}

	public Motocicletta(int annoImmatricolazione, int cilindrata, String marca, String tipoAlimentazione,
			String tipologia, int numTempiMotore) {
		super(annoImmatricolazione, cilindrata, marca, tipoAlimentazione);
		setTipologia(tipologia);
		setNumTempiMotore(numTempiMotore);
	}

	@Override
	public String toString() {
		return super.toString() + "; Motocicletta [ Tipologia: " + tipologia + ", Num Tempi Motore: " + numTempiMotore
				+ " ]";
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public void setNumTempiMotore(int numTempiMotore) {
		this.numTempiMotore = numTempiMotore;
	}

	public String getTipologia() {
		return this.tipologia;
	}

	public int getNumTempiMotore() {
		return this.numTempiMotore;
	}

}
