package services;

import java.util.List;

import model.Libri;
import repos.LibriDAO;
import repos.LibriDAOimpl;

public class LibriServicesImpl implements LibriService {
	
	LibriDAO dao = new LibriDAOimpl();

	@Override
	public List<Libri> getLibri() {
		
		return dao.findAll();
	}

	@Override
	public void addLibro(Libri l) {
		dao.addLibro(l);

	}

}
