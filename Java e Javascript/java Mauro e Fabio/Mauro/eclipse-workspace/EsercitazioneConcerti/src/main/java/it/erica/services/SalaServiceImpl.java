package it.erica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.erica.entities.Sala;
import it.erica.repos.SalaDao;

@Service
public class SalaServiceImpl implements SalaService {
	
	@Autowired
	SalaDao dao;
	
	@Override
	public List<Sala> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Sala getById(int id) {
		// TODO Auto-generated method stub
		return dao.getReferenceById(id);
	}

	@Override
	public Sala add(Sala s) {
		// TODO Auto-generated method stub
		return dao.save(s);
	}

}
