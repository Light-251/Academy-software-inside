package it.softwareinside.esercizio.veicoli;

public class Automobile extends VeicoliAMotore {
	private int numPorte;

	public Automobile() {
		this(2002, 170, "Nissan", "elettrica", 5);
	}

	public Automobile(int annoImmatricolazione, int cilindrata, String marca, String tipoAlimentazione, int numPorte) {
		super(annoImmatricolazione, cilindrata, marca, tipoAlimentazione);
		setNumPorte(numPorte);
	}

	@Override
	public String toString() {
		return super.toString() + "; Automobile [ Numero di Porte: " + numPorte + " ]";
	}

	public void setNumPorte(int numPorte) {
		this.numPorte = numPorte;
	}

	public int getNumPorte() {
		return this.numPorte;
	}

}
