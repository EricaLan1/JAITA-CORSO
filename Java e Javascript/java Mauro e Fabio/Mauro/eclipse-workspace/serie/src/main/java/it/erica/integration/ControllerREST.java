package it.erica.integration;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.erica.entities.Cinema;
import it.erica.entities.Film;
import it.erica.entities.FilmInSala;
import it.erica.entities.Prenotazione;
import it.erica.services.CinemaService;
import it.erica.services.FilmInSalaService;
import it.erica.services.FilmService;
import it.erica.services.PrenotazioneService;

@RestController
@RequestMapping("api")
public class ControllerREST {

	@Autowired
	private CinemaService cinemaService;
	
	@Autowired
	private FilmService filmService;
	
	@Autowired
	private FilmInSalaService filmInSalaService;
	
	@Autowired
	private PrenotazioneService prenotazioneService;
	
	@GetMapping("cinema")
	List<Cinema> getCinema(){
		return cinemaService.getAll();
	}
	
	@GetMapping("film")
	List<Film> getFilm(){
		return filmService.getAll();
	}
	
	@GetMapping("programmazione")
	List<FilmInSala> getFilmInSala(){
		return filmInSalaService.getAll();
	}
	
	@GetMapping("prenotazione")
	List<Prenotazione> getPrenotazione(){
		return prenotazioneService.getAll();
	}
	
	@CrossOrigin
	@PostMapping("programmazione")
	FilmInSala addProgrammazione(@RequestBody FilmInSala fis) {
		return filmInSalaService.add(fis);
	}
	
	
}