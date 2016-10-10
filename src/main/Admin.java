package main;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Admin {
	
	private InteractBD database;
	private Connection connection;

	public Admin(String url) {
		database = new InteractBD();
		try {
			connection = database.connect(url);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
