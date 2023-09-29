package repos;

import java.util.List;

import model.Libri;

public interface LibriDAO {
	String FIND_ALL = "SELECT * FROM libri3";
	String FIND_BY_ID = "SELECT * FROM libri3 WHERE id = ?";
	String ADD = "INSERT INTO libri3 (titolo, prezzo, pagine) VALUES (?,?,?)";
	String UPDATE = "UPDATE libri3 SET titolo=?, prezzo=?, pagine=? WHERE id = ?";
	String DELETE_BY_ID = "DELETE FROM canzoni WHERE id = ?";

	List<Libri> findAll();
	Libri findById(int id);
	void addLibro(Libri l);
	void updateLibro(Libri l);
	void deleteLibro(int id);
}

