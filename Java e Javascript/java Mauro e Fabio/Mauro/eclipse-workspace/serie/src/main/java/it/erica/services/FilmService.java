package it.erica.services;

import java.util.List;

import it.erica.entities.Film;

public interface FilmService {

	List<Film> getAll();
	Film getById(int id);
	Film add(Film c);
}
