package it.erica.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import it.erica.entities.Artista;

public interface ArtistaDAO extends JpaRepository<Artista, Integer> {

}
