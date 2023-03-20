package it.softwareInside.MagazzinoStore.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity // crea una corrispondenza tra la classe Java e il Database
public class Item {

	@GeneratedValue(strategy = GenerationType.AUTO) //
	@Id // Indica la chiave primaria
	private int id;

	// @Column(name = "marca")
	private String marca;

	// @Column(name = "tipologia")
	private String tipologia;

	// @Column(name = "costo")
	private double costo;

	public Item(String marca, String tipologia, double costo) { // costruttore senza il parametro id perché viene
																// gestito dal database
		setMarca(marca);
		setTipologia(tipologia);
		setCosto(costo);
	}
}
