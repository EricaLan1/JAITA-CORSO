package it.erica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.erica.entities.Artista;
import it.erica.repos.ArtistaDAO;

@Service
public class ArtistaServiceImpl implements ArtistaService {
	
	@Autowired
	ArtistaDAO dao;
	
	@Override
	public List<Artista> getAll() {
		
		return dao.findAll();
	}

	@Override
	public Artista getById(int id) {
		// TODO Auto-generated method stub
		return dao.getReferenceById(id);
	}

	@Override
	public Artista add(Artista a) {
		// TODO Auto-generated method stub
		return dao.save(a);
	}

}
