package it.softwareinside.ereditarieta;

public class Lavoratore extends Persona {
	private double salario;
	
	public Lavoratore() {
		super();
		setSalario(500.00);
	}
	
	public Lavoratore(String nome, int eta, double salario) {
		super("Lavoratore default", 20);
		setSalario(salario);
	}
	

	@Override
	public String toString() {
		return super.toString() + "Lavoratore [ Salario: " + salario + " ]";
	}
	
	@Override
	public void saluta() {
		super.saluta();
		System.out.println("E sono un lavoratore.");
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return this.salario;
	}
}
