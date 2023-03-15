package it.softwareInside.springBootExample.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/")
	public String saluta() {
		return "Ciao Mondo";
	}

	@GetMapping("/contatti")
	public String saluta2() {
		return "Pagina Contatti";
	}

	@GetMapping(value = { "welcome1", "welcome2" })
	public ArrayList<Integer> generateArray() {
		ArrayList<Integer> risArrayList = new ArrayList<>();

		risArrayList.add(10);
		risArrayList.add(20);
		risArrayList.add(30);

		return risArrayList;
	}

	/*
	 * Creare una funzione che ritorna un arraylist di interi con 6 numeri scelti a
	 * caso con una random nell'intervallo 1-90
	 */

	@GetMapping("/arrayRandom")
	public ArrayList<Integer> generaArrayCasuale() {
		Random random = new Random();
		ArrayList<Integer> risArrayList = new ArrayList<>();

		for (int i = 0; i < 6; i++)
			risArrayList.add(random.nextInt(1, 91));

		return risArrayList;

	}
	
	/*
	 * creare una funzione in grado di restituire un'hashmap 
	 * con una rotta che si chiama /dizionario
	 * 
	 */
	@GetMapping("/dizionario")
	public HashMap<String, String> getDizionario(){
		HashMap<String, String> myMap = new HashMap<>();
		
		myMap.put("", "");
		
		return myMap;	
		
	}

}
