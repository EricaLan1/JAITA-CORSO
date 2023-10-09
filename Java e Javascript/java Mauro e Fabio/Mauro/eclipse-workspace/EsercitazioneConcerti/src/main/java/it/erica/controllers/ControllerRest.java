package it.erica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.erica.entities.Artista;
import it.erica.entities.Biglietto;
import it.erica.entities.Sala;
import it.erica.entities.Spettacolo;
import it.erica.services.ArtistaService;
import it.erica.services.BigliettoService;
import it.erica.services.SalaService;
import it.erica.services.SpettacoloService;

@RestController
@RequestMapping("api")
public class ControllerRest {
	
	@Autowired
	private ArtistaService artistaService;
	
	@Autowired
	private BigliettoService bigliettoService;
	
	@Autowired
	private SalaService salaService;
	
	@Autowired
	private SpettacoloService spettacoloService;
	
	@GetMapping("artisti")
	List<Artista> getArtista(){
		return artistaService.getAll();
	}
	
	@GetMapping("Biglietteria")
	List<Biglietto> getBiglietto(){
		return bigliettoService.getall();
	}
	
	@GetMapping("sale")
	List<Sala> getSala(){
		return salaService.getAll();
	}
	
	@GetMapping("spettacoli")
	List<Spettacolo> getSpettacolo(){
		return spettacoloService.getAll();
	}
	
}
