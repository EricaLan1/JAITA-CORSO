package it.erica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.erica.entities.Film;
import it.erica.entities.FilmInSala;
import it.erica.repos.FilmInSalaDAO;

@Service 
public class FilmInSalaServiceImpl implements FilmInSalaService {

	@Autowired
	FilmInSalaDAO dao;

	@Override
	public List<FilmInSala> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public FilmInSala getById(int id) {
		// TODO Auto-generated method stub
		return dao.getReferenceById(id);
	}

	@Override
	public FilmInSala add(FilmInSala c) {
		// TODO Auto-generated method stub
		return dao.save(c);
	}

	@Override
	public List<FilmInSala> findByFilm(Film f) {
		// TODO Auto-generated method stub
		return dao.findByFilm(f);
	}
	
	
	
}
