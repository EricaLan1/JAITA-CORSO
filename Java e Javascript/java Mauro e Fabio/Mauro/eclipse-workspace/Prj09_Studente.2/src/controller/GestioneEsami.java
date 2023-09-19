package controller;

import java.util.ArrayList;
import java.util.Collections;

import database.StudentiDB;
import model.Esame;
import model.Materia;
import model.Studente;
import view.ViewRegistro;

public class GestioneEsami {

	private ArrayList<Studente> studenti;
	private ArrayList<Materia> insegnamenti;
	private ArrayList<Esame> esami;
	
	private StudentiDB db;
	
	
	public GestioneEsami() {
		this.studenti = new ArrayList<>();
		this.insegnamenti= new ArrayList<>();
		this.esami = new ArrayList<>();
		this.db = new StudentiDB();
	}
	
	public void inizializzaDalDatabase() {
		this.db.inizializza();
		;
		System.out.println(this.db.getStudenti());
	}
	
	public void addStudente(Studente s) {
		this.studenti.add(s);//aggiunge uno studente alla collezione
	}
	
	public void addMateria(Materia m) {
		this.insegnamenti.add(m);
	}
	
	public void addEsame(Esame e) {
		this.esami.add(e);
	}

	public ArrayList<Studente> getStudenti() {
		Collections.sort(studenti);
		return studenti;
	}

	public ArrayList<Materia> getInsegnamenti() {
		return insegnamenti;
	}

	public ArrayList<Esame> getEsami() {
		return esami;
	}
	
	public String stampaStudente(Studente s) {
		ViewRegistro view = new ViewRegistro();
		return view.stampaStudente(s);
	}
	
	
	
	
	
}