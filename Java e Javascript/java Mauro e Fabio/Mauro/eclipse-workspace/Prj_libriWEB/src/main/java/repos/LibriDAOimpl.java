package repos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Libri;

public class LibriDAOimpl implements LibriDAO {
	
	Collegamento db = new Collegamento();
	PreparedStatement ps;
	ResultSet rs;

	@Override
	public List<Libri> findAll() {
		List<Libri> libri = new ArrayList<>();
		try {
			this.ps = this.db.getConnessione().prepareStatement(FIND_ALL);
			this.rs = this.ps.executeQuery();
			
			while (this.rs.next()) {
				int id = rs.getInt(1);
				String titolo = rs.getString("titolo");
				double prezzo = rs.getDouble("prezzo");
				int pagine = rs.getInt("pagine");
				
				Libri l = new Libri();
				l.setId(id);
				l.setTitolo(titolo);
				l.setPrezzo(prezzo);
				l.setPagine(pagine);
				
				libri.add(l);
				
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return libri;
	}

	@Override
	public Libri findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addLibro(Libri l) {
		try {
			this.ps = this.db.getConnessione().prepareStatement(ADD);
			this.ps.setString(1, l.getTitolo());
			this.ps.setDouble(2, l.getPrezzo());
			this.ps.setInt(3, l.getPagine());
			this.ps.execute();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateLibro(Libri l) {
		
		
	}

	@Override
	public void deleteLibro(int id) {
		
		
	}
	
}
