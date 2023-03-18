package it.softwareinside.app.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import it.softwareinside.app.models.CatFact;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/cat-facts")
	public CatFact generaGatto() {
		RestTemplate restTemplate = new RestTemplate();
		CatFact ris = restTemplate.getForObject("https://meowfacts.herokuapp.com/", CatFact.class);
		
		return ris;
	}
	
	@GetMapping("/array-gatti")
	public ArrayList<CatFact> arrayGatto(@RequestParam(name="cont")int cont, @RequestParam(name="lang")String lang){
		ArrayList<CatFact> arrayGatt = new ArrayList<>();
		RestTemplate restTemplate = new RestTemplate();
		
		for(int i=0; i<cont; i++) {
			arrayGatt.add(restTemplate.getForObject("https://meowfacts.herokuapp.com/?lang=" + lang, CatFact.class));
		}
		
		return arrayGatt;
		
	}
}
