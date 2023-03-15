package it.softwareinside.app.controller;

import java.util.ArrayList;
import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	/**
	 * creare una funzione con rotta "/sommatoria" la funzione ritorna un intero che
	 * rappresenta la sommatoria di tutti i numeri multipli di 3 compresi tra 1 e
	 * 100
	 */
	@GetMapping("/sommatoria")
	public int getSommatoria() {
		int sommatoria = 0;
		for (int i = 0; i < 100; i++)
			if (i % 3 == 0)
				sommatoria += i;

		return sommatoria;
	}

	/*
	 * per prendere in ingresso dei valori si usa
	 * "@RequestParam(name="nomeParametro") int num i metodi vengono passati
	 * nell'URL dopo il '?'
	 * 
	 * ES: 127.0.0.1/somma?numero1=10&numero2=5
	 */
	@GetMapping("/somma")
	public int somma(@RequestParam(name = "numero1") int numero1, @RequestParam(name = "numero2") int numero2) {

		return numero1 + numero2;
	}

	/**
	 * creare un API prende in input una string e ritorna il numero di caratteri di
	 * quella stringa
	 */
	@GetMapping("/contaLettere")
	public int contaCaratteri(@RequestParam(name = "parola") String parola) {
		return parola.length();
	}

	/**
	 * creare un'API che prende in ingresso un numero e si r restituisce un
	 * arrayList di numeri casuali tra 0 e 6 quanti indicati nel parametro inserito
	 */
	@GetMapping("/numeriRandom")
	public ArrayList<Integer> numeriRandom(@RequestParam(name = "n") int numero) {
		ArrayList<Integer> array = new ArrayList<>();
		Random random = new Random();

		for (int i = 0; i < numero; i++)
			array.add(random.nextInt(0, 7));

		return array;
	}

}
