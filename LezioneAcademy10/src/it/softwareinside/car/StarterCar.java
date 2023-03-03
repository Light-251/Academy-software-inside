package it.softwareinside.car;

import java.util.Random;

public class StarterCar {

	public static void main(String[] args) {
		Car automobile = new Car();
		Random random = new Random();

		automobile.setMarca("Ferrari");
		automobile.setColore("Rosso");
		automobile.setCosto(40000);
		automobile.setVelox(random.nextInt(1, 151));

		System.out.println(automobile);

		System.out.println("----------------------");

		automobile.frena();
		System.out.println("Frena, velox attuale: " + automobile.getVelox());

		automobile.accelera();
		automobile.accelera();
		System.out.println("Accelera, velox attuale: " + automobile.getVelox());
	}

}
