package it.erica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.erica.entities.Prenotazione;
import it.erica.repos.PrenotazioneDAO;

@Service 
public class PrenotazioneServiceImpl implements PrenotazioneService {

	@Autowired
	PrenotazioneDAO dao;

	@Override
	public List<Prenotazione> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Prenotazione getById(int id) {
		// TODO Auto-generated method stub
		return dao.getReferenceById(id);
	}

	@Override
	public Prenotazione add(Prenotazione c) {
		// TODO Auto-generated method stub
		return dao.save(c);
	}
	
	
	
}
