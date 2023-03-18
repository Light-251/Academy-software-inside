package it.softwareinside.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/")
	public ModelAndView getNome() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		
		return modelAndView;
	}
	
	@GetMapping("/hello")
	public ModelAndView getHello() {
		ModelAndView modelAndView = new ModelAndView("hello");
		String myName = "Welcome";
		
		modelAndView.addObject("label", myName);
		
		return modelAndView;
	}

}
