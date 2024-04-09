package recipies.dao;
import java.sql.*;
import recipies.exception.DbException;

/**
 * 
 * @author marcy
 *
 */
public class DbConnection {
	private static String HOST = "localhost";
	private static String PASSWORD = "recipies";
	private static int PORT = 3306;
	private static String SCHEMA = "recipies";
	private static String USER = "recipies";

	
	/**
	 * 
	 * @return Connection to the projects database
	 * @throws DbException If unable to connect to the database
	 */
	public Connection getConnection() throws DbException{
		String url = 
				String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false", 
						HOST,PORT,SCHEMA,USER,PASSWORD);
		
		System.out.println("Connecting to " + url);
		
		try {
			Connection conn = DriverManager.getConnection(url);
			System.out.println("Connection to " + SCHEMA + " was succsessful");
			return conn;
		} catch (SQLException e) {
			System.out.println("Connection to " + SCHEMA + " failed");
			throw new DbException("Unable to get connection to " + url);
		} 	
	}
}
