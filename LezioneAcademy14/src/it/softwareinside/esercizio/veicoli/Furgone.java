package it.softwareinside.esercizio.veicoli;

public class Furgone extends VeicoliAMotore {
	private int capacitaDiCarico;
	
	public Furgone() {
		this(2000, 150, "Fiat", "diesel",200);
	}
	
	public Furgone(int annoImmatricolazione, int cilindrata,
			String marca, String tipoAlimentazione, int capacitaDiCarico) {
		super(annoImmatricolazione, cilindrata,marca,tipoAlimentazione);
		setCapacitaDiCarico(capacitaDiCarico);
	}
	

	@Override
	public String toString() {
		return super.toString() + "Furgone [ Capacità di carico: " + capacitaDiCarico + " ]";
	}

	public void setCapacitaDiCarico(int capacitaDiCarico) {
		this.capacitaDiCarico = capacitaDiCarico;
	}

	public int getCapacitaDiCarico() {
		return this.capacitaDiCarico;
	}

}
