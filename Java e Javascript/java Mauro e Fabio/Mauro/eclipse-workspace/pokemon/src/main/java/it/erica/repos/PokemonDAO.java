package it.erica.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import it.erica.entities.Prodotto;

public interface PokemonDAO extends JpaRepository<Prodotto, Integer> {

}