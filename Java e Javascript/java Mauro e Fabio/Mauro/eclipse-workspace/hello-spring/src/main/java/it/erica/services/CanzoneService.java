package it.erica.services;

import java.util.List;

import it.erica.entities.Canzone;

public interface CanzoneService {

	List<Canzone> getCanzoni();
	Canzone addCanzone(Canzone c);
	//crud
	Canzone updateCanzone(Canzone c);
}