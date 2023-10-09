package it.erica.services;

import java.util.List;

import it.erica.entities.Sala;

public interface SalaService {
	List<Sala> getAll();
	Sala getById(int id);
	Sala add(Sala s);
	
}
