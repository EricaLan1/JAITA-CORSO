package it.erica.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.erica.entities.Spettacolo;

public interface SpettacoloDAO extends JpaRepository<Spettacolo, Integer>{
	
	List<Spettacolo> findSpettacoli (Spettacolo spettacolo);
	
	}
