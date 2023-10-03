package it.erica.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import it.erica.entities.Canzone;

public interface CanzoneDAO extends JpaRepository<Canzone, Integer> {

}
