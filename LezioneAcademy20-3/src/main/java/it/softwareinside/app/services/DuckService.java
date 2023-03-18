package it.softwareinside.app.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import it.softwareinside.app.models.Duck;

@Service
public class DuckService {
	
	public String generaUrlDuck() {
		RestTemplate restTemplate = new RestTemplate();
		Duck duck = restTemplate.getForObject("https://random-d.uk/api/v2/random", Duck.class);
		
		return duck.getUrl();
	}
	
	public Duck generaDuck() {
		RestTemplate restTemplate = new RestTemplate();
		Duck duck = restTemplate.getForObject("https://random-d.uk/api/v2/random", Duck.class);
		
		return duck;
	}
	

}
