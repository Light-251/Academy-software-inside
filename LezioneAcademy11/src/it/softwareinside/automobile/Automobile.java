package it.softwareinside.automobile;

public class Automobile {
	
	private String marca;
	private double costo;
	private Engine engine;
	private Carrozzeria carrozzeria;
	
	public Automobile() {
		setMarca("DEFAULT");
		setCosto(0.00);
		setEngine(new Engine());
		setCarrozzeria(new Carrozzeria());
	}
	
	public Automobile(String marca, double costo, Engine engine, Carrozzeria carrozzeria) {
		setMarca(marca);
		setCosto(costo);
		setEngine(engine);
		setCarrozzeria(carrozzeria);
	}
	
	@Override
	public String toString() {
		return "Automobile [ Marca: " + marca
				+ " Costo: " + costo
				+ " Engine: " + engine
				+ " Carrozzeria: " + carrozzeria
				+ " ]";
	}
	
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void setCarrozzeria(Carrozzeria carrozzeria) {
		this.carrozzeria = carrozzeria;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public double getCosto() {
		return costo;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public Carrozzeria getCarrozzeria() {
		return carrozzeria;
	}
	

}
