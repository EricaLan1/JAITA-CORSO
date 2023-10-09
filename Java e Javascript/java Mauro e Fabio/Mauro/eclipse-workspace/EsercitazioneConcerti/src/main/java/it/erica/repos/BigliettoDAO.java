package it.erica.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import it.erica.entities.Biglietto;

public interface BigliettoDAO extends JpaRepository<Biglietto, Integer> {

}
