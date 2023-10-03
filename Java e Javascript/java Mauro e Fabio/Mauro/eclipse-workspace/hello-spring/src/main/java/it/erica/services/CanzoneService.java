package it.erica.services;

import java.util.List;

import it.erica.entities.Canzone;

public interface CanzoneService {
	
	
	List<Canzone> getCanzone();
	Canzone addCanzone(Canzone c);
	Canzone updateCanzone(Canzone c);
}
