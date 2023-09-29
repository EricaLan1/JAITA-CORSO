package services;

import java.util.List;

import model.Canzone;
import repos.CanzoneDAO;
import repos.CanzoneDAOimpl;

public class CanzoneServiceImpl implements CanzoneService {

	CanzoneDAO dao = new CanzoneDAOimpl();
	
	@Override
	public List<Canzone> getCanzoni() {
		
		return dao.findAll();
	}

	@Override
	public void addCanzone(Canzone c) {
		dao.addCanzone(c);
	}

}