package it.erica.services;

import java.util.List;

import it.erica.entities.Cinema;

public interface CinemaService {

	List<Cinema> getAll();
	Cinema getById(int id);
	Cinema add(Cinema c);
}
