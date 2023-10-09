package it.erica.services;

import java.util.List;

import it.erica.entities.Artista;

public interface ArtistaService {
	List<Artista> getAll();
	Artista getById(int id);
	Artista add(Artista a);
}
