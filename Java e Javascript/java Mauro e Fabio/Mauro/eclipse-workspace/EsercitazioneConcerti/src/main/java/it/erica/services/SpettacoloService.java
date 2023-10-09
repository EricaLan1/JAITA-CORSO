package it.erica.services;

import java.util.List;

import it.erica.entities.Spettacolo;

public interface SpettacoloService {
	
	List<Spettacolo> getAll();
	Spettacolo getById(int id);
	Spettacolo add(Spettacolo p);
}
