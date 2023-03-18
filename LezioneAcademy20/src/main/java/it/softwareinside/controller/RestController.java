package it.softwareinside.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import it.softwareinside.models.CatFacts;
import it.softwareinside.models.Fox;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@RequestMapping("/fox-array")
	public ArrayList<Fox> generaFox(@RequestParam(name="n") int numero){
		ArrayList<Fox> arrayList = new ArrayList<>();
		RestTemplate restTemplate = new RestTemplate();
		
		for(int i = 0; i< numero; i++) {
			arrayList.add(restTemplate.getForObject("https://randomfox.ca/floof/", Fox.class));
		}
		
		return arrayList;
	}
	
	@GetMapping("/cat-fact")
	public CatFacts prendiGatto() {
		
		ArrayList<CatFacts> arrayList = new ArrayList<>();
		RestTemplate restTemplate = new RestTemplate();
		for(int i=0;i<5;i++)
			arrayList.add(restTemplate.getForObject("https://cat-fact.herokuapp.com/facts", CatFacts.class));
		//CatFacts gatto = arrayList.get(0);
		
		System.out.println(arrayList);
		
		return arrayList.get(0);
		
	}
	
	@GetMapping("/cat-fact-correzione")
	public void generaCatFacts() {
		RestTemplate restTemplate = new RestTemplate();
		CatFacts ris = restTemplate.getForObject("https://cat-fact.herokuapp.com/facts", CatFacts.class);
		
		System.out.println(ris);
	}

}
