package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import model.Todo;

public class TodoDatabase {
	private final String HOST = "jdbc:mysql://localhost:3306/generation";
	private final String USER = "app_java";
	private final String PASS = "java_2023!";
	
	private Connection conn;
	
	public void connetti() {
	
	try {
		this.conn = DriverManager.getConnection(HOST, USER, PASS);
		System.out.println("Connessi al DB");
		
	}catch (SQLException e) {
		
		System.err.println("Si e' verificato un errore nella connesione al db: "+ e.getMessage());	
		
	}
}

	
	public void addTodo(String descrizione) {
		try {
			Todo t = new Todo(descrizione);
			Statement stat = conn.createStatement();
			
			String querySql = "Insert into todo(data,descrizione,fatto) values('"+ t.getData()+"','" +t.getDescrizione()+"', 0)";
			stat.execute(querySql);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}