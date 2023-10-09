package it.erica.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import it.erica.entities.Film;

public interface FilmDAO extends JpaRepository<Film, Integer> {

}