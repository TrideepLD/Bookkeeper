package examples.pubhub.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import examples.pubhub.dao.BookDAO;
import examples.pubhub.dao.BookDAOImpl;
import examples.pubhub.dao.TagDAO;
import examples.pubhub.dao.TagDAOImpl;

public class DAOUtilities {
	
	private static final String CONNECTION_USERNAME = "postgres";
	private static final String CONNECTION_PASSWORD = "password1!";
	private static final String URL = "jdbc:mysql://localhost:3306/?user=root";
	private static Connection connection;
	
	public static synchronized Connection getConnection_1() throws SQLException {
		if (connection == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("Could not register driver!");
				e.printStackTrace();
			}
			connection = DriverManager.getConnection(URL, CONNECTION_USERNAME, CONNECTION_PASSWORD);
		}
		
		//If connection was closed then retrieve a new connection
		if (connection.isClosed()){
			System.out.println("Opening new connection...");
			connection = DriverManager.getConnection(URL, CONNECTION_USERNAME, CONNECTION_PASSWORD);
		}
		return connection;
	}
	
	public static BookDAO getBookDAO() {
		return new BookDAOImpl();
	}
	
	public static TagDAO getTagDAO() {
		return new TagDAOImpl();
	}
	
	public static Connection getConnection_2() throws Exception {
    	
    	try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://127.0.0.1:3306/?user=postgres"; //my localhost port connection, can also use 127.0.0.1
			String username = "postgres";
			String password = "password1!";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established"); // Have this to check if connection works.
			return conn;
		} catch (Exception e) {
			System.out.println(e);
		}
    	
    	return null;
    }
	
}