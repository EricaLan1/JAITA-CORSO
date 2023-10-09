package it.erica.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.erica.entities.Film;
import it.erica.entities.FilmInSala;

public interface FilmInSalaDAO extends JpaRepository<FilmInSala, Integer> {

	List<FilmInSala> findByFilm(Film film);
	
}
