package it.softwareinside.nave;

public class Passeggero extends Persona{
	private String cartaDiImbarco;
	
	public Passeggero() {
		this("PasseggeroDefault", 16, "A-000");
	}
	
	public Passeggero(String nome, int eta, String cartaDiImbarco) {
		super(nome, eta);
		setCartaDiImbarco(cartaDiImbarco);
	}
	
	@Override
	public String toString() {
		return super.toString() + "; Passeggero, Carta di Imb: " + this.cartaDiImbarco;
	}
	
	public void setCartaDiImbarco(String cartaDiImbarco) {
		this.cartaDiImbarco = cartaDiImbarco;
	}
	
	public String getCartaDiImbarco() {
		return this.cartaDiImbarco;
	}
}
