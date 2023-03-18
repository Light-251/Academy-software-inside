package it.softwareinside.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import it.softwareinside.app.models.Dog;

@org.springframework.stereotype.Controller
public class Controller {

	
	@GetMapping("/cane-random")
	public ModelAndView generaCane() {
		ModelAndView modelAndView = new ModelAndView("cane-random");
		RestTemplate restTemplate = new RestTemplate();
		Dog cane = restTemplate.getForObject("https://random.dog/woof.json", Dog.class);
		modelAndView.addObject("immagineCane",cane.getUrl());
		
		System.out.println(cane.getUrl());
		
		return modelAndView;
	}
}
