package it.erica.services;

import java.util.List;

import it.erica.entities.Biglietto;

public interface BigliettoService {
	
	List<Biglietto> getall();
	Biglietto getById(int id);
	Biglietto add(Biglietto b);
}
