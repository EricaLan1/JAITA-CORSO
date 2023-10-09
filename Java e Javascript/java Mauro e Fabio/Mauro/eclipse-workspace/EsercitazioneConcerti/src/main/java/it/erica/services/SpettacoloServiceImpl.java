package it.erica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.erica.entities.Spettacolo;
import it.erica.repos.SpettacoloDAO;

@Service
public class SpettacoloServiceImpl implements SpettacoloService {

	
	@Autowired
	SpettacoloDAO dao;
	
	
	@Override
	public List<Spettacolo> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Spettacolo getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Spettacolo add(Spettacolo p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

}
