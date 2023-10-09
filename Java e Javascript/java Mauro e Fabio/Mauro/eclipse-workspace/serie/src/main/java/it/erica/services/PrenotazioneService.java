package it.erica.services;

import java.util.List;

import it.erica.entities.Prenotazione;

public interface PrenotazioneService {

	List<Prenotazione> getAll();
	Prenotazione getById(int id);
	Prenotazione add(Prenotazione c);
}