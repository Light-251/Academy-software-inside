package it.softwareinside.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import it.softwareinside.models.Fox;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/genera-fox")
	public ModelAndView generaFox() {
		ModelAndView modelAndView = new ModelAndView("genera-fox");
		RestTemplate restTemplate = new RestTemplate();
		Fox risFox = restTemplate.getForObject("https://randomfox.ca/floof/", Fox.class);
		
		modelAndView.addObject("immagineFox", risFox.getImage());
		
		System.out.println(risFox);
		
		return modelAndView;
	}
	
}
