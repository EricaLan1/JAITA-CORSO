package it.erica.services;

import java.util.List;

import it.erica.entities.Film;
import it.erica.entities.FilmInSala;

public interface FilmInSalaService {

	List<FilmInSala> getAll();
	FilmInSala getById(int id);
	FilmInSala add(FilmInSala c);
	
	List<FilmInSala> findByFilm(Film f);
}