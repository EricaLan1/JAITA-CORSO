package it.erica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.erica.entities.Biglietto;
import it.erica.repos.BigliettoDAO;

@Service
public class BigliettoServiceImpl implements BigliettoService {
	@Autowired
	BigliettoDAO dao;
	
	@Override
	public List<Biglietto> getall() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Biglietto getById(int id) {
		// TODO Auto-generated method stub
		return dao.getReferenceById(id);
	}

	@Override
	public Biglietto add(Biglietto b) {
		// TODO Auto-generated method stub
		return dao.save(b);
	}

}
