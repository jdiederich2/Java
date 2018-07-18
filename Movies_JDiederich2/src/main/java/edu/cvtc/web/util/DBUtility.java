/**
 * 
 */
package edu.cvtc.web.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Jennifer Diederich
 *
 */
public class DBUtility {
	
	public static final int TIMEOUT = 30;
	
	// Create driver
	private static final String DRIVER_NAME = "org.sqlite.JDBC";
	
	// Map to DB 
	private static final String CONNECTION = "jdbc:sqlite:movie.db";
	
	// Create connection
	public static Connection createConnection() throws ClassNotFoundException, SQLException {
		
		// Register driver for use
		Class.forName(DRIVER_NAME);
		
		// Create DB connection
		return DriverManager.getConnection(CONNECTION);
	}
	
	public static void closeConnections(final Connection connection, final Statement statement) {
		try {
			if (connection != null) {
				connection.close();
			}
			if (statement != null) {
				statement.close();
			}
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}
}
