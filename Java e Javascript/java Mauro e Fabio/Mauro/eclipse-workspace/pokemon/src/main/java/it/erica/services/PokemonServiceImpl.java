package it.erica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.erica.entities.Prodotto;
import it.erica.repos.PokemonDAO;
import it.erica.services.PokemonService;


@Service
public class PokemonServiceImpl implements PokemonService 
{
	@Autowired
	PokemonDAO dao;

	@Override
	public List<Prodotto> getProdotti() 
	{
		return dao.findAll();
	}

	@Override
	public Prodotto addProdotto(Prodotto p)
	{
		return dao.save(p);
	}

	@Override
	public Prodotto updateProdotto(Prodotto p)
	{
		return dao.save(p);
	}

}
