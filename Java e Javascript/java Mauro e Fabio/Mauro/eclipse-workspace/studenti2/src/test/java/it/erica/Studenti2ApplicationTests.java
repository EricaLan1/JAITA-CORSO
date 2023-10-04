package it.erica;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import it.boglia.entities.Studente;
import it.erica.services.StudenteService;

@SpringBootTest
class Studenti2ApplicationTests {
	
	@Autowired
	private StudenteService service;
	
	
	@Test
	void contextLoads() {
		
		Studente s = new Studente();
		s.setNome("erica");
		s.setCognome("landolfo");
		
		service.addStudete(s);
	}
	
	@Test
	void showStudente() {
		System.out.println();
	}

}
