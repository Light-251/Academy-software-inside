package it.softwareinside.phone;

public class Smartphone {
	private String marca, modello;
	private double prezzo;
	private boolean isDualSim;

	// costruttori
	public Smartphone() {
		setMarca("Placeholder");
		setModello("Placeholder");
		setPrezzo(50);
		setIsDualSim(false);
	}

	public Smartphone(String marca, String modello, double prezzo, boolean isDualSim) {
		setMarca(marca);
		setModello(modello);
		setPrezzo(prezzo);
		setIsDualSim(isDualSim);
	}

	@Override
	public String toString() {
		return "Marca: " + this.marca + ", Modello: " + this.modello + ", Prezzo: " + this.prezzo + ", isDualSim: "
				+ this.isDualSim;
	}

	// setter
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo > 0 && prezzo < 1200 ? prezzo : 150;
	}

	public void setIsDualSim(boolean isDualSim) {
		this.isDualSim = isDualSim;
	}

	// getter
	public String getMarca() {
		return this.marca;
	}

	public String getModello() {
		return this.modello;
	}

	public double getPrezzo() {
		return this.prezzo;
	}

	public boolean getIsDualSim() {
		return this.isDualSim;
	}

}
