package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInitialize {

	public static Statement statement;

	public void DBInitialize()
			throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {

		System.out.println("01");
		// Load the JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		System.out.println("02");
		// Connect to a database

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/posapp", "root", "root");
			System.out.println("03");
			if (connection != null) {
				System.out.println("Connection Established");
			} else {
				System.out.println("Connection Failed");
			}
			statement = connection.createStatement();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Execute a statement
	}

}
