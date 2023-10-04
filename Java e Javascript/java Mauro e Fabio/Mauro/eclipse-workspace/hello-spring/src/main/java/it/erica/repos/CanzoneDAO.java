package it.erica.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.erica.entities.Canzone;

@Repository
public interface CanzoneDAO extends JpaRepository<Canzone, Integer> {

}