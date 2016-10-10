package main;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class InteractBD {
	
	private final String LOGIN = "r21101999";
	private final String PASSWD = "5Gf;wh";

	public InteractBD() {}
	
	public Connection connect(String url) throws SQLException{
		Connection conn = (Connection) DriverManager.getConnection(url, LOGIN, PASSWD);
		return conn;
	}
	
	public void deconnect(Connection conn) throws SQLException{
		conn.close();
	}
	
	public boolean isConnected(Connection conn) throws SQLException{
		return ! conn.isClosed();
	}

}
