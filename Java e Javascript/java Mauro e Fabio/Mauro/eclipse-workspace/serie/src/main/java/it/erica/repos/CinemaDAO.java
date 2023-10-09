package it.erica.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import it.erica.entities.Cinema;

public interface CinemaDAO extends JpaRepository<Cinema, Integer> {

}
