package it.erica.services;

import java.util.List;

import it.erica.entities.Prodotto;

public interface PokemonService {
	
	List<Prodotto> getProdotti();
	Prodotto addProdotto (Prodotto p);
	Prodotto  updateProdotto (Prodotto p);

}