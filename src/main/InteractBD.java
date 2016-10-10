package main;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
	
	public int executeUpdate (String url,String query, Object... parameters) throws SQLException {
		
		try (Connection conn = connect(url)) {
				PreparedStatement st = conn.prepareStatement(query);
				
//				for(int i=0; i<parameters.length;i++){
//					if(parameters[i] instanceof String)
//						st.setString(i+1, (String) parameters[i]);
//					else if(parameters[i] instanceof Integer)
//						st.setInt(i+1, (Integer) parameters[i]);
//				}
				for(int i=0; i<parameters.length;i++){
					st.setObject(i+1, parameters[i]);
				}
					
				st.executeUpdate();
			} catch (SQLException e) {
				System.out.println("SQLException: " + e.getMessage());
		        System.out.println("SQLState:     " + e.getSQLState());
		        System.out.println("VendorError:  " + e.getErrorCode());
		        e.printStackTrace();
			} 

		
		return 0;
		
	}

}
