package it.erica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.boglia.entities.Studente;
import it.erica.repos.StudenteDAO;

@Service
public class StudenteServiceImpl implements StudenteService{
	
	@Autowired
	private StudenteDAO dao;
	
	@Override
	public List<Studente> getStudenti() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Studente addStudente(Studente s) {
		
		return dao.save(s);
	}

}
