package it.erica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.erica.entities.Canzone;
import it.erica.services.CanzoneService;

@RestController
public class MioRestController {
	
	@Autowired
	CanzoneService  service;
	
	@GetMapping("api/home")
	public String home() {
		
		return "{}";
				
	}
	@GetMapping("api/cantanti")
	public List<Canzone> getCanzoni() {
		
		return service.getCanzone();
	}
	
	@PostMapping("api/canzoni")
    public Canzone addCanzone(@RequestBody Canzone c) {
        return service.addCanzone(c);
    }
}
