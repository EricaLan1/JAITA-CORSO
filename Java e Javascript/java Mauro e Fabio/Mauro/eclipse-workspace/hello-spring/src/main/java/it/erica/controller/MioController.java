package it.erica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MioController {

	@GetMapping({"home", "index", "casa"})
	public String home() {
		return "home";
	}
	
	@GetMapping("clientCanzoni")
	public String client() {
		return "client";
	}
	
	
}