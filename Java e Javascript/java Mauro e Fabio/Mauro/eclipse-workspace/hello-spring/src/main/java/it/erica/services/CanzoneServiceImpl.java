package it.erica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.erica.entities.Canzone;
import it.erica.repos.CanzoneDAO;

@Service
public class CanzoneServiceImpl implements CanzoneService {
	
	@Autowired //Collegamento automatico all'oggetto 
	CanzoneDAO dao;
	
	@Override
	public List<Canzone> getCanzone() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Canzone addCanzone(Canzone c) {
		// TODO Auto-generated method stub
		return dao.save(c);
	}
	
	@Override
	public Canzone updateCanzone (Canzone c) {
		// TODO Auto-generated method stub
		return dao.save(c);
	}
}
