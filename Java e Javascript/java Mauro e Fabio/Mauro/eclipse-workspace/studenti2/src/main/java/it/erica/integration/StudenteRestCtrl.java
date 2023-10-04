package it.erica.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.boglia.entities.Studente;
import it.erica.services.StudenteService;

@RestController
@RequestMapping
public class StudenteRestCtrl {
	
	@Autowired
	StudenteService service;
	
	@GetMapping("studenti")
	List<Studente> getStudenti(){
		return service.getStudenti()
	}
	
	@PostMapping("studenti")
	Studente addStudente(@RequestBody Studente s) {
		return service.addStudente(s);
	}
}
