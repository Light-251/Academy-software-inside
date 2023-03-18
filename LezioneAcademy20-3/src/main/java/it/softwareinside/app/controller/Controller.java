package it.softwareinside.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.softwareinside.app.models.Duck;
import it.softwareinside.app.services.DuckService;

@RestController
public class Controller {
	
	@Autowired
	DuckService duckService;
	
	@GetMapping("/papera-random")
	public String generaUrlPapera() {
		return duckService.generaUrlDuck();
	}
	
	@GetMapping("/papera-json")
	public Duck generaDuck() {
		return duckService.generaDuck();
	}

}
