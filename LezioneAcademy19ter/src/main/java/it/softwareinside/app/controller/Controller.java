package it.softwareinside.app.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	/**
	 * API che prende in ingresso 3 numeri e ritorna la media
	 * 
	 * @param numero1
	 * @param numero2
	 * @param numero3
	 * @return
	 */
	@GetMapping("/media")
	public String mediaTreValori(@RequestParam("n1") String numero1, @RequestParam("n2") String numero2,
			@RequestParam("n3") String numero3) {
		double somma;

		try {
			somma = Double.parseDouble(numero1) + Double.parseDouble(numero2) + Double.parseDouble(numero3);
			return somma / 3 + "";
		} catch (NumberFormatException e) {
			return "Inserisci solo numeri";
		} catch (Exception e) {
			return "Errore " + e;
		}

	}

	/**
	 * API che prende in ingresso un intero e restituisce tutti i numeri pari da 0
	 * fino al numero inserito
	 * 
	 * @param numero
	 * @return
	 */
	@GetMapping("/arrayPari")
	public ArrayList<Integer> ritornaPari(@RequestParam("n") String numero) {
		ArrayList<Integer> arrayPari = new ArrayList<>();

		try {

			for (int i = 0; i <= Integer.parseInt(numero); i++)
				if (i % 2 == 0)
					arrayPari.add(i);

		} catch (NumberFormatException e) {
			return null;
		} catch (Exception e) {
			return null;
		}

		return arrayPari;
	}

	/**
	 * API che prende in ingresso una Stringa e la ritorna
	 * al contrario senza usare StringBuilder
	 * 
	 * @param parola
	 * @return
	 */
	@GetMapping("stringa-al-contrario")
	public String stringaAlContrario(@RequestParam("p") String parola) {
		String ris = "";
		try {
			for (int i = parola.length() - 1; i >= 0; i--) {
				ris += parola.charAt(i);
			}

			return ris;

		} catch (Exception e) {
			return "ERRORE" + e;
		}
	}

	/**
	 * API che prende in ingresso una parola e la restituisce al contrario
	 * 
	 * @param parola
	 * @return
	 */
	@GetMapping("stringa-al-contrario-builder")
	public String stringaAlContrario2(@RequestParam("p") String parola) {
		try {
			return new StringBuilder(parola).reverse().toString();
		} catch (Exception e) {
			return "OPS, Qualcosa è andato storto";
		}
	}

}
