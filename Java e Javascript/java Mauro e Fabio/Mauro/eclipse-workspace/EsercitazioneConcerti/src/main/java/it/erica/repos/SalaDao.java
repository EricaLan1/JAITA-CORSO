package it.erica.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import it.erica.entities.Sala;

public interface SalaDao extends JpaRepository<Sala, Integer>{

}
