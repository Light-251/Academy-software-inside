package it.softwareinside.esercizio2Classi;

public class PC {
	
	private String marca;
	private double costo;
	private Monitor monitor;
	
	public PC() {
		setMarca("Default");
		setCosto(100.00);
//		setMonitor(null);
		this.monitor =  new Monitor(); //setMonito(new Monitor() )
	}
	
	public PC(String marca, double costo, Monitor monitor) {
		setMarca(marca);
		setCosto(costo);
		setMonitor(monitor);
		
	}
	
	@Override
	public String toString() {
		return "PC [ Marca: " + marca
				+ " Costo " + costo
				+ " Monitor: " + monitor;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public double getCosto() {
		return costo;
	}
	
	public Monitor getMonitor() {
		return monitor;
	}
	

}
