package it.softwareinside.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import it.softwareinside.app.models.Dog;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping("/cane")
	public Dog generaCane() {
		RestTemplate restTemplate = new RestTemplate();
		Dog cane = restTemplate.getForObject("https://random.dog/woof.json", Dog.class);
		
		return cane;
	}

}
