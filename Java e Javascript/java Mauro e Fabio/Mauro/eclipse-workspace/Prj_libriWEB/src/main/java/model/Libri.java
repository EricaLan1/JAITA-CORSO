package model;

public class Libri {
	private int id;
	private String titolo;
	private String prezzo;
	private String pagine;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(String prezzo) {
		this.prezzo = prezzo;
	}
	public String getPagine() {
		return pagine;
	}
	public void setPagine(String pagine) {
		this.pagine = pagine;
	}
	@Override
	public String toString() {
		return "Libri [id=" + id + ", titolo=" + titolo + ", prezzo=" + prezzo + ", pagine=" + pagine + "]";
	}
	
	
	
}
