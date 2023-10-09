package it.erica.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.erica.services.PokemonService;


@Controller
@RequestMapping("")
public class PokemonCtrl {
	
	@Autowired
	PokemonService service;
	
	@GetMapping("prodotti") //indirizzarci alla pagina html
	public String prodotti() {
		return "prodotti";
	}
}
