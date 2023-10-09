package it.erica.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.erica.entities.Prodotto;
import it.erica.services.PokemonService;

@RestController
@RequestMapping("api")
public class PokemonRestCtrl {
	
	@Autowired
	it.erica.services.PokemonService service;
	
	@GetMapping ("prodotti")
	List<Prodotto> getProdotti()
	{
		return service.getProdotti();
		
	}

	@PostMapping("prodotti")
	Prodotto addProdotto(@RequestBody Prodotto p)
	{
		return service.addProdotto(p);

	}
	
	@PutMapping("prodotti") 
	Prodotto modificaProdotto(@RequestBody Prodotto p ) 
	{
		return service.updateProdotto(p);
	}
	
}