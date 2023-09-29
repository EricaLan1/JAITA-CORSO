package services;

import java.util.List;

import model.Libri;

public interface LibriService {
	List<Libri> getLibri();
	void addLibro (Libri l);
}
