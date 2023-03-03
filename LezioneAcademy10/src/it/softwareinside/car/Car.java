package it.softwareinside.car;

public class Car {
	private String marca;
	private String colore;
	private double costo;
	private int velox;

	// toString
	@Override
	public String toString() {
		return "Marca: " + marca + "\nColore: " + colore + "\nCosto: " + costo + "\nVelocità: " + velox;
	}

	/**
	 * Diminuisce la velocità di 1 unità
	 */
	public void frena() {
		this.velox--;
	}

	/**
	 * Aumenta la velocità di 1 unità
	 */
	public void accelera() {
		this.velox++;
	}

	// METODI SET
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public void setCosto(double costo) {
		this.costo = costo > 0 ? costo : -costo;
	}

	public void setVelox(int velox) {
		this.velox = velox > 0 && velox < 250 ? velox : 50;
	}

	// METODI GET
	public String getMarca() {
		return this.marca;
	}

	public String getColore() {
		return this.colore;
	}

	public double getCosto() {
		return this.costo;
	}

	public int getVelox() {
		return this.velox;
	}

}
