package it.erica.services;

import java.util.List;

import it.boglia.entities.Studente;

public interface StudenteService {
	
	
	List<Studente> getStudenti();
	Studente addStudente(Studente s);
	
	
}
